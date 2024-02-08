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


    // name, email,password,First name, Last Name, Company, Address, Country,state,city,zipcode,mobileNo
    @DataProvider(name = "createAccountAutomationExercise")
    public Object [][] createAccount(){
        Object[][] testDate = {
                {"Aliye","alye@gmail.com","1234","Aliye","Candir","GermanIT","Munich","Canada","Munich","Munich","1234","1234"},
                {"Aziza","azza@gmail.com","1234","Aziza","Khu","Apple","NW","United States","NW","NW","1234","1234"},
                {"Hamza","haza@gmail.com","1234","hamza","Gokce","Siemens","Tokyo","Canada","Tokyo","Tokyo","1234","1234"},
                {"Hanna","hana@gmail.com","1234","Hanna","Kvitko","Philips","WDC","United States","WDC","WDC","1234","1234"},
                {"Ogulcan","ogucan@gmail.com","1234","Ogulcan","Erdem","Samsung","Sydney","Canada","Sydney","Sydney","1234","1234"},
                {"Oguzhan","oguhan@gmail.com","1234","Oguzhan","Erdem","Samsung","Sydney","United States","Sydney","Sydney","1234","1234"},
                {"Sahin","sain@gmail.com","1234","Sahin","Kaya","Nokia","Helsinki","Canada","Helsinki","Helsinki","1234","1234"},
                {"Tetiana","tetina@gmail.com","1234","Tetiana","Khok","Apple","NW","United States","NW","NW","1234","1234"},
                {"Polina","polna@gmail.com","1234","Polina","Khus","Apple","NW","United States","NW","NW","1234","1234"},
                {"Khalid","halid@gmail.com","1234","Khalid","Ahmed","Apple","NW","United States","NW","NW","1234","1234"},
        };
        return testDate ;
    }





}
