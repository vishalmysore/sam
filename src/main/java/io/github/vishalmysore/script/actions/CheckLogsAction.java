package io.github.vishalmysore.script.actions;

import com.t4a.annotations.Action;

import com.t4a.annotations.Agent;
import com.t4a.api.JavaMethodAction;


@Agent
public class CheckLogsAction  {
    @Action(description = "This action will be called in case of checking logs")
    public String checkLogs(String textToFind, String logName, String applicationName) {
        return " Found the text "+textToFind;
    }
}
