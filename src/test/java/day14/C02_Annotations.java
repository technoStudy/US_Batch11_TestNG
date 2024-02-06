package day14;

import org.testng.annotations.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C02_Annotations {

    /*
    @BeforeClass: The annotated method will be run before the
    first test method in the current class invoked
    @AfterClass: The annotated method will be run after the last test method
    @AfterMethod: The annotated method will be run after each method
    @BeforeMethod: The annotated method will be run before each method
     */




    @BeforeClass
    public void setUpClass(){
        System.out.println("Before Class is Running");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method is Running");
    }
    @Test
    public void test01(){
        System.out.println("Test 01 is Running ");
    }
    @Test
    public void test02(){
        System.out.println("Test 02 is Running ");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("After Class is Running");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After Method is Running");
    }


}
