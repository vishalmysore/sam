package io.github.vishalmysore.image.action;

import com.t4a.annotations.Action;

import com.t4a.annotations.Agent;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;

@Agent(groupDescription =  "This group will be called in case of emergency", groupName = "emergency")
public class EmergencyAction {

    @Action(description = "This action will be called in case of emergency")
    public String callEmergencyServices(@Prompt(describe = "Ambulance, FireTruck or Police") String typeOfEmergency,boolean isEmergencyVehicleOnScene) {
        if(isEmergencyVehicleOnScene) {
            return typeOfEmergency+" has not been called since its already on scene";
        } else
        return typeOfEmergency+" has been called since it was not there on scene";
    }
}
