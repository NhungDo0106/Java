package ThucHanhBai20_21.Test;

import org.openqa.selenium.Alert;
import ThucHanhBai20_21.Pages.CustomerPage;
import ThucHanhBai20_21.Pages.DashboardPage;
import ThucHanhBai20_21.Pages.LoginPage;
import ThucHanhBai20_21.Pages.ProjectPage;
import Thuchanh.Basetest;
import constant.ConfigData;
import org.testng.annotations.Test;

public class CustomerTest extends Basetest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;


    @Test(priority = 1)
    public void testOpenCustomer() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        loginPage.verifyLoginSuccess();

        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        customerPage.OpenCustomerHeader();
    }

    @Test(priority = 2)
    public void testOpenAddCustomer() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin@example.com", "123456");
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click button Add
        customerPage.clickButtonAddNew();
    }


    @Test(priority = 3)
    public void searchCustomer() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin@example.com", "123456");
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click textbox Search
        customerPage.searchCustomer("Customer");
    }

    @Test(priority = 4)
    public void OpenQuickCreate() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.OpenQuickCreatePage();
    }


    @Test(priority = 5)
    public void OpenInvoicePage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickInvoice();
    }

    @Test(priority = 6)
    public void OpenEstimatePage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickEstimate();
    }

    @Test(priority = 7)
    public void OpenProposalPage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickProposal();
    }

    @Test(priority = 8)
    public void OpenCreditNotePage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickCreditNote();
    }


    @Test(priority = 9)
    public void OpenCustomerPage() {
        ///Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickCustomer();
    }

    @Test(priority = 10)
    public void OpenSubscriptionPage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickSubscription();
    }


    @Test(priority = 11)
    public void OpenProjectPage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickProject();
    }

    @Test(priority = 12)
    public void OpenTaskPage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickTask();
    }


    @Test(priority = 13)
    public void OpenExpensePage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickExpense();
    }


    @Test(priority = 14)
    public void OpenContractPage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickContract();
    }


    @Test(priority = 15)
    public void OpenArticlePage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickArticle();
    }


    @Test(priority = 16)
    public void OpenTicketPage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickTicket();
    }


    @Test(priority = 17)
    public void OpenEventPage() {
        //Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.EMAIL, ConfigData.PASSWORD);
        //Click menu Customer
        customerPage = dashboardPage.clickMenuCustomer();
        //Click icon (+)
        customerPage.clickButtonCreate();
        customerPage.clickEvent();
    }
}
