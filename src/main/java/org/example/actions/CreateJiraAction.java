package org.example.actions;

import com.t4a.annotations.Predict;
import lombok.extern.java.Log;

@Log
@Predict(actionName = "createJira",description = "saves the information in local file", groupName = "Jira actions", groupDescription = "all actions related to jira")
public class CreateJiraAction {

    public String createJira(String reasonForCreatingJira) {
        // in real world you will connect to Jira
        return reasonForCreatingJira+ " created jira with id "+Math.random();
    }
}
