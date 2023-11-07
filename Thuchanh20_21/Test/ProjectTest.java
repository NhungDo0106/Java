package ThucHanhBai20_21.Test;

import ThucHanhBai20_21.Pages.DashboardPage;
import ThucHanhBai20_21.Pages.LoginPage;
import ThucHanhBai20_21.Pages.ProjectPage;
import Thuchanh.Basetest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProjectTest extends Basetest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProjectPage projectPage;

    @Test(priority = 1)
    public void testOpenProject() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin@example.com", "123456");
        //Click menu Customer
        projectPage = dashboardPage.clickMenuProject();
    }
}
