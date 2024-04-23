package org.example.image.action;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;
@Predict( groupDescription = "This group will be called based on each person", groupName = "sales based on image of person")
public class SalesAndMarketing  {
    @Action(description = "This action will be called in case of selling to a person")
    public String sellToThisPerson(String genderOfPerson, @Prompt(describe = "what should we sell Yoga Mat, Protein Shake, Bike Rack") String typeOfProduct) {
        System.out.println("gender of person "+genderOfPerson);
        return " Hello, would you like to buy"+typeOfProduct;
    }
}