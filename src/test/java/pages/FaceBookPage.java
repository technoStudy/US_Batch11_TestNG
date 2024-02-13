package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.WebDriverFactory;

public class FaceBookPage {

    public FaceBookPage(){

        PageFactory.initElements(WebDriverFactory.getDriver(),this);
    }

    @FindBy(xpath = ("//button[@title='Allow all cookies']"))
    public WebElement cookiesButton ;

    @FindBy (xpath = ("(//a[normalize-space()='Create new account'])[1]"))
    public WebElement createNewAccountButton ;

    // FacebookMainPage>>CreateNewAccount>First Name Text Box
    @FindBy (xpath = ("//input[@name='firstname']"))
    public WebElement firstNameTextBox ;

    @FindBy (xpath = ("//input[@name='lastname']"))
    public WebElement lastNameTextBox ;

    @FindBy (xpath = ("//input[@name='reg_email__']"))
    public WebElement emailOrPhoneTextBox ;

    @FindBy (xpath = ("(//input[@id='password_step_input'])[1]"))
    public WebElement passwordTextBox ;

    @FindBy (xpath = ("(//select[@id='month'])[1]"))
    public WebElement monthDropDownList ;

    @FindBy (xpath = ("(//select[@id='day'])[1]"))
    public WebElement dayDropDownList;

    @FindBy (xpath = ("(//select[@id='year'])[1]"))
    public WebElement yearDropDownList ;

    @FindBy (xpath = ("//input[@value='1']"))
    public WebElement femaleRadioButton ;

    @FindBy (xpath = ("(//button[@type='submit'])[2]"))
    public WebElement signUpButton ;

    @FindBy (xpath = ("(//div[@class='_5633 _5634 _53ij'])[1]"))
    public WebElement warningTextMessage ;


    // create dynamic click method
    public void clickElement(WebElement element) {
        element.click();
    }

    // create dynamic send keys method
    public void sendKeys(WebElement element,String key) {
        element.sendKeys(key);
    }
    // create dynamic assertion method
    public void isDisPlayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }




}
