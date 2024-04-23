package org.example.script.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict
public class RentalCarAction {
    @Action(description = "This action will be called in case of booking rental car")
    public String reserveRentalCar(String name, String location, int numOfDays, String date) {
        return "Success booked the car";
    }
}
