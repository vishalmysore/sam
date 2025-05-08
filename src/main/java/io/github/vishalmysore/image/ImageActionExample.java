package io.github.vishalmysore.image;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiImageActionProcessor;
import com.t4a.processor.GeminiV2ActionProcessor;
import lombok.extern.java.Log;

@Log
public class ImageActionExample {
    public static void main(String[] args) throws AIProcessingException {
        GeminiImageActionProcessor processor = new GeminiImageActionProcessor();
        String imageDisription = processor.imageToText(
                GeminiImageExample.class.getClassLoader().getResource("images/bus.png")
        );
        log.info(imageDisription);
        GeminiV2ActionProcessor actionProcessor = new GeminiV2ActionProcessor();
        Object obj = actionProcessor.processSingleAction(imageDisription);
        String str  = actionProcessor.summarize(imageDisription+obj.toString());
        log.info(str);

    }


}
