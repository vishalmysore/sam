package org.example.script;



import com.t4a.processor.AIProcessingException;
import com.t4a.processor.ActionProcessor;
import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
@Log
public class ProcessScriptSimple {
    public static void main(String[] args) {
        ProcessScriptSimple script = new ProcessScriptSimple();
        script.process();
    }

    public void process() {
        try (InputStream is = ProcessScriptSimple.class.getClassLoader().getResourceAsStream("test.action");
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            ActionProcessor processor = new ActionProcessor();
            String line;
            String previousResult = null;
            while ((line = reader.readLine()) != null) {
                log.info(line);
                if(previousResult != null)
                    line = line + " Here is additional information - "+previousResult;
                previousResult = (String) processor.processSingleAction(line);

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
