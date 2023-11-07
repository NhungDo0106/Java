package ThucHanhBai20_21.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By menuDashboard = By.xpath("//span[normalize-space()='Dashboard']");
    private By menuCustomers = By.xpath("//span[normalize-space()='Customers']");
    private By menuProjects = By.xpath("//span[normalize-space()='Projects']");
    private By dropdownLogout = By.xpath("//li[contains(@class,'icon header-user-profile')]");
    private By Logout = By.xpath("//ul[@class='dropdown-menu animated fadeIn']//li[@class='header-logout']//a[normalize-space()='Logout']");

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickMenuDashboard(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuDashboard));
        driver.findElement(menuDashboard).click();
    }

    public CustomerPage clickMenuCustomer(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuDashboard));
        driver.findElement(menuCustomers).click();

        return new CustomerPage(driver);
    }

    public ProjectPage clickMenuProject(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuDashboard));
        driver.findElement(menuProjects).click();

        return new ProjectPage(driver);
    }

    public LoginPage clickLogout(){
        driver.findElement(dropdownLogout).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuDashboard));
        driver.findElement(Logout).click();

        return new LoginPage(driver);
    }
}
