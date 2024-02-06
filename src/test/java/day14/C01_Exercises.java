package day14;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.WebDriverFactory;

public class C01_Exercises {

    /*
TC ID: TC001

TC Title: Login User with Incorrect Email and Password

TC Description: This test case aims to verify that users
cannot log in using incorrect email addresses and passwords,
and the appropriate error message is displayed.

TC Steps:
1-Navigate to the URL 'http://automationexercise.com'.
2-Verify that the home page is visible successfully.
3-Click on the 'Signup / Login' button.
4-Verify that the 'Login to your account' section is visible.
5-Enter an incorrect email address and password in the respective fields.
6-Click the 'Login' button.
7-Verify that the error message 'Your email or password is incorrect!' is visible.

Expected Result:
The home page should be displayed successfully upon navigating to the URL.
The 'Signup / Login' button should be visible and clickable.
After clicking the 'Signup / Login' button, the 'Login to your account' section should be visible.
Upon entering incorrect credentials and clicking the 'Login' button, the user should not be logged in.
The error message 'Your email or password is incorrect!' should be displayed, indicating the failed login attempt.
 */

    AutomationExercisePage exercisePage = new AutomationExercisePage();
    @Test
    public void loginPageTest(){
       //1-Navigate to the URL 'http://automationexercise.com'.
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
       //2-Verify that the home page is visible successfully.
       Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
       //3-Click on the 'Signup / Login' button.
       exercisePage.loginSignUpButton.click();
       //4-Verify that the 'Login to your account' section is visible.
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
       //5-Enter an incorrect email address and password in the respective fields.
        exercisePage.emailTextBox.sendKeys("xxxx@gmail.com");
        exercisePage.passwordTextBox.sendKeys("123456");
       //6-Click the 'Login' button.
        exercisePage.loginButton.click();
       //7-Verify that the error message 'Your email or password is incorrect!' is visible.
        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }
}
