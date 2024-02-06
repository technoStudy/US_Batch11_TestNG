package day14;

import org.testng.annotations.Test;

public class C04_Enabled {

    // if we use enabled = false TestNG will not run those tests and run the others
    // if we use enabled = true TesNG will run those tests and no need to use because its default

    @Test
    public void startTheEngine(){
        System.out.println("The Engine is running");
    }

    @Test(enabled = false)
    public void driveTheCar(){
        System.out.println("The Car is moving");
    }

    @Test (enabled = false)
    public void parkTheCar(){
        System.out.println("Driver is Parking");
    }

    @Test
    public void stopTheCar(){
        System.out.println("The Engine is not running");
    }


}
