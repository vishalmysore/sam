package org.example.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;

import lombok.extern.java.Log;
import org.example.pojo.Player;
import org.example.pojo.RestaurantPojo;

@Log
@Predict(actionName = "notifyPlayerAndRestaurant",description = "send email to player")
public class PlayerWithRestaurantAction implements JavaMethodAction {
    public String notifyPlayerAndRestaurant(Player player, RestaurantPojo restaurantPojo) {
        log.info(player.toString());
        log.info(restaurantPojo.toString());
        return "notified";
    }
}