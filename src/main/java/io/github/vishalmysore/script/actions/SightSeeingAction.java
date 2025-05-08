package io.github.vishalmysore.script.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;

import com.t4a.api.JavaMethodAction;


@Agent(groupName = "SightSeeing")
public class SightSeeingAction  {

    @Action(description = "This action will be called in case of booking sight seeing")
    public String reserveSightSeeing(String attractionName){
        return " Success "+attractionName+" Booked";
    }
}
