package org.example;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;
import lombok.extern.java.Log;

@Log
@Predict(actionName = "addRestaurantDetails",description = "saves the information in local file")
public class AddRestaurantAction implements JavaMethodAction {
    public String addRestaurantDetails(RestaurantPojo pojo){
        log.info(pojo.toString());
        return "success";
    }
}
