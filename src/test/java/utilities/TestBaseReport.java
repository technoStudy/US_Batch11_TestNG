package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBaseReport {

    //Firstly we need to add extend report dependency
    // extent report variable from the ExtentReports class
    public ExtentReports extentReports;
    // create extentTest variable from the ExtentTest
    public ExtentTest extentTest;
    // create extentHtmlReporter variable from the ExtentHtmlReporter
    public ExtentSparkReporter extentSparkReporter;


    // we will use @BeforeTest annotation to run before test
    @BeforeTest(alwaysRun = true)//always run
    public void setUpTest() {
        extentReports = new ExtentReports();// starts reporting
        // after report is created we decide where to save it
        // and we need to define date format
        String date = new SimpleDateFormat("MMddYYYYhhmmss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/report" + date + ".html";
        //System.getProperty("user.dir") ==>> under the project name
        // test-output ==> name of the package
        // report"+date+".html ==>> report file as an html
        extentSparkReporter = new ExtentSparkReporter(filePath);
        extentReports.attachReporter(extentSparkReporter);

        // we can add all information about us
        extentReports.setSystemInfo("Enviroment", "QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReports.setSystemInfo("Automation Engineer", "Mehmet Ali Sezgin");
    }


    // after every test method, if there is an error, takes a screen shoot
    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) { // if it fails
            extentTest.fail(result.getName());
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // if skiped
            extentTest.skip("Test Case is skipped: " + result.getName()); // Ignores
        }

    }

    // to end reporting
    @AfterTest(alwaysRun = true)
    public void tearDown() {
        extentReports.flush();
    }

}
