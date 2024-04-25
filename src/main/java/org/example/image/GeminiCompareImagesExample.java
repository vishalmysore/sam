package org.example.image;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiImageActionProcessor;
import lombok.extern.java.Log;

@Log

public class GeminiCompareImagesExample {
    public static void main(String[] args) throws AIProcessingException {
        GeminiImageActionProcessor processor = new GeminiImageActionProcessor();
        String differences =  processor.compareImages
                   (GeminiCompareImagesExample.class.getClassLoader().getResource("images/wolf1.PNG"),
                           GeminiCompareImagesExample.class.getClassLoader().getResource("images/wolf2.PNG"), "compare both the images");
        log.info(differences);
    }
}
