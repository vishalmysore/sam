package org.example.image;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.ContentMaker;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.PartMaker;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import com.t4a.predict.PredictionLoader;
import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiImageActionProcessor;
import com.t4a.processor.GeminiV2ActionProcessor;
import lombok.extern.java.Log;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

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
