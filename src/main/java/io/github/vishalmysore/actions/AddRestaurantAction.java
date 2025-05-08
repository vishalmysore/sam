package io.github.vishalmysore.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;


import lombok.extern.java.Log;
import io.github.vishalmysore.pojo.RestaurantPojo;

@Log
@Agent (groupName = "restaurant", groupDescription = "Restaurant Agent for getting details etc")
public class AddRestaurantAction  {
    @Action
    public String addRestaurantDetails(RestaurantPojo pojo){
        log.info(pojo.toString());
        return "success";
    }
}
