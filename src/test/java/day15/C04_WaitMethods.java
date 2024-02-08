package day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.UIHelpers;
import utilities.WebDriverFactory;

public class C04_WaitMethods {
    AutomationExercisePage exercisePage = new AutomationExercisePage();
    UIHelpers uiHelpers = new UIHelpers();
    @Test
    public void clickWithJSexecutor() {
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        uiHelpers.clickOnElementJsExecutor(exercisePage.loginSignUpButton);
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys("xxxx@gmail.com");//false
        exercisePage.passwordTextBox.sendKeys("123456");// false

        uiHelpers.clickOnElementJsExecutor(exercisePage.loginButton);

        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }

    @Test
    public void waitUntilVisibility() {
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
        uiHelpers.waitForVisibility(exercisePage.homePageImage,3);
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        uiHelpers.clickOnElementJsExecutor(exercisePage.loginSignUpButton);
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys("xxxx@gmail.com");//false
        exercisePage.passwordTextBox.sendKeys("123456");// false
        uiHelpers.clickOnElementJsExecutor(exercisePage.loginButton);
        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }
    @Test
    public void waitUntilClickability() {
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
        uiHelpers.waitForVisibility(exercisePage.homePageImage,3);
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        uiHelpers.clickOnElementJsExecutor(exercisePage.loginSignUpButton);
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys("xxxx@gmail.com");//false
        exercisePage.passwordTextBox.sendKeys("123456");// false
        uiHelpers.waitForClickAblitiy(exercisePage.loginButton,3);
        uiHelpers.clickOnElementJsExecutor(exercisePage.loginButton);
        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }
}
