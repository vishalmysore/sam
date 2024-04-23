package org.example.image.action;

import com.t4a.annotations.Action;
import com.t4a.annotations.Predict;
import com.t4a.annotations.Prompt;
import com.t4a.api.JavaMethodAction;

@Predict(groupDescription = "This will be used for cooking dishes", groupName = "cooking")
public class CookingAction {

    @Action(description = "This will be used for cooking dishes")
    public String cookThisForLunch(@Prompt(describe = "this should be comma separated") String ingredients) {
        return ingredients+" can be used to make spicy stuffed paratha";
    }

}