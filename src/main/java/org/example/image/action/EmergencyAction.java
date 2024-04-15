package org.example.image.action;

import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;

@Predict(actionName = "callEmergencyServices", description = "This action will be called in case of emergency", groupName = "emergency")
public class EmergencyAction implements JavaMethodAction {
    public String callEmergencyServices(@Prompt(describe = "Ambulance, Fire or Police") String typeOfEmergency) {
        return typeOfEmergency+" has been called";
    }
}
