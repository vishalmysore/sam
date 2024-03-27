package org.example.script.actions;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;

@Predict(actionName = "reserveRentalCar", description = "book the rental car")
public class RentalCarAction implements JavaMethodAction {
    public String reserveRentalCar(String name, String location, int numOfDays, String date) {
        return "Success booked the car";
    }
}
