package org.example.script.actions;

import com.t4a.api.ActionRisk;
import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;

/**
 * Making the risk level as HIGH to demonstrate it cannot be called without explicit mention by Human Operator
 */
@Predict(actionName = "restartApplication",description = "will be used to restart the server" )
public class ServerRestartAction implements JavaMethodAction {
    public String restartApplication(String reasonForRestart, String requestedBy, String appName) {
        return " Server has been restarted by "+requestedBy+" due to following reason "+reasonForRestart+" for application "+appName;
    }
}

