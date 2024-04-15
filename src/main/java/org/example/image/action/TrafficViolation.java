package org.example.image.action;

import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;

@Predict(actionName = "trafficViolation", description = "This action will be called in case of traffic violation", groupName = "traffic violation")
public class TrafficViolation implements JavaMethodAction {
    public String trafficViolation(String typeOfViolation) {
        return typeOfViolation+" has been detected there will penalty";
    }
}
