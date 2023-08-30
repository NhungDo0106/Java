package Bai10.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Basetest {

    public static WebDriver driver;


    @BeforeMethod //chay truoc moi @Test
    public void createBrowser() { //TestNg ko dung static
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    public void Login(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
    }
    public void createBrowser(String browserName) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        }

        if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        }

        if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        }

        if (browserName.equals("safari")) {
            driver = new SafariDriver();
        }
    }

    @AfterMethod
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public void sleep(double second) {
        try {
            Thread.sleep((long) (2000 * second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
