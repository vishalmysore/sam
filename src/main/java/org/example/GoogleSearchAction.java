package org.example;

import com.t4a.api.JavaMethodAction;
import com.t4a.predict.Predict;
import com.t4a.predict.PredictionLoader;
import kong.unirest.core.HttpResponse;
import kong.unirest.core.Unirest;
import lombok.extern.java.Log;

@Log
@Predict(actionName = "googleSearch", description = "search the web for information")
public class GoogleSearchAction implements JavaMethodAction {
    public String googleSearch(String searchString, boolean isNews)  {
        //Just return random string if you do not have serper key
        //to get serper key look here https://serper.dev/
        if(PredictionLoader.getInstance().getSerperKey() == null) {
            return "jamun , jalebi";
        }
        log.info(searchString+" : "+isNews);
        HttpResponse<String> response = Unirest.post("https://google.serper.dev/search")
                .header("X-API-KEY", PredictionLoader.getInstance().getSerperKey())
                .header("Content-Type", "application/json")
                .body("{\"q\":\""+searchString+"\"}")
                .asString();
        String resStr = response.getBody().toString();
        return resStr;
    }


}
