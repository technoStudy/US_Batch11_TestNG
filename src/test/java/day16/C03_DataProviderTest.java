package day16;

import org.testng.annotations.Test;
import utilities.TestData;

public class C03_DataProviderTest {


    @Test(dataProvider = "testDataSet", dataProviderClass = TestData.class)
    public void studentInfoTest(String name,String lastname,String email,String password,int age){
        System.out.println("The Name of Student :"+name);
        System.out.println("The LastName of Student :"+lastname);
        System.out.println("The email of Student :"+email);
        System.out.println("The password of Student :"+password);
        System.out.println("The age of Student :"+age);

    }
}
