package org.example.script.actions;

import com.t4a.api.ActionRisk;
import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;

/**
 * Making the risk level as HIGH to demonstrate it cannot be called without explicit mention by Human Operator
 */
@Predict(actionName = "restartTheECOMServer",description = "will be used to restart the server" , riskLevel = ActionRisk.HIGH)
public class ServerRestartAction implements JavaMethodAction {
    public String restartTheECOMServer(String reasonForRestart, String requestedBy) {
        return " Server has been restarted by "+requestedBy+" due to following reason "+reasonForRestart;
    }
}

