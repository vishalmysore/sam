package io.github.vishalmysore.example.noprotocol;

import com.t4a.processor.AIProcessingException;


import com.t4a.processor.GeminiV2ActionProcessor;
import lombok.extern.java.Log;
import io.github.vishalmysore.actions.AddRestaurantAction;

/**
 * This will create the Player Pojo in real time and call the action
 */
@Log
public class ComplexActionExample {
    public static void main(String[] args) throws AIProcessingException {
        GeminiV2ActionProcessor processor = new GeminiV2ActionProcessor();
        String promptTxt ="Sachin Tendulkar is very good cricket player, " +
                "he joined the sports on 24032022, he has played 300 matches " +
                "and his max score is 400. Can you send him a congratulations email";
        String response = (String)processor.processSingleAction(promptTxt);
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
