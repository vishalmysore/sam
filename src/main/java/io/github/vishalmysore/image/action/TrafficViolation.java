package io.github.vishalmysore.image.action;

import com.t4a.annotations.Action;

import com.t4a.annotations.Agent;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;


@Agent(groupDescription = "This group is for of traffic violation", groupName = "traffic violation")
public class TrafficViolation  {
    @Action(description = "This action will be called in case of traffic violation")
    public String trafficViolation(String typeOfViolation, String carColor) {
        System.out.println("car color "+carColor);
        System.out.println("Type of Violation "+typeOfViolation);
        return typeOfViolation+" has been detected there will penalty";
    }
}
