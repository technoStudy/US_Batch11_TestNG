package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverFactory;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(WebDriverFactory.getDriver(),this);
    }

    @FindBy (xpath = ("(//img[@alt='Website for automation practice'])[1]"))
    public WebElement homePageImage;

    @FindBy (xpath = ("(//a[normalize-space()='Signup / Login'])[1]"))
    public WebElement loginSignUpButton;
    @FindBy (xpath = ("(//h2[normalize-space()='Login to your account'])[1]"))
    public WebElement logintoYourAccountText;
    @FindBy (xpath = ("(//input[@data-qa='login-email'])[1]"))
    public WebElement emailTextBox;

    @FindBy (xpath = ("(//input[@placeholder='Password'])[1]"))
    public WebElement passwordTextBox;
    @FindBy (xpath = ("(//button[normalize-space()='Login'])[1]"))
    public WebElement loginButton;

    @FindBy (xpath = ("(//p[normalize-space()='Your email or password is incorrect!'])[1]"))
    public WebElement loginIncorrectMessage;
    @FindBy (xpath = ("(//a[normalize-space()='Logout'])[1]"))
    public WebElement logoutButton;


}
