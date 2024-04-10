package org.example.script.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict(actionName = "checkLogs", description = " Finds a particular text in Logs")
public class CheckLogsAction implements JavaMethodAction {
    public String checkLogs(String textToFind, String logName, String applicationName) {
        return " Found the text "+textToFind;
    }
}
