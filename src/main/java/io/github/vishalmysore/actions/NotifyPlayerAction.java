package io.github.vishalmysore.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;


import lombok.extern.java.Log;
import io.github.vishalmysore.pojo.Player;

@Log
@Agent(groupName = "player", groupDescription = "Player and sports related action")
public class NotifyPlayerAction  {
    @Action(description = "send email to player")
    public String notifyPlayer(Player player) {
        log.info(player.toString());
        return "notified";
    }
}
