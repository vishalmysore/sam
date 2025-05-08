package io.github.vishalmysore.example.noprotocol;

import com.t4a.processor.scripts.ScriptCallback;
import com.t4a.processor.scripts.ScriptResult;
import com.t4a.processor.scripts.SeleniumScriptProcessor;

public class SeleniumScriptExample {
    public static void main(String[] args) {
        SeleniumScriptProcessor processor = new SeleniumScriptProcessor();
        ScriptCallback callback = new ScriptCallback() {

            public void onScriptComplete(ScriptResult result) {
                System.out.println(result);
            }

            @Override
            public String lineResult(String result) {
                return null;
            }
        };
        ScriptResult result= processor.process("web.action");
    }
}
