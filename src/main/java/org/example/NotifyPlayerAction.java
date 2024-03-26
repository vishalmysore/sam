package org.example;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;
import lombok.extern.java.Log;

@Log
@Predict(actionName = "notifyPlayer",description = "send email to player")
public class NotifyPlayerAction implements JavaMethodAction {
    public String notifyPlayer(Player player) {
        log.info(player.toString());
        return "notified";
    }
}
