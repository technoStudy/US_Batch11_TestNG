package day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FaceBookPage;

public class C02_HardSoftAssertion {

    // Assert class is called i the testing World as a hard assertion
    // when the code detects a bug the hard assertion stops immediately, it means the code don't continue
    @Test
    public void test01(){
        Assert.assertTrue(5>3);// True
        Assert.assertTrue(2<1);//False
        Assert.assertEquals(5,5);//True
    }

    // Softassertion is a class called as a soft asserti
    // when the code detects a bug the soft assertion doesnt stop it means
    // it continues until the end of the code


    @Test
    public void test02(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(3>1);// True
        softAssert.assertTrue(2<1);//False
        softAssert.assertEquals(3,3);// True

        // when we use soft assertion we should put end of the code
        softAssert.assertAll();
    }

}
