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

    @FindBy (xpath = ("(//input[@placeholder='Name'])[1]"))
    public WebElement nameTextBox;

    @FindBy (xpath = ("(//input[@data-qa='signup-email'])[1]"))
    public WebElement signUpEmailTextBox;

    @FindBy (xpath = ("(//input[@id='password'])[1]"))
    public WebElement passwordSignUpTextBox;

    @FindBy (xpath = ("(//input[@id='first_name'])[1]"))
    public WebElement firstNameSignUpTextBox;

    @FindBy (xpath = ("(//input[@id='last_name'])[1]"))
    public WebElement lastNameSignUpTextBox;

    @FindBy (xpath = ("(//input[@id='company'])[1]"))
    public WebElement companySignUpTextBox;

    @FindBy (xpath = ("(//input[@id='address1'])[1]"))
    public WebElement addressSignUpTextBox;


    @FindBy (xpath = ("(//select[@id='country'])[1]"))
    public WebElement countrySignUpTextBox;

    @FindBy (xpath = ("(//input[@id='state'])[1]"))
    public WebElement stateSignUpTextBox;

    @FindBy (xpath = ("(//input[@id='city'])[1]"))
    public WebElement citySignUpTextBox;

    @FindBy (xpath = ("(//button[normalize-space()='Signup'])[1]"))
    public WebElement signUpButtonInLoginPage;


    @FindBy (xpath = ("(//input[@id='zipcode'])[1]"))
    public WebElement zipCodeSignUpTextBox;

    @FindBy (xpath = ("(//input[@id='mobile_number'])[1]"))
    public WebElement mobileNoSignUpTextBox;

    @FindBy (xpath = ("(//button[normalize-space()='Create Account'])[1]"))
    public WebElement createAccountSignUpButton;

    @FindBy (xpath = ("(//a[normalize-space()='Logout'])[1]"))
    public WebElement logOutButton;




}
