package org.example.script.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict(actionName = "reserveFlight", description = "book the flight for customer")
public class BookFlightAction implements JavaMethodAction {
    public String reserveFlight(String fromLocation,String toLocation, String personName,int numOfPeople, String date) {
        return "Success Flights are booked for $2000";
    }
}
