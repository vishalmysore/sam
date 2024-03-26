package org.example;

import com.t4a.api.JavaMethodAction;
import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;
import lombok.extern.java.Log;

@Log
@Predict(actionName = "notifyPlayerAndRestaurant",description = "send email to player")
public class PlayerWithRestaurantAction implements JavaMethodAction {
    public String notifyPlayerAndRestaurant(Player player, RestaurantPojo restaurantPojo) {
        log.info(player.toString());
        log.info(restaurantPojo.toString());
        return "notified";
    }
}