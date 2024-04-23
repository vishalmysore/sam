package org.example.script.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict(groupDescription = "book the flight for customer")
public class BookFlightAction  {

    @Action(description = "This action will be called in case of booking flight")
    public String reserveFlight(String fromLocation,String toLocation, String personName,int numOfPeople, String date) {
        return "Success Flights are booked for $2000";
    }
}
