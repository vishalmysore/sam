package org.example.script;



import com.t4a.processor.AIProcessingException;

import com.t4a.processor.OpenAiActionProcessor;
import com.t4a.processor.scripts.ScriptProcessor;
import com.t4a.processor.scripts.ScriptResult;
import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
@Log
public class ProcessScriptSimple {
    public static void main(String[] args) {
        ScriptProcessor script = new ScriptProcessor(new OpenAiActionProcessor());
        ScriptResult result= script.process("test.action");
        log.info(script.summarize(result));
    }


}
