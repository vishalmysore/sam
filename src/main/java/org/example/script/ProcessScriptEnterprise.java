package org.example.script;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.ActionProcessor;

import com.t4a.processor.scripts.ScriptProcessor;
import com.t4a.processor.scripts.ScriptResult;
import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
@Log
public class ProcessScriptEnterprise {
    public static void main(String[] args) throws AIProcessingException {
       ScriptProcessor script = new ScriptProcessor();
       ScriptResult result =  script.process("enterprise.action");
       log.info(script.summarize(result));

    }
}

