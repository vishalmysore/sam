package org.example.image.action;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;
@Predict(groupDescription = "All actions for car servicing",
        groupName = "car services")
public class CarServiceAction  {
    @Action(description = "This action will be called in case of car servicing")
    public String carRepairService(String typeOfProblem, String carColor) {
        System.out.println("color of the car "+carColor);
        return typeOfProblem+" has been found and will be fixed";
    }
}