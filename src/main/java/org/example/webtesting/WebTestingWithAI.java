package org.example.webtesting;

import com.t4a.predict.PredictionLoader;
import com.t4a.processor.AIProcessingException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class WebTestingWithAI {
    public static void main(String[] args) throws IOException, AIProcessingException {
        // Set the path of the ChromeDriver executable
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Setting headless mode
        options.addArguments("--disable-gpu");  // GPU hardware acceleration isn't useful in headless mode
        options.addArguments("--window-size=1920,1080");  // Set the window size
        WebDriver driver = new ChromeDriver(options);


        SeleniumHelper helper = new SeleniumHelper(driver);
        helper.act("go to website https://the-internet.herokuapp.com");
        boolean buttonPresent =  helper.checkPage("do you see Add/Remove Elements, answer True or False");
        if(buttonPresent) {
            helper.act("click on Add/Remove Elements");
        }

        // Find the link for Add/Remove Elements by its text and click it
      //  WebElement linkToAddRemoveElements = driver.findElement(By.linkText("Add/Remove Elements"));
       // linkToAddRemoveElements.click();
       // TakesScreenshot ts = (TakesScreenshot) driver;
       // byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
       // GeminiImageActionProcessor imageActionProcessor = new GeminiImageActionProcessor();
        // imageActionProcessor.imageToText()
       // File srcFile = ts.getScreenshotAs(OutputType.FILE);
      //  File destFile = new File("screenshot.png");
       // FileHandler.copy(srcFile, destFile);

        // Perform further actions or validations as needed

        // Close the browser window
        driver.quit();
    }
}
