package BaitapOOP.Buoi3.testcases;

import BaitapOOP.Buoi3.common.BaseTest;

public class TestCases extends BaseTest {

    public TestCases() {
        super();
    }

    public void TCLogin(){
        createDriver();
        System.out.println("Open URL https://cms.anhtester.com/login");
        System.out.println("Input Email & password");
        System.out.println("Click button Login");
        System.out.println("Verify Admin page URL admin https://cms.anhtester.com/admin");
        closeDriver();
    }
    public void TCAddCategory(){
        createDriver();
        System.out.println("Open URL https://cms.anhtester.com/login");
        System.out.println("Input Email & password");
        System.out.println("Click button Login");
        System.out.println("Verify Admin page URL admin https://cms.anhtester.com/admin");


        System.out.println("Click Product on the menu");
        System.out.println("Click Category");
        System.out.println("Click button Add New category");
        System.out.println("Input all fields on the form");
        System.out.println("Click button Save");
        System.out.println("Back screen Category and display message [Category has been inserted successfully] below left");
        closeDriver();
    }


}
