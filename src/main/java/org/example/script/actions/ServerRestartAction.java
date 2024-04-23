package org.example.script.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.api.ActionRisk;
import com.t4a.api.JavaMethodAction;


/**
 * Making the risk level as HIGH to demonstrate it cannot be called without explicit mention by Human Operator
 */
@Predict()
public class ServerRestartAction  {
    @Action(description = "This action will be called in case of restarting the server")
    public String restartApplication(String reasonForRestart, String requestedBy, String appName) {
        return " Server has been restarted by "+requestedBy+" due to following reason "+reasonForRestart+" for application "+appName;
    }
}

