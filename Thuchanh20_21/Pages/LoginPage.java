package ThucHanhBai20_21.Pages;

import constant.ConfigData;
import constant.checkElementExist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    //Khai bao driver cuc bo trong chinh class nay
    private WebDriver driver;
    private WebDriverWait wait;

    //Khai bao cac element dang doi tuong By (phuong thuc tim kiem)
    private By headerPage = By.xpath("//h1[normalize-space()='Login']");
    private By inputEmail = By.xpath("//input[@id ='email']");
    private By inputPassword = By.xpath("//input[@id ='password']");
    private By buttonLogin = By.xpath("//button[@type ='submit']");
    private By errorMessage = By.xpath("//div[@id='alerts']");
    private By errorMessageFormat = By.xpath("//div[@class='alert alert-danger text-center']");
    private By menuDashboard = By.xpath("//ul[@id='side-menu']");
    //private By menuDashboard = By.xpath("//span[normalize-space()= 'Dashboard']");
    public static String menuDashboard1 = "//ul[@id='side-menu']";

    //Khai bao ham xay dung de truyen driver tu ben ngoai vao chinh class nay su dung
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        //driver = _driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassword));
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickButtonLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLogin));
        driver.findElement(buttonLogin).click();
    }

    public void verifyLoginSuccess(){
        Assert.assertFalse(driver.getCurrentUrl().contains("authentication"),"Login khong thanh cong");
        String header = driver.findElement(menuDashboard).getText();
        System.out.println(header);
    }

    public void verifyLoginFail(){

        checkElementExist checkElement = new checkElementExist(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("authentication"),"FAIL. Khong con o trang Login");
        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed(),"Error message NOT displays");
        //Assert.assertTrue(driver.findElement(errorMessageFormat).isDisplayed(),"Error message format NOT displays");
        Assert.assertEquals(driver.findElement(errorMessage).getText(),"Invalid email or password","Content of error massage NOT match");
        Assert.assertFalse(checkElement.checkElementExist(menuDashboard1),"Fail. Den duoc trang Dashboard");
    }

    public void verifyLoginFormat(){
        Assert.assertTrue(driver.findElement(errorMessageFormat).isDisplayed(),"Error message format NOT displays");
    }

    // Cac ham xu ly cho chinh trang nay
    public DashboardPage loginCRM(String email, String password) {
        driver.get(ConfigData.URLCRM);
        setEmail(email);
        setPassword(password);
        clickButtonLogin();

        return new DashboardPage(driver);
    }
}
