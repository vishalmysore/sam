package org.example;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.Content;
import com.google.cloud.vertexai.api.FunctionDeclaration;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.api.Tool;
import com.google.cloud.vertexai.generativeai.*;
import com.t4a.action.BlankAction;
import com.t4a.api.AIAction;
import com.t4a.api.JavaMethodExecutor;
import com.t4a.predict.PredictionLoader;
import lombok.extern.java.Log;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
@Log
public class Main {
    public static void main(String[] args) throws IOException {

        String projectId = "cookgptserver";
        String location = "us-central1";
        String modelName = "gemini-1.0-pro";
        String promptText = "My friends name is Vishal , I am wondering what to cook for him today";
        StringBuffer list = PredictionLoader.getInstance(projectId, location, modelName).getActionNameList();
        System.out.println(list.toString());
        try (VertexAI vertexAI = new VertexAI(projectId, location)) {
            AIAction predictedAction = PredictionLoader.getInstance(projectId, location, modelName).getPredictedAction(promptText);
            log.info(predictedAction.getActionName());
            JavaMethodExecutor methodAction = new JavaMethodExecutor();

            FunctionDeclaration weatherFunciton = methodAction.buildFunciton(predictedAction);

            log.info("Function declaration h1:");
            log.info("" + weatherFunciton);

            JavaMethodExecutor additionalQuestion = new JavaMethodExecutor();
            BlankAction blankAction = new BlankAction();
            FunctionDeclaration additionalQuestionFun = additionalQuestion.buildFunciton(blankAction);
            log.info("Function declaration h1:");
            log.info("" + additionalQuestionFun);
            //add the function to the tool
            Tool tool = Tool.newBuilder()
                    .addFunctionDeclarations(weatherFunciton).addFunctionDeclarations(additionalQuestionFun)
                    .build();


            GenerativeModel model =
                    GenerativeModel.newBuilder()
                            .setModelName(modelName)
                            .setVertexAi(vertexAI)
                            .setTools(Arrays.asList(tool))
                            .build();
            ChatSession chat = model.startChat();

            log.info(String.format("Ask the question 1: %s", promptText));
            GenerateContentResponse response = chat.sendMessage(promptText);

            log.info("\nPrint response 1 : ");
            log.info("" + ResponseHandler.getContent(response));
            log.info(methodAction.getPropertyValuesJsonString(response));

            Object obj = methodAction.action(response, predictedAction);
            log.info("" + obj);

            Content content =
                    ContentMaker.fromMultiModalData(
                            PartMaker.fromFunctionResponse(
                                    predictedAction.getActionName(), Collections.singletonMap(predictedAction.getActionName(), obj)));


            response = chat.sendMessage(content);

            log.info("Print response content: ");
            log.info("" + ResponseHandler.getContent(response));
            log.info(ResponseHandler.getText(response));

        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}