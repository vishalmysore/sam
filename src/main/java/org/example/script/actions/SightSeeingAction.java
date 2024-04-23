package org.example.script.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict
public class SightSeeingAction  {

    @Action(description = "This action will be called in case of booking sight seeing")
    public String reserveSightSeeing(String attractionName){
        return " Success "+attractionName+" Booked";
    }
}
