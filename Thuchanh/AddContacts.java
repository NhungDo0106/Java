package Thuchanh;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddContacts extends Basetest {
    @Test(priority = 1)//Kiem tra header trang co dung
    public void checkheader() {
        Login();
        driver.findElement(By.xpath(Locator.inputSearchCustomers)).click();
        driver.findElement(By.xpath(Locator.inputSearchCustomers)).sendKeys("Company01");
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath(Locator.linkDetailCustomer)).isDisplayed(),"No matching records found");

        driver.findElement(By.xpath(Locator.linkDetailCustomer)).click();
        driver.findElement(By.xpath(Locator.linkScreenContracts)).click();
        Assert.assertTrue(driver.findElement(By.xpath(Locator.headercreenContracts)).isDisplayed(),"Khong hien thi header Contacts");
        driver.findElement(By.xpath(Locator.addNewContracts)).click();
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath(Locator.headerAddContactDialog)).isDisplayed(),"Khong hien thi header Dialog");
    }

    @Test(priority = 2)//Nhan button close
    public void addContractsClose() {
        screenContacts();
        driver.findElement(By.xpath(Locator.linkScreenContracts)).click();
        driver.findElement(By.xpath(Locator.headercreenContracts)).click();
        driver.findElement(By.xpath(Locator.addNewContracts)).click();
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath(Locator.headerAddContactDialog)).isDisplayed(),"Khong hien thi header Dialog");
        driver.findElement(By.xpath(Locator.chooseFile)).sendKeys(System.getProperty("user.dir")+ "/src/test/Resource/image/shin.jpg");
        driver.findElement(By.xpath(Locator.inputFristName)).sendKeys("Nhung");
        driver.findElement(By.xpath(Locator.inputLastname)).sendKeys("Do");
        driver.findElement(By.xpath(Locator.inputPosition)).sendKeys("Position1");
        driver.findElement(By.xpath(Locator.inputEmail)).sendKeys("aaa@gmail.com");
        driver.findElement(By.xpath(Locator.clickdropdownDirection)).click();
        driver.findElement(By.xpath(Locator.selectDirection)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.inputPasswordContact)).sendKeys("123456");
        sleep(1);
        driver.findElement(By.xpath(Locator.buttonGenerate)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.buttonShowPassword)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.checkboxDoNotSendEmail)).click();
        driver.findElement(By.xpath(Locator.buttonCloseContact)).click();
    }
    @Test(priority = 3)//Nhan button save
    public void addContracts() {
        screenContacts();
        driver.findElement(By.xpath(Locator.linkScreenContracts)).click();
        driver.findElement(By.xpath(Locator.headercreenContracts)).click();
        driver.findElement(By.xpath(Locator.addNewContracts)).click();
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath(Locator.headerAddContactDialog)).isDisplayed(),"Khong hien thi header Dialog");
        driver.findElement(By.xpath(Locator.chooseFile)).sendKeys(System.getProperty("user.dir")+ "/src/test/Resource/image/shin.jpg");
        driver.findElement(By.xpath(Locator.inputFristName)).sendKeys("Nhung");
        driver.findElement(By.xpath(Locator.inputLastname)).sendKeys("Do");
        driver.findElement(By.xpath(Locator.inputPosition)).sendKeys("Position1");
        driver.findElement(By.xpath(Locator.inputEmail)).sendKeys("aaa@gmail.com");
        driver.findElement(By.xpath(Locator.inputPhoneNumber)).sendKeys("0969111222");
        driver.findElement(By.xpath(Locator.clickdropdownDirection)).click();
        driver.findElement(By.xpath(Locator.selectDirection)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.inputPasswordContact)).sendKeys("123456");
        sleep(1);
        driver.findElement(By.xpath(Locator.buttonGenerate)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.buttonShowPassword)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.checkboxDoNotSendEmail)).click();
        driver.findElement(By.xpath(Locator.buttonSaveContacts)).click();

        //Kiem tra them moi thanh cong hay khong
        driver.findElement(By.xpath(Locator.inputSearchContact)).click();
        driver.findElement(By.xpath(Locator.inputSearchContact)).sendKeys("Nhung");
        Assert.assertTrue(driver.findElement(By.xpath(Locator.inputSearchContact)).isDisplayed(),"No matching records found");
    }
    @Test(priority = 4)//Kiem tra hien thi dung du lieu da nhap
    public void checkDisplay() {
        screenContacts();
        driver.findElement(By.xpath(Locator.linkScreenContracts1)).click();
        driver.findElement(By.xpath(Locator.headercreenContracts)).click();
        sleep(1);
        driver.findElement(By.xpath(Locator.inputSearchContact)).click();
        driver.findElement(By.xpath(Locator.inputSearchContact)).sendKeys("Nhung");
        Assert.assertTrue(driver.findElement(By.xpath(Locator.inputSearchContact)).isDisplayed(),"No matching records found");
        sleep(1);
        driver.findElement(By.xpath(Locator.linkDetailContactst)).click();
        driver.findElement(By.xpath(Locator.headercreenContracts)).click();
        Assert.assertEquals(driver.findElement(By.xpath(Locator.inputFristName)).getAttribute("value"),FIRST_NAME,"Khong phai gia tri Frist Name");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.inputLastname)).getAttribute("value"),LAST_NAME,"Khong phai gia tri Last Name");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.inputPosition)).getAttribute("value"),POSITION,"Khong phai gia tri Position");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.inputEmail)).getAttribute("value"),EMAIL,"Khong phai gia tri Email");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.inputPhoneNumber)).getAttribute("value"),PHONECONTACT,"Khong phai gia tri Phone");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.getTextDirectionContacts)).getText(), DIRECTION, "Gia tri Direction khong dung");
        Assert.assertFalse(driver.findElement(By.xpath(Locator.inputPasswordContact)).isDisplayed() ,"Hien password");
    }
}
