package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CreateAccountPageFacebook;
import utilities.WebDriverFactory;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class C01_CreateAccounTestFacebook {

    // We need to create Object from Page classes to Call locators
    CreateAccountPageFacebook facebookPage = new CreateAccountPageFacebook();

    @Test
    public void createAccounTest(){
        // Navigate to facebook
        WebDriverFactory.getDriver().get("https://www.facebook.com");
        // Click Accept Cookies Button
        facebookPage.cookiesButton.click();
        facebookPage.createNewAccountButton.click();
        facebookPage.firstNameTextBox.sendKeys("Mehmet");
        facebookPage.lastNameTextBox.sendKeys("Sezgin");
        facebookPage.emailOrPhoneTextBox.sendKeys("xxx@gmail.com");
    }

}
