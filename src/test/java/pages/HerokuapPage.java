package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverFactory;

public class HerokuapPage {


    public HerokuapPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(),this);
    }


    @FindBy(xpath = ("(//a[normalize-space()='Status Codes'])[1]"))
    public WebElement statusCodeButton;



}
