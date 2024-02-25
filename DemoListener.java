package Bai31;

import Listeners.TestListener;
import drivers.DriverManager;
import keywords.WebUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.SkipException;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class DemoListener{
    WebDriver driver;

    @BeforeMethod
    public void setupDriver() {
        driver = new ChromeDriver();
        DriverManager.setDriver(driver);
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("Day la Beformethod");
    }


    @Test(priority = 1) //Success Test
    public void gotoPage() {
        driver.get("https://anhtester.com");
    }

    @Test(priority = 2) //Failed Test
    public void checkTitle() {
        String expectedTitle = "Anh Tester";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Title of the website do not match");
    }

    @Test(priority = 3)  //Skip Test
    public void skipTest() {
        throw new SkipException("Skipping The Test Method ");
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }

}
