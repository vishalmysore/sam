package io.github.vishalmysore.webtesting;


import com.t4a.processor.GeminiImageActionProcessor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SeleniumAIExample {
    public static void main(String[] args) throws IOException {
         WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Setting headless mode
        options.addArguments("--disable-gpu");  // GPU hardware acceleration isn't useful in headless mode
        options.addArguments("--window-size=1920,1080");  // Set the window size
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://google.com");
        // Your code to interact with the page and take screenshots
      // Take screenshot and save it as file or use as bytes
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
        GeminiImageActionProcessor imageActionProcessor = new GeminiImageActionProcessor();
       // imageActionProcessor.imageToText()
        //File srcFile = ts.getScreenshotAs(OutputType.FILE);
        //File destFile = new File("screenshot.png");
        //FileHandler.copy(srcFile, destFile);
        driver.quit();
    }
}
