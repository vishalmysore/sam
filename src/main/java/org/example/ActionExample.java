package org.example;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.ActionProcessor;
import com.t4a.processor.LoggingHumanDecision;
import com.t4a.processor.LogginggExplainDecision;
import lombok.extern.java.Log;

@Log
public class ActionExample {
    public static void main(String[] args) throws AIProcessingException {
        ActionProcessor processor = new ActionProcessor();
        String multiPrmpt = "hey I am in Toronto do you think i can go out without jacket," +
                " also save the weather information , City location and your suggestion in file, " +
                "also include places to see";
        String processed = processor.processMultipleActionDynamically
                (multiPrmpt,
                        new LoggingHumanDecision(),
                        new LogginggExplainDecision());
        log.info(processed);
    }
}
