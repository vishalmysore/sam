package io.github.vishalmysore.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;


import lombok.extern.java.Log;
import io.github.vishalmysore.pojo.Player;
import io.github.vishalmysore.pojo.RestaurantPojo;

@Log
@Agent(groupName = "Palyer and restaurant", groupDescription = "Player and restaurant agent")
public class PlayerWithRestaurantAction {
    @Action(description = "send email to player and restaurant")
    public String notifyPlayerAndRestaurant(Player player, RestaurantPojo restaurantPojo) {
        log.info(player.toString());
        log.info(restaurantPojo.toString());
        return "notified";
    }
}