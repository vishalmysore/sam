package org.example.image.action;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;
@Predict(actionName = "bookTravel", description = "This action will be called in case of booking Travel",
        groupName = "reserve travel")
public class BookTravelAction implements JavaMethodAction {
    public String bookTravel(String typeOfVehicle, String licensePlate, String from, String destination) {
        System.out.println("vehicle "+typeOfVehicle);
        return licensePlate+" has been booked for travel, from "+from+" to "+destination;
    }
}