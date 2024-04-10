package org.example.script.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict(actionName = "reserveSightSeeing", description = "book sight seeing action")
public class SightSeeingAction implements JavaMethodAction {

    public String reserveSightSeeing(String attractionName){
        return " Success "+attractionName+" Booked";
    }
}
