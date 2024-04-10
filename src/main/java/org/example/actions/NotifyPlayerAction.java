package org.example.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;

import lombok.extern.java.Log;
import org.example.pojo.Player;

@Log
@Predict(actionName = "notifyPlayer",description = "send email to player")
public class NotifyPlayerAction implements JavaMethodAction {
    public String notifyPlayer(Player player) {
        log.info(player.toString());
        return "notified";
    }
}
