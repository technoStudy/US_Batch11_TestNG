package day15;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.WebDriverFactory;

public class C01_Exercises {


    AutomationExercisePage exercisePage = new AutomationExercisePage();

    @BeforeMethod
    public void setUp(){
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
    }
    @Test
    public void loginPageInvalidEmailInvPass(){
       Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
       exercisePage.loginSignUpButton.click();
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys("xxxx@gmail.com");//false
        exercisePage.passwordTextBox.sendKeys("123456");// false
        exercisePage.loginButton.click();
        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }

    @Test
    public void loginPageValidEmailInvPass(){
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        exercisePage.loginSignUpButton.click();
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys("mhmetaliszgn@gmail.com");// True
        exercisePage.passwordTextBox.sendKeys("123456");//False
        exercisePage.loginButton.click();
        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }

    @Test
    public void loginPageInvalidEmailValidPass(){
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        exercisePage.loginSignUpButton.click();
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys("mhmn@gmail.com");// False
        exercisePage.passwordTextBox.sendKeys("ervanaz2012");//True
        exercisePage.loginButton.click();
        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }
    @Test  // This is a positive Test
    public void loginPageValidEmailValidPass(){
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        exercisePage.loginSignUpButton.click();
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys("mhmetaliszgn@gmail.com");// False
        exercisePage.passwordTextBox.sendKeys("ervanaz2012");//True
        exercisePage.loginButton.click();
        Assert.assertTrue(exercisePage.logoutButton.isDisplayed());
    }
    @AfterClass
    public void tearDownClass(){
        WebDriverFactory.quitDriver();
    }
}
