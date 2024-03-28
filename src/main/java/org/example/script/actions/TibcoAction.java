package org.example.script.actions;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;

@Predict(actionName = "notifyApplications", description = "notify all the downstream applications")
public class TibcoAction implements JavaMethodAction {
    public String notifyApplications(String[] downstreamApplications) {
        String commaSeparatedApplications = String.join(", ", downstreamApplications);
        return commaSeparatedApplications +" have been notified";
    }
}
