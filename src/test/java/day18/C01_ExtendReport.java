package day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseReport;

public class C01_ExtendReport extends TestBaseReport {

//when you want to use ExtentReport, you should extend test class to TestBaseReport class

    @Test
    public void loginTest(){
        extentTest = extentReports.createTest("Facebook Login Test","" +
                "The use Should be able to login with positive data");

        extentTest.info("User Should See Welcome to Facebook Header Text When login ");
        Assert.assertEquals(5,3);

    }

    @Test
    public void negativeCreateAccountTest(){
        extentTest = extentReports.createTest("Facebook Create Account Negative Test","" +
                "The use Should not be able to login with negative data");

        extentTest.info("User Should See Warning Message When using negative data ");
        Assert.assertEquals(5,5);
    }
    @Test
    public void isWebElementVissible(){
        extentTest = extentReports.createTest("Facebook Webelement Test","Test");
        extentTest.info("User Should See All Web element ");
        Assert.assertEquals(5,7);
    }

    @Test
    public void dropdownMenuTest(){
        extentTest = extentReports.createTest("Facebook DropDown List Test","TestDropDown");
        extentTest.info("User Should See DropDown List ");
        Assert.assertEquals(5,5);
    }


}
