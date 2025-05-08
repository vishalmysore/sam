package io.github.vishalmysore.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;

import com.t4a.api.AIAction;
import com.t4a.api.ActionType;
import com.t4a.api.JavaMethodAction;


@Agent(groupName = "SimpleAction", groupDescription = "This is a simple action which can be used to test the action processor")
public class SimpleAction {

    @Action(description = "Provide persons name and then find out what does that person like")
    public String whatFoodDoesThisPersonLike(String name) {
        if("vishal".equalsIgnoreCase(name))
        return "Paneer Butter Masala";
        else if ("vinod".equalsIgnoreCase(name)) {
            return "aloo kofta";
        }else
            return "something yummy";
    }

}
