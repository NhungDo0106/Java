package Thuchanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyWords {
    public static WebDriver driver;

    public KeyWords(WebDriver driver) {
        this.driver = driver;
    }
    public static void clickElement(String Locator){
        driver.findElement(By.xpath(Locator)).click();
    }
    public static void setText(String Locator, String text){
        driver.findElement(By.xpath(Locator)).sendKeys(text);
    }
    //cach 2 khong co ham static
//    public class KeyWords {
//        public static WebDriver driver;
//
//        public KeyWords(WebDriver driver) {
//            this.driver = driver;
//        }
//        public static void clickElement(String Locator){
//            driver.findElement(By.xpath(Locator)).click();
//        }
//        public static void setText(String Locator, String text){
//            driver.findElement(By.xpath(Locator)).sendKeys(text);
//        }
}
