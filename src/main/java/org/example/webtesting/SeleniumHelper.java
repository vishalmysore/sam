package org.example.webtesting;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.t4a.JsonUtils;
import com.t4a.processor.AIProcessingException;
import com.t4a.processor.GeminiImageActionProcessor;
import com.t4a.processor.GeminiV2ActionProcessor;
import com.t4a.transform.GeminiV2PromptTransformer;
import lombok.extern.java.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

@Log
public class SeleniumHelper {
    private WebDriver driver;
    SeleniumHelper(WebDriver driver) {
        this.driver = driver;
    }
    public void act(String prompt) throws AIProcessingException {
        GeminiV2ActionProcessor processor = new GeminiV2ActionProcessor();
        JsonUtils utils = new JsonUtils();
        JsonParser parser = new JsonParser();

        GeminiV2PromptTransformer transformer = new GeminiV2PromptTransformer();
        DriverActions actions = (DriverActions)processor.processSingleAction(prompt,"webPageAction");
        String act = actions.getTypeOfActionToTakeOnWebDriver();
        WebDriverAction action = WebDriverAction.valueOf(act.toUpperCase());
        if (WebDriverAction.GET.equals(action)) {
          String urlOfTheWebPage = transformer.transformIntoJson("{fieldName:'urlToClick' fieldValue:''}",prompt);
          log.info(urlOfTheWebPage);
          urlOfTheWebPage = utils.extractJson(urlOfTheWebPage);
            JsonObject jsonObject = parser.parse(urlOfTheWebPage).getAsJsonObject();
            String fieldValue = jsonObject.get("fieldValue").getAsString();
            driver.get(fieldValue);
        }
    }
    public boolean checkPage(String question) throws AIProcessingException {
        TakesScreenshot ts = (TakesScreenshot) driver;
         byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
         GeminiImageActionProcessor imageActionProcessor = new GeminiImageActionProcessor();
         return Boolean.valueOf(imageActionProcessor.imageToText(screenshotBytes,question).trim());

    }
}
