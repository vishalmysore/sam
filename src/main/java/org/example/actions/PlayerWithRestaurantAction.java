package org.example.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;

import lombok.extern.java.Log;
import org.example.pojo.Player;
import org.example.pojo.RestaurantPojo;

@Log
@Predict
public class PlayerWithRestaurantAction {
    @Action(description = "send email to player and restaurant")
    public String notifyPlayerAndRestaurant(Player player, RestaurantPojo restaurantPojo) {
        log.info(player.toString());
        log.info(restaurantPojo.toString());
        return "notified";
    }
}