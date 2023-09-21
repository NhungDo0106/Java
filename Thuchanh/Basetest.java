package Thuchanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Basetest {

    public static WebDriver driver;
    String COMPANY = "Company01";
    String VAT = "10";
    String PHONE = "0969111222";
    String WEBSITE = "abc@gmail.com";
    String GROUPS = "VIP";
    String CURRENCY = "USD";
    String LANGUAGE = "Italian";
    String ADDRESS = "Thot Not";
    String CITY = "Can Tho";
    String STATE = "State1";
    String CODE = "Code1";
    String COUNTRY = "Vietnam";

    String FIRST_NAME = "Nhung";
    String LAST_NAME = "Do";
    String POSITION = "Position1";
    String EMAIL = "aaa@gmail.com";
    String PHONECONTACT = "0969111222";
    String DIRECTION = "LTR";
    String PASSWORDCONTACT = "123456";
    String PASSDISPLAY = " ";

    //@BeforeMethod //chay truoc moi @Test
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
        driver.findElement(By.xpath("//span[normalize-space() = 'Customers']")).click();
    }
    public void screenContacts(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space() = 'Customers']")).click();

        driver.findElement(By.xpath(Locator.inputSearchCustomers)).click();
        driver.findElement(By.xpath(Locator.inputSearchCustomers)).sendKeys("Company01");
        sleep(1);
        boolean searchcustomer = driver.findElement(By.xpath(Locator.linkDetailCustomer)).isDisplayed();
        Assert.assertTrue(searchcustomer,"No matching records found");

        driver.findElement(By.xpath(Locator.linkDetailCustomer)).click();
    }
    public void CaptureScreenImage(String imageName) throws AWTException, IOException {

        Robot robot = new Robot();

        //Get size screen browser
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize);
        //Khởi tạo kích thước khung hình với kích cỡ trên
        Rectangle screenRectangle = new Rectangle(screenSize);
        //Tạo hình chụp với độ lớn khung đã tạo trên
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        //Lưu hình vào dạng file với dạng png
        File file = new File(imageName + ".png");
        ImageIO.write(image, "png", file);
    }
    @BeforeMethod
    @Parameters({"browser"})
    public void createBrowser(@Optional("chrome") String browserName) {
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
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
