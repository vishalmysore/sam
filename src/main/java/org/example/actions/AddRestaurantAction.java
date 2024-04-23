package org.example.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;

import lombok.extern.java.Log;
import org.example.pojo.RestaurantPojo;

@Log
@Predict
public class AddRestaurantAction  {
    @Action
    public String addRestaurantDetails(RestaurantPojo pojo){
        log.info(pojo.toString());
        return "success";
    }
}
