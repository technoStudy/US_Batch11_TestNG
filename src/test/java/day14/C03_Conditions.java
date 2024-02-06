package day14;

import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C03_Conditions {


    // we are going from point A to B
    @Test
    public void startTheEngine(){
        System.out.println("The Engine is running");
    }

    @Test(dependsOnMethods = "startTheEngine")
    public void driveTheCar(){
        System.out.println("The Car is moving");
    }

    @Test (dependsOnMethods = {"startTheEngine","driveTheCar"})
    public void parkTheCar(){
        System.out.println("Driver is Parking");
    }

    @Test(dependsOnMethods = {"startTheEngine","driveTheCar","parkTheCar"})
    public void stopTheCar(){
        System.out.println("The Engine is not running");
    }

}
