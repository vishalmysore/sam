package org.example.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;

import lombok.extern.java.Log;
import org.example.pojo.RestaurantPojo;

@Log
@Predict(actionName = "addRestaurantDetails",description = "saves the information in local file")
public class AddRestaurantAction implements JavaMethodAction {
    public String addRestaurantDetails(RestaurantPojo pojo){
        log.info(pojo.toString());
        return "success";
    }
}
