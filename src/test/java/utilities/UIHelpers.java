package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UIHelpers {

    public static void waitInSeconds(int sec){
        try{
            Thread.sleep(sec * 1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
    }



    public void screenShot(WebDriver driver)  {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        LocalDateTime timeOfBug = LocalDateTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("MMddyyyyhhmmss");
        String date = timeOfBug.format(timeFormat);
        String filePath = "src/screenshots/image_"+date+".jpeg";
        File fullPage = new File(filePath);
        File tempFile =  screenshot.getScreenshotAs(OutputType.FILE);
        try {
            // Which Dependency are we use for FileUtils in Java Selenium
            FileUtils.copyFile(tempFile,fullPage);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void scrollToElementJsExecutor(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverFactory.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",element );
    }


}
