package org.example;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiActionProcessor;
import com.t4a.processor.GeminiV2ActionProcessor;
import lombok.extern.java.Log;
import org.example.actions.GoogleSearchAction;

@Log
public class GeminiActionExample {
    public static void main(String[] args) throws AIProcessingException {

        String promptSaveText = "My friends name is Vishal ,he lives in toronto.I want save this info locally ";

        String weatherPrompt = "Hey I am in Toronto do you think i can go out without jacket";
        String getABook = "get me details on book harry poster with id 189 ";
        String postABook = "post a book harry poster with id 189 the publish date is 2024-03-22 and the description is about harry who likes poster its around 500 pages  ";

        String cookPromptSingleText = "My friends name is Vishal ," +
                "I dont know what to cook for him today.";
        String writePrmt = "my friends name is Vishal  , he lives in toronto , save this information to file";
        GeminiV2ActionProcessor processor = new GeminiV2ActionProcessor();
        String result = (String)processor.processSingleAction(writePrmt);
        log.info(result);
        result = (String)processor.processSingleAction("find me info about indian food on internet",new GoogleSearchAction());
        log.info(result);

        //OpenAiActionProcessor opeAIprocessor = new OpenAiActionProcessor();
        //String result = (String)opeAIprocessor.processSingleAction(weatherPrompt);
       // System.out.println(result);

      /*  List<Object> results = processor.processMultipleAction("Hey I am in Toronto do you think i can go out without jacket.  please save this information locally ",2);
        for (Object resultObj:results
       ) {
            log.info((String)resultObj);

        }

*/
    }
}