package org.example.script.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict(actionName = "reserveRentalCar", description = "book the rental car")
public class RentalCarAction implements JavaMethodAction {
    public String reserveRentalCar(String name, String location, int numOfDays, String date) {
        return "Success booked the car";
    }
}
