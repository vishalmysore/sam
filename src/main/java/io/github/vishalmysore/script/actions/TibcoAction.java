package io.github.vishalmysore.script.actions;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;


@Agent(groupName = "Tibco")
public class TibcoAction {
    @Action(description = "This action will be called in case of notifying downstream applications")
    public String notifyApplications(String[] downstreamApplications) {
        String commaSeparatedApplications = String.join(", ", downstreamApplications);
        return commaSeparatedApplications +" have been notified";
    }
}
