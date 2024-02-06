package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HerokuapPage;
import utilities.UIHelpers;
import utilities.WebDriverFactory;

public class C02_herokuapWebSiteTest {
    HerokuapPage herokuapPage =  new HerokuapPage();
    UIHelpers uiHelpers = new UIHelpers();
    /*
         Scroll to Status Code Button
         Where is the statusCodeButton locator? it is in the HerokuapPage class
         To read, to bring statusCodeButton locator here what do we need ?
         Creating Object from HerokuapPage class.
         Scroll to the statusCode locator, what do we need ?
         we need to create JavaScriptExecutor.

         we already created? where is it ? UIHelpers
       */
    @Test
    public void scrollDownTest(){
        WebDriverFactory.getDriver().get("https://the-internet.herokuapp.com/");
        UIHelpers.waitInSeconds(2);// if there is a static method it is better to call with class name
        uiHelpers.scrollToElementJsExecutor(herokuapPage.statusCodeButton);
        uiHelpers.screenShot(WebDriverFactory.getDriver());
    }


}
