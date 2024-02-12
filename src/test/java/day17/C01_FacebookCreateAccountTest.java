package day17;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.ConfigReader;
import utilities.TestData;
import utilities.UIHelpers;
import utilities.WebDriverFactory;

public class C01_FacebookCreateAccountTest {

    /*
    we are planning to test 3 fields
    First name, Last name, Mobile number text boxes

    -If There is no value on the First name text box
    user must be able to see the warning message
    -If There is no value on the Last name text box
    user must be able to see the warning message
    -If there is no value on the mobile number text box
    user must be able to see the warning message
     */

    FaceBookPage faceBookPage = new FaceBookPage();
    UIHelpers uiHelpers = new UIHelpers();

    @BeforeMethod
    public void setUp() {
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("facebook"));
    }

    // we should define dataprovider to use test data
    @Test(dataProvider = "createFacebookAccount", dataProviderClass = TestData.class)
    public void negativeCreateAccountFacebookTest(String name, String lastname, String mobileno, String passwod,
                                                  String month, String day, String year) {

       // faceBookPage.cookiesButton.click();
        UIHelpers.waitInSeconds(1);
        faceBookPage.createNewAccountButton.click();
        faceBookPage.firstNameTextBox.sendKeys(name);
        UIHelpers.waitInSeconds(1);
        faceBookPage.lastNameTextBox.sendKeys(lastname);
        UIHelpers.waitInSeconds(1);
        faceBookPage.emailOrPhoneTextBox.sendKeys(mobileno);
        UIHelpers.waitInSeconds(1);
        faceBookPage.passwordTextBox.sendKeys(passwod);
        UIHelpers.waitInSeconds(1);
        //month
        uiHelpers.selectByVisibleText(faceBookPage.monthDropDownList, month);
        UIHelpers.waitInSeconds(1);
        //day
        uiHelpers.selectByVisibleText(faceBookPage.dayDropDownList, day);
        UIHelpers.waitInSeconds(1);
        //year
        uiHelpers.selectByVisibleText(faceBookPage.yearDropDownList, year);
        UIHelpers.waitInSeconds(1);
        faceBookPage.femaleRadioButton.click();
        UIHelpers.waitInSeconds(1);
        faceBookPage.signUpButton.click();
        UIHelpers.waitInSeconds(1);
        Assert.assertTrue(faceBookPage.warningTextMessage.isDisplayed());
    }


}
