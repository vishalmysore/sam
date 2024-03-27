package org.example.script.actions;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;

@Predict(actionName = "reserveSightSeeing", description = "book sight seeing action")
public class SightSeeingAction implements JavaMethodAction {

    public String reserveSightSeeing(String attractionName){
        return " Success "+attractionName+" Booked";
    }
}
