package org.example.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.AIAction;
import com.t4a.api.ActionType;
import com.t4a.api.JavaMethodAction;


@Predict(actionName ="whatFoodDoesThisPersonLike", description = "Provide persons name and then find out what does that person like")
public class SimpleAction implements JavaMethodAction {

    public String whatFoodDoesThisPersonLike(String name) {
        if("vishal".equalsIgnoreCase(name))
        return "Paneer Butter Masala";
        else if ("vinod".equalsIgnoreCase(name)) {
            return "aloo kofta";
        }else
            return "something yummy";
    }

}
