package day15;

import org.testng.annotations.Test;

public class C03_Groups2 {

    @Test (groups = "Smoke")
    public void test01(){
        System.out.println("Test 01 is running from Groups2 class");
    }

    @Test (groups = {"Smoke","Integration"})
    public void test02(){
        System.out.println("Test 02 is running from Groups2 class");
    }
    @Test (groups = "Integraton")
    public void test03(){
        System.out.println("Test 03 is running from Groups2 class");
    }
    @Test(groups = "Regresion")
    public void test04(){
        System.out.println("Test 04 is running from Groups2 class");
    }
}
