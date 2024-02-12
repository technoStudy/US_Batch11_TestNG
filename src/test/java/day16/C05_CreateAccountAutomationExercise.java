package day16;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.TestData;
import utilities.UIHelpers;
import utilities.WebDriverFactory;

public class C05_CreateAccountAutomationExercise {

    AutomationExercisePage exercisePage = new AutomationExercisePage();
    UIHelpers uiHelpers = new UIHelpers();
    @BeforeMethod
    public void setUp(){

        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
    }

    // name, email,password,First name, Last Name, Company, Address, Country,state,city,zipcode,mobileNo
    @Test(dataProvider = "accountAutomationExercise",dataProviderClass = TestData.class)
    public void createUser(String name, String email,String password,String firsname,String lastname,String company,
                           String address, String country,String state,String city,String zipcode,String mobile){
        exercisePage.loginSignUpButton.click();
        UIHelpers.waitInSeconds(1);
        exercisePage.nameTextBox.sendKeys(name);
        exercisePage.signUpEmailTextBox.sendKeys(email);
        exercisePage.signUpButtonInLoginPage.click();
        UIHelpers.waitInSeconds(1);
        exercisePage.passwordSignUpTextBox.sendKeys(password);
        exercisePage.firstNameSignUpTextBox.sendKeys(firsname);
        UIHelpers.waitInSeconds(1);
        exercisePage.lastNameSignUpTextBox.sendKeys(lastname);
        exercisePage.companySignUpTextBox.sendKeys(company);
        uiHelpers.scrollToElementJsExecutor(exercisePage.createAccountSignUpButton);
        UIHelpers.waitInSeconds(1);
        exercisePage.addressSignUpTextBox.sendKeys(address);
        UIHelpers.waitInSeconds(1);
        Select select = new Select(exercisePage.countrySignUpTextBox);
        select.selectByVisibleText(country);
        UIHelpers.waitInSeconds(1);
        exercisePage.stateSignUpTextBox.sendKeys(state);
        exercisePage.citySignUpTextBox.sendKeys(city);
        UIHelpers.waitInSeconds(1);
        exercisePage.zipCodeSignUpTextBox.sendKeys(zipcode);
        exercisePage.mobileNoSignUpTextBox.sendKeys(mobile);
        UIHelpers.waitInSeconds(1);
        exercisePage.createAccountSignUpButton.click();
        UIHelpers.waitInSeconds(1);
        exercisePage.loginSignUpButton.click();
        UIHelpers.waitInSeconds(1);
        exercisePage.logOutButton.click();
        UIHelpers.waitInSeconds(1);

    }
}
