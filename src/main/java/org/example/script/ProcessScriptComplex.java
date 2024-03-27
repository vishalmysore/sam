package org.example.script;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.ActionProcessor;
import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Log
public class ProcessScriptComplex {
    public static void main(String[] args) throws AIProcessingException {
        ActionProcessor processor = new ActionProcessor();
        //log.info((String)processor.processSingleAction(" book the sight seeing attraction called peanut palace"));
         ProcessScriptComplex script = new ProcessScriptComplex();
        script.process();

    }

    public void process() {
        try (InputStream is = ProcessScriptComplex.class.getClassLoader().getResourceAsStream("complexTest.action");
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            ActionProcessor processor = new ActionProcessor();
            String line;
            String previousResult = null;
            while ((line = reader.readLine()) != null) {
                if(previousResult != null) {
                    line = line + ":- Here is additional information - " + previousResult;

                }
                log.info(line);
                if(previousResult == null )
                    previousResult = "";
                previousResult = previousResult + (String) processor.processSingleAction(line);
                log.info(previousResult);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            log.info("Resource file not found. Make sure the file path is correct.");
        } catch (AIProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
