package org.example.script.actions;

import com.t4a.annotations.Predict;
import com.t4a.api.JavaMethodAction;


@Predict(actionName = "notifyApplications", description = "notify all the downstream applications")
public class TibcoAction implements JavaMethodAction {
    public String notifyApplications(String[] downstreamApplications) {
        String commaSeparatedApplications = String.join(", ", downstreamApplications);
        return commaSeparatedApplications +" have been notified";
    }
}
