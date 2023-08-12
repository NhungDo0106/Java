package BaitapOOP.Buoi3.common;

public class BaseTest {

    public void createDriver(){
        //Cách 1 cho chấm tên biến
//        System.out.println(Constants.browser);
//        System.out.println(Constants.report);
//        System.out.println(Constants.headless);

        //Cách 2 cho chấm với tên hàm
        System.out.println(Constants.getBrowser());
        System.out.println(Constants.isReport());
        System.out.println(Constants.isHeadless());

    }

    public void closeDriver(){

        System.out.println("Closed browser: " + Constants.getBrowser());
    }

    public void closeDriver(String browser){

        System.out.println("Closed browser: " + browser);
    }
}
