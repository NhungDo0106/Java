package ThucHanhBai20_21.Test;

import ThucHanhBai20_21.Pages.DashboardPage;
import ThucHanhBai20_21.Pages.LoginPage;
import Thuchanh.Basetest;
import constant.ConfigData;
import org.testng.annotations.Test;

public class LoginTest extends Basetest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    @Test(priority = 1)
    public void testLoginSuccess(){
        loginPage = new LoginPage(driver);

        //Goi cac ham xu ly co san de su dung
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL,ConfigData.PASSWORD);
        loginPage.verifyLoginSuccess();



        //Logout tu trang Dashboard
        //dashboardPage.clickLogout();
    }

    @Test(priority = 2)
    public void testLoginWithEmailInvalid(){
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin123@example.com","123456");
        waitForPageLoaded();
        loginPage.verifyLoginFail();
    }

    @Test(priority = 3)
    public void testLoginWithPasswordInvalid(){
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin@example.com","12345678");
        waitForPageLoaded();
        loginPage.verifyLoginFail();
    }

    @Test(priority = 4)
    public void testLoginWithEmailFormat(){
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin@example","123456");
        waitForPageLoaded();
        loginPage.verifyLoginFormat();
    }
}
