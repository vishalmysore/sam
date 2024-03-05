package org.example;

import com.t4a.api.AIAction;
import com.t4a.api.ActionType;
import com.t4a.predict.Predict;

@Predict
public class SimpleAction implements AIAction {

    public String whatFoodDoesThisPersonLike(String name) {
        return "Paneer Butter Masala";
    }
    @Override
    public String getActionName() {
        return "whatFoodDoesThisPersonLike";
    }

    @Override
    public ActionType getActionType() {
        return ActionType.JAVAMETHOD;
    }

    @Override
    public String getDescription() {
        return "Provide persons name and then find out what does that person like";
    }
}
