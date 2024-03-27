package org.example.script.actions;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;

@Predict(actionName = "reserveFlight", description = "book the flight for customer")
public class BookFlightAction implements JavaMethodAction {
    public String reserveFlight(String fromLocation,String toLocation, String personName,int numOfPeople, String date) {
        return "Success Flights are booked for $2000";
    }
}
