package Baitap.Buoi2;

import Baitap.Buoi1.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddNewCustomer {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(Locator.inputEmail)).clear();
        driver.findElement(By.xpath(Locator.inputPassword)).clear();
        driver.findElement(By.xpath(Locator.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(Locator.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(Locator.buttonLogin)).click();
        driver.findElement(By.xpath("//span[normalize-space() = 'Customers']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();

        Thread.sleep(2000);

        //Dang ky thanh cong
        driver.findElement(By.xpath(Locator.inputCompany)).sendKeys("Company A");
        driver.findElement(By.xpath(Locator.inputVATNumber)).sendKeys("VAT10%");
        driver.findElement(By.xpath(Locator.inputPhone)).sendKeys("0969111222");
        driver.findElement(By.xpath(Locator.inputWebsite)).sendKeys("abc@gmail.com");
//        driver.findElement(By.xpath(Locator.clickdropdownGroups)).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@aria-controls = 'bs-select-1']")).sendKeys("VIP");
//        driver.findElement(By.xpath(Locator.clickdropdownCurrency)).click();
//        driver.findElement(By.xpath(Locator.inputSearchdropdownCurrency)).sendKeys("");
        driver.findElement(By.xpath(Locator.clickdropdownLanguage)).click();
        driver.findElement(By.xpath(Locator.selectLanguage)).click();
        driver.findElement(By.xpath(Locator.inputAddress)).sendKeys("Note");
        driver.findElement(By.xpath(Locator.inputCity)).sendKeys("HCM");
        driver.findElement(By.xpath(Locator.inputState)).sendKeys("Action");
        driver.findElement(By.xpath(Locator.inputCode)).sendKeys("code1");
//        driver.findElement(By.xpath(Locator.clickCountry)).click();
//        driver.findElement(By.xpath(Locator.selectCountry)).click();
        driver.findElement(By.xpath(Locator.clickSaveandCreat)).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
