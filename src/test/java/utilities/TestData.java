package utilities;

import org.testng.annotations.DataProvider;

public class TestData {
    // we will keep all test data in this class with data providers methods

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

    @DataProvider(name = "loginPositiveData")
    public Object [][] loginTestData(){
        Object[][] testDate = {
                {"mhmetaliszgn@gmail.com","12345"}// email, password
        };
        return testDate ;
    }





}
