package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverFactory;

public class CreateAccountPageFacebook {

    // lets create a constructor for the class
    public CreateAccountPageFacebook() {
        /*
        Initializes the elements in the Page Object
        PageFactory.initelements : This is a static method from
        PagecFactory class is used to initialize all the
        Webelements defined in the Page Object.
       */
        PageFactory.initElements(WebDriverFactory.getDriver(),this);
        // The method uses reflection to initialize elements without
        // having to define findelement or findelements
    }

    // We will keep all locators here related to Create Account Page in Facebook
    @FindBy (xpath = ("//button[@title='Allow all cookies']"))
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



}
