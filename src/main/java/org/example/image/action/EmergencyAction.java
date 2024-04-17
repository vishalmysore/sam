package org.example.image.action;

import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;

@Predict(actionName = "callEmergencyServices", description = "This action will be called in case of emergency", groupName = "emergency")
public class EmergencyAction implements JavaMethodAction {
    public String callEmergencyServices(@Prompt(describe = "Ambulance, FireTruck or Police") String typeOfEmergency,boolean isEmergencyVehicleOnScene) {
        if(isEmergencyVehicleOnScene) {
            return typeOfEmergency+" has not been called since its already on scene";
        } else
        return typeOfEmergency+" has been called since it was not there on scene";
    }
}
