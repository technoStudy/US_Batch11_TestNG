package day16;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.TestData;
import utilities.WebDriverFactory;

public class C04_LoginTest {
    AutomationExercisePage exercisePage = new AutomationExercisePage();

    @BeforeMethod
    public void setUp(){

        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
    }

    @Test (dataProvider = "loginPositiveData", dataProviderClass = TestData.class)
    public void loginPageValidEmailValidPass(String email,String password){
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        exercisePage.loginSignUpButton.click();
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys(email);// False
        exercisePage.passwordTextBox.sendKeys(password);//True
        exercisePage.loginButton.click();
        Assert.assertTrue(exercisePage.logoutButton.isDisplayed());
    }


}
