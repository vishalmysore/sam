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
import com.t4a.predict.Predict;
import com.t4a.predict.PredictionLoader;
import com.t4a.processor.ActionProcessor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Log
public class Main {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {

        String projectId = "cookgptserver";
        String location = "us-central1";
        String modelName = "gemini-1.0-pro";
        String promptSaveText = "My friends name is Vishal ,he lives in tornto.I want save this info locally ";
        String cookPromptSingleText = "My friends name is Vishal ,I dont know what to cook for him today.";
        String cookPromptText = "My friends name is Vishal ,I dont know what to cook for him today. Also I want to take him out to park today";
        String weatherPrompt = "Hey I am in Toronto do you think i can go out without jacket";

        ActionProcessor processor = new ActionProcessor();
        String result = (String)processor.processSingleAction("cookgptserver","us-central1","gemini-1.0-pro",promptSaveText);
        log.info(result);

        List<Object> results = processor.processMultipleAction("cookgptserver","us-central1","gemini-1.0-pro","ey I am in Toronto do you think i can go out without jacket, my friends name is Vinod he lives in Balaghat, please save this information locally ",2);
        for (Object resultObj:results
       ) {
            log.info((String)resultObj);

        }


    }
}