package day16;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.WebDriverFactory;

public class C01_DataProviderTest {


    //DataProvider runs th code in the test, multiple times with different data sets
    AutomationExercisePage exercisePage = new AutomationExercisePage();

    @BeforeMethod
    public void setUp(){
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
    }
    @Test(dataProvider = "loginData")
    public void negativeLoginDataTest(String email,String password){
        Assert.assertTrue(exercisePage.homePageImage.isDisplayed());
        exercisePage.loginSignUpButton.click();
        Assert.assertTrue(exercisePage.logintoYourAccountText.isDisplayed());
        exercisePage.emailTextBox.sendKeys(email);//false
        exercisePage.passwordTextBox.sendKeys(password);// false
        exercisePage.loginButton.click();
        Assert.assertTrue(exercisePage.loginIncorrectMessage.isDisplayed());
    }
    @DataProvider(name="loginData") // name of the DataProvider
    public Object[][] negativeTestDataLoginPage(){
         Object[][] tesData={
                 {"mhmetaliszgn@gmail.com","12314"},// T,F
                 {"xxx@gmail.com","ervanaz2012"},// F,T
                 {"xxx@gmail.com","12345"} // F,F
         };
      return tesData;
    }


}
