package io.github.vishalmysore.webtesting;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiImageActionProcessor;
import lombok.extern.java.Log;

@Log
public class GuiValidationExample {
    public static void main(String[] args) throws AIProcessingException {
        GeminiImageActionProcessor processor = new GeminiImageActionProcessor();
        String imageDisription = processor.imageToText(GuiValidationExample.class.getClassLoader().getResource("images/auto.PNG"), "what is value for full inspection");
        log.info(imageDisription);


    }

}
