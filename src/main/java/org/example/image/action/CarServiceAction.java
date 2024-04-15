package org.example.image.action;

import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;
@Predict(actionName = "carRepairService", description = "This action will be called in case of car servicing", groupName = "car services")
public class CarServiceAction implements JavaMethodAction {
    public String carRepairService(String typeOfProblem) {
        return typeOfProblem+" has been found and will be fixed";
    }
}