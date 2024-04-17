package org.example.image.action;

import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;
@Predict(actionName = "sellToThisPerson", description = "This action will be called based on each person", groupName = "sales based on image of person")
public class SalesAndMarketing implements JavaMethodAction {
    public String sellToThisPerson(String genderOfPerson, @Prompt(describe = "what should we sell Yoga Mat, Protein Shake, Bike Rack") String typeOfProduct) {
        System.out.println("gender of person "+genderOfPerson);
        return " Hello, would you like to buy"+typeOfProduct;
    }
}