package org.example;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.OpenAiActionProcessor;
import lombok.extern.java.Log;
import org.example.actions.AddRestaurantAction;

@Log
public class OpenAIActionExample {
    public static void main(String[] args) throws AIProcessingException {
        OpenAiActionProcessor processor = new OpenAiActionProcessor();
        String promptTxt ="Sachin Tendulkar is very good cricket player, " +
                "he joined the sports on 24032022, he has played 300 matches " +
                "and his max score is 400. Can you send him a congratulations email";
        String response = (String)processor.processSingleAction(promptTxt);
        response = processor.query(promptTxt,response);
        log.info(response);


        promptTxt = "Sachin Tendulkar is very good cricket player, \" +\n" +
                "                \"he joined the sports on 24032022, he has played 300 matches \" +\n" +
                "                \"and his max score is 400." +
                "can you book Maharaja restaurant in " +
                "Toronto for Sachin Tendulkar and 4 people on 12th may. Please notify him and the restaurant ";
        response = (String)processor.processSingleAction(promptTxt);
        log.info(response);

        promptTxt ="Maharaja restaurant in \" +\n" +
                "                \"Toronto for Sachin Tendulkar and 4 people on 12th may";
        response = (String)processor.processSingleAction(promptTxt, new AddRestaurantAction());
        log.info(response);

    }
}
