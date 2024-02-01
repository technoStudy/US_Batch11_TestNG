package day12;

import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class C01_DynamicDriver {


    // There are many annotations like JUnit, first one is @Test

    @Test
    public void browserTest(){
        WebDriverFactory.getDriver().get("https://www.ebay.com");

    }
}
