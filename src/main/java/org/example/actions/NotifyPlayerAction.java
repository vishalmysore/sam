package org.example.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;

import lombok.extern.java.Log;
import org.example.pojo.Player;

@Log
@Predict
public class NotifyPlayerAction  {
    @Action(description = "send email to player")
    public String notifyPlayer(Player player) {
        log.info(player.toString());
        return "notified";
    }
}
