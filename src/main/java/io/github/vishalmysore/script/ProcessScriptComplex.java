package io.github.vishalmysore.script;

import com.t4a.processor.AIProcessingException;


import com.t4a.processor.scripts.ScriptProcessor;
import com.t4a.processor.scripts.ScriptResult;
import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Log
public class ProcessScriptComplex {
    public static void main(String[] args) throws AIProcessingException {
        log.info("starting");
        ScriptProcessor script = new ScriptProcessor();
        ScriptResult result =  script.process("complexTest.action");
        log.info(script.summarize(result));

    }

}
