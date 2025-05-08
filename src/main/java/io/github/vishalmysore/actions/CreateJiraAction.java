package io.github.vishalmysore.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;

import lombok.extern.java.Log;

@Log
@Agent( groupName = "Jira actions", groupDescription = "all actions related to jira")
public class CreateJiraAction {
    @Action
    public String createJira(String reasonForCreatingJira) {
        // in real world you will connect to Jira
        return reasonForCreatingJira+ " created jira with id "+Math.random();
    }
}
