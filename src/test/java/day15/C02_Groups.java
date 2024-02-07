package day15;

import org.testng.annotations.Test;

public class C02_Groups {

    @Test(groups = "Smoke")
    public void test01() {
        System.out.println("Test 01 is running");
    }

    @Test(groups = "Integration")
    public void test02() {
        System.out.println("Test 02 is running");
    }

    @Test(groups = {"Regression", "Integration"})
    public void test03() {
        System.out.println("Test 03 is running");
    }

    @Test(groups = "Regression")
    public void test04() {
        System.out.println("Test 04 is running");
    }

    @Test(groups = "Integration")
    public void test05() {
        System.out.println("Test 05 is running");
    }

}
