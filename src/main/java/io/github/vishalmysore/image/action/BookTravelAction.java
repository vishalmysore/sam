package io.github.vishalmysore.image.action;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;

import com.t4a.api.JavaMethodAction;
@Agent(groupName = "reserve travel", groupDescription = "All actions related to travel reservation")
public class BookTravelAction  {
    @Action(description = "This action will be called in case of booking Travel")
    public String bookTravel(String typeOfVehicle, String licensePlate, String from, String destination) {
        System.out.println("vehicle "+typeOfVehicle);
        return licensePlate+" has been booked for travel, from "+from+" to "+destination;
    }
}