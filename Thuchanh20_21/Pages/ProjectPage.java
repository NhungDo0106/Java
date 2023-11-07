package ThucHanhBai20_21.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By buttonAddNewProject = By.xpath("//a[normalize-space()='New Project']");
    private By inputSearchProject = By.xpath("//div[@id='DataTables_Table_0_filter']//input[@type=\"search\"]");

    public ProjectPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickButtonAddNew(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAddNewProject));
        driver.findElement(buttonAddNewProject).click();
    }

    public void searchCustomer(String customerName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchProject));
        driver.findElement(inputSearchProject).sendKeys(customerName);
    }
}
