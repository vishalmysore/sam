package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.t4a.predict.GeminiPromptTransformer;
import com.t4a.predict.PromptTransformer;
import com.t4a.processor.AIProcessingException;
import lombok.extern.java.Log;
import org.example.util.DateDeserializer;

import java.util.Date;

/**
 * This example demonstrates converting prompt to pojos and json strings
 */
@Log
public class PojoExample {
    public static void main(String[] args) throws AIProcessingException {
        PromptTransformer builder = new GeminiPromptTransformer();

        String promptTxt ="Sachin Tendulkar is very good cricket player, " +
                           "he joined the sports on 24032022, he has played 300 matches " +
                           "and his max score is 400";
        //Convert the prompt to Pojo
        Player player = (Player)builder.transformIntoPojo(promptTxt, Player.class.getName(),"Player","create player pojo");
        log.info(player.toString());

        promptTxt = "can you book Maharaja restaurant in " +
                 "Toronto for 4 people on 12th may , I am Vishal ";
        //Convert the prompt to Complex Pojo
        RestaurantPojo pojo = (RestaurantPojo)builder.transformIntoPojo(promptTxt, RestaurantPojo.class.getName(),"RestaurantPojo","Build the pojo for restaurant");
        log.info(pojo.toString());

        //Using Custom GSON to convert special values
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer("dd MMMM yyyy"));
        Gson gson = gsonBuilder.create();
        PromptTransformer customBuilder = new GeminiPromptTransformer(gson);
        String prompt = "Sachin Tendulkar is very good cricket player, he joined the sports on 12 May 2008," +
                         "he has played 300 matches and his max score is 400";
        player = (Player)customBuilder.transformIntoPojo(prompt, Player.class.getName(),"Player","create player pojo");
        log.info(player.toString());

        prompt = "Sachin Tendulkar is very good cricket player, he joined the sports on 12 May 2008," +
                "he has played 300 matches and his max score is 400";
        //Extract Json from the prompt
        String jsonString = "{\"lastName\":\"String\",\"firstName\":\"String\"}";
        jsonString = builder.transformIntoJson(jsonString,prompt,"player","get player details");
        log.info(jsonString);

        //Extract Json from the prompt
        jsonString = "{\"sportType\":\"String\",\"skillLevel\":\"String\"}";
        jsonString = builder.transformIntoJson(jsonString,prompt,"player","get player details");
        log.info(jsonString);


        jsonString = "{\"name\":\"String\",\"age\":\"number\",\"address\":{\"street\":\"String\",\"city\":\"String\",\"zip\":\"int\"},\"contacts\":[{\"type\":\"string\",\"value\":\"String\"},{\"type\":\"string\",\"value\":\"string\"}]}";
        prompt = "Can you make sure you add this info about my friend John Doe, aged 30, lives at 123 Main St in New York, zip code 10001. He can be reached via email at john@example.com or by phone at 555-1234.";
        jsonString = builder.transformIntoJson(jsonString,prompt,"MyFriend","get friend details");
        log.info(jsonString);
    }
}
