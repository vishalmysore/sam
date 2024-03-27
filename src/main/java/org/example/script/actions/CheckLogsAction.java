package org.example.script.actions;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;

@Predict(actionName = "findTextInLogs", description = " Finds a particular text in Logs")
public class CheckLogsAction implements JavaMethodAction {
    public String findTextInLogs(String textToFind, String logName) {
        return " Found the text "+textToFind;
    }
}
