package day16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C02_DataProviderTest {


    @DataProvider(name = "testDataSet")
    public Object [][] testDataProvider(){
        Object[][] testDate = {
                {"Ahmet","Candir","can@gmail.com","123",25},// name, lastname, email, password,age
                {"Hamza","Gokce","hamza@gmail.com","abc",18},// name, lastname, email, password,age
                {"Hanna","Kvitko","hanna@gmail.com","12as",17},// name, lastname, email, password,age
                {"Aliye","Can","aliye@gmail.com","123d",8},// name, lastname, email, password,age
                {"Aziza","Khon","aziza@gmail.com","123d",15}// name, lastname, email, password,age
        };
       return testDate ;
    }

    @Test(dataProvider = "testDataSet")
    public void testName(String name,String lastname,String email,String password,int age){
        System.out.println("The Name of Student :"+name);
        System.out.println("The LastName of Student :"+lastname);
        System.out.println("The email of Student :"+email);
        System.out.println("The password of Student :"+password);
        System.out.println("The age of Student :"+age);
    }



}
