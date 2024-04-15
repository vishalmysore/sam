package org.example.image;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiImageActionProcessor;
import com.t4a.processor.GeminiV2ActionProcessor;

public class ImageActionExample {
    public static void main(String[] args) throws AIProcessingException {
        GeminiImageActionProcessor processor = new GeminiImageActionProcessor();
        String imageDisription = processor.imageToText(args[0]);
        GeminiV2ActionProcessor actionProcessor = new GeminiV2ActionProcessor();
        Object obj = actionProcessor.processSingleAction(imageDisription);
        String str  = actionProcessor.summarize(imageDisription+obj.toString());
        System.out.println(str);
    }
}
