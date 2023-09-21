package Thuchanh;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.security.Key;

public class AddCustomer extends Basetest {
    @Test(priority = 1)//Khi nhan button Save
    public void testAddNewCustomer1() {
        Login();
        Assert.assertTrue(driver.findElement(By.xpath(Locator.menuDashboard)).isDisplayed(), "Khong phai trang Dashboard");
        Assert.assertTrue(driver.findElement(By.xpath(Locator.headerCustomersSummary)).isDisplayed(), "Khong phai trang login");
        driver.findElement(By.xpath(Locator.menuCustomers)).click();

        Assert.assertTrue(driver.findElement(By.xpath(Locator.headerCustomersSummary)).isDisplayed(), "Khong den duoc tran Customer");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.headerCustomersSummary)).getText(), "Customers Summary", "Ten header Customer page khong dung");
        sleep(1);

        driver.findElement(By.xpath(Locator.buttonNewCustomer)).click();
        driver.findElement(By.xpath(Locator.inputCompany)).sendKeys("CompanyA");
        driver.findElement(By.xpath(Locator.inputVATNumber)).sendKeys("10");
        driver.findElement(By.xpath(Locator.inputPhone)).sendKeys("0123456789");
        driver.findElement(By.xpath(Locator.inputWebsite)).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath(Locator.clickdropdownGroups)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.inputSearchdropdownGroupt)).sendKeys("VIP");
        sleep(1);
        driver.findElement(By.xpath(Locator.inputSearchdropdownGroupt)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(Locator.clickdropdownGroups)).click();
        sleep(1);


        driver.findElement(By.xpath(Locator.clickdropdownCurrency)).click();
        driver.findElement(By.xpath(Locator.inputSearchdropdownCurrency)).sendKeys("USD");
        driver.findElement(By.xpath(Locator.clickdropdownCurrency)).sendKeys(Keys.ENTER);
        sleep(1);


        driver.findElement(By.xpath(Locator.clickdropdownLanguage)).click();
        driver.findElement(By.xpath(Locator.selectLanguage)).click();
        sleep(1);


        driver.findElement(By.xpath(Locator.inputAddress)).sendKeys("Thot Not");
        driver.findElement(By.xpath(Locator.inputCity)).sendKeys("Can Tho");
        driver.findElement(By.xpath(Locator.inputState)).sendKeys("OK");
        driver.findElement(By.xpath(Locator.inputCode)).sendKeys("Code");


        driver.findElement(By.xpath(Locator.clickdropdownCountry)).click();
        driver.findElement(By.xpath(Locator.inputSearchcountry)).sendKeys("viet");
        sleep(1);
        driver.findElement(By.xpath(Locator.clickdropdownCountry)).sendKeys(Keys.ENTER);
        sleep(1);

        driver.findElement(By.xpath(Locator.clickSave)).click();

    }
    @Test(priority = 2)//Khi nhan button Save
    public void testAddNewCustomer2() {
        Login();
        //Khoi tao doi tuong class cho ActionKeywords de nhan gia tri driver
        //Cach 1 khai bao static
//        new KeyWords(driver);
        //Cach 2 khong co static
//        KeyWords Nhung = new KeyWords(driver);

        Assert.assertTrue(driver.findElement(By.xpath(Locator.headerCustomersSummary)).isDisplayed(), "Khong phai trang login");
        driver.findElement(By.xpath(Locator.menuCustomers)).click();

        Assert.assertTrue(driver.findElement(By.xpath(Locator.headerCustomersSummary)).isDisplayed(), "Khong den duoc tran Customer");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.headerCustomersSummary)).getText(), "Customers Summary", "Ten header Customer page khong dung");
        sleep(1);

        driver.findElement(By.xpath(Locator.buttonNewCustomer)).click();
        driver.findElement(By.xpath(Locator.inputCompany)).sendKeys("CompanyB");
        driver.findElement(By.xpath(Locator.inputVATNumber)).sendKeys("10");
        driver.findElement(By.xpath(Locator.inputPhone)).sendKeys("0123456789");
        driver.findElement(By.xpath(Locator.inputWebsite)).sendKeys("abc@gmail.com");
        //Cach 1 co static
//        Nhung.setText(Locator.inputCompany,"CompanyB");
//        Nhung.setText(Locator.inputVATNumber,"10");
//        Nhung.setText(Locator.inputPhone,"0123456789");
//        Nhung.setText(Locator.inputWebsite,"abc@gmail.com");
        //Cach 2 khong co static
//        Nhung.setText(Locator.inputCompany,"CompanyB");
//        Nhung.setText(Locator.inputVATNumber,"10");
//        Nhung.setText(Locator.inputPhone,"0123456789");
//        Nhung.setText(Locator.inputWebsite,"abc@gmail.com");


        driver.findElement(By.xpath(Locator.clickdropdownGroups)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.inputSearchdropdownGroupt)).sendKeys("VIP");
        sleep(1);
        driver.findElement(By.xpath(Locator.inputSearchdropdownGroupt)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(Locator.clickdropdownGroups)).click();
        sleep(1);


        driver.findElement(By.xpath(Locator.clickdropdownCurrency)).click();
        driver.findElement(By.xpath(Locator.inputSearchdropdownCurrency)).sendKeys("USD");
        driver.findElement(By.xpath(Locator.clickdropdownCurrency)).sendKeys(Keys.ENTER);
        sleep(1);


        driver.findElement(By.xpath(Locator.clickdropdownLanguage)).click();
        driver.findElement(By.xpath(Locator.selectLanguage)).click();
        sleep(1);


        driver.findElement(By.xpath(Locator.inputAddress)).sendKeys("Thot Not");
        driver.findElement(By.xpath(Locator.inputCity)).sendKeys("Can Tho");
        driver.findElement(By.xpath(Locator.inputState)).sendKeys("OK");
        driver.findElement(By.xpath(Locator.inputCode)).sendKeys("Code");


        driver.findElement(By.xpath(Locator.clickdropdownCountry)).click();
        driver.findElement(By.xpath(Locator.inputSearchcountry)).sendKeys("viet");
        sleep(1);
        driver.findElement(By.xpath(Locator.clickdropdownCountry)).sendKeys(Keys.ENTER);
        sleep(1);

        //driver.findElement(By.xpath(Locator.clickSaveandCreat)).click();
    }
    @Test(priority = 3)//Khi nhan button Save
    public void search() {
        Login();
        driver.findElement(By.xpath(Locator.inputSearchCustomers)).click();
        driver.findElement(By.xpath(Locator.inputSearchCustomers)).sendKeys("Company01");
        Assert.assertTrue(driver.findElement(By.xpath(Locator.linkDetailCustomer)).isDisplayed(),"No matching records found");
    }
    @Test(priority = 4)//Khi nhan button Save
    public void checkvalue() {
        Login();

        SoftAssert softAssert = new SoftAssert();
        driver.findElement(By.xpath(Locator.inputSearchCustomers)).click();
        driver.findElement(By.xpath(Locator.inputSearchCustomers)).sendKeys(COMPANY);
        sleep(1);
        softAssert.assertTrue(driver.findElement(By.xpath(Locator.linkDetailCustomer)).isDisplayed(),"No matching records found");

        driver.findElement(By.xpath(Locator.linkDetailCustomer)).click();
        softAssert.assertTrue(driver.findElement(By.xpath(Locator.headerProfile)).isDisplayed(), "Khong phai trang Profile");
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputCompany)).getAttribute("value"), COMPANY , "Gia tri company khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputVATNumber)).getAttribute("value"), VAT , "Gia tri VAT khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputPhone)).getAttribute("value"), PHONE , "Gia tri phone khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputWebsite)).getAttribute("value"), WEBSITE , "Gia tri website khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.getTextGroupts)).getText(), GROUPS, "Gia tri Groupt khong dung");
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.getTextCurrency)).getText(), CURRENCY, "Gia tri Currency khong dung");
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.getTextLanguage)).getText(), LANGUAGE, "Gia tri Language khong dung");

        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputAddress)).getAttribute("value"), ADDRESS , "Gia tri address khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputCity)).getAttribute("value"), CITY , "Gia tri city khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputState)).getAttribute("value"), STATE , "Gia tri state khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.inputCode)).getAttribute("value"), CODE , "Gia tri code khong dung" );
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.getTextCountry)).getText(), COUNTRY, "Gia tri Country khong dung");

        softAssert.assertAll();
    }
}
