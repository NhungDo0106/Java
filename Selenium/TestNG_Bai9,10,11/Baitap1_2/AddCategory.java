package Baitap1_2;

import Bai10.Common.Basetest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class AddCategory extends Basetest {
    @Test(priority = 1)
    public void testLoginToCategory(){
        driver.get("https://cms.anhtester.com/login");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space() = 'Products']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Category']")).click();
    }
    @Test(priority = 2)
    public void testAddCategory(){
        testLoginToCategory();// goi lai testLoginToCategory
        driver.findElement(By.xpath("//span[normalize-space()= 'Add New category']")).click();
        //Input Name
        driver.findElement(By.xpath("(//form[@class='form-horizontal']/child::div)/child::div//input[@id= 'name']")).sendKeys("Category1");
        // Click vao dropdown Parent Category
        driver.findElement(By.xpath("//label[normalize-space()='Parent Category']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Parent Category']/following-sibling::div//input")).sendKeys("Demo");
        sleep(1);
        driver.findElement(By.xpath("//li[normalize-space()='Demo category 1']")).click();
        sleep(1);
        //Input Order
        driver.findElement(By.xpath("//input[@id='order_level']")).sendKeys("0123456789");
        // Select dropdown Type
        Select select = new Select(driver.findElement(By.xpath("//select[@name='digital']")));
        select.selectByVisibleText("Digital");
        sleep(1);
        select.getFirstSelectedOption().getText();
        //Select image Banner
        driver.findElement(By.xpath("(//div[@class='input-group-text bg-soft-secondary font-weight-medium'][normalize-space()='Browse'])[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("sting.jpg");
        sleep(2);
        driver.findElement(By.xpath("//div[@title='stingvang.jpg']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
        //Select image Icon
        sleep(1);
        driver.findElement(By.xpath("(//div[@class='input-group-text bg-soft-secondary font-weight-medium'][normalize-space()='Browse'])[2]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("Cosy.jpg");
        sleep(2);
        driver.findElement(By.xpath("//div[@title='Cosy.png']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
        //Input Meta title
        driver.findElement(By.xpath("//input[@name = 'meta_title']")).sendKeys("Meta Title1");
        //Input Description
        sleep(1);
        driver.findElement(By.xpath("//textarea[@name='meta_description']")).sendKeys("Description");
        //// Select dropdown Filtering Acttributes
        driver.findElement(By.xpath("//label[normalize-space()='Filtering Attributes']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Filtering Attributes']/following-sibling::div//input")).sendKeys("Size");
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Size']")).click();
        //Click button Save
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    }
    @Test(priority = 3)
    public void testSearch() {
        testLoginToCategory();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).click();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys("Category1");
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys(Keys.ENTER);

        List<WebElement> columName = driver.findElements(By.xpath("//table[@class='table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[2]"));

        boolean NameCategory=false;

        for (WebElement ele:columName)
        {
            String value = ele.getText();
            System.out.println(value);
            if (value.contains("Category1"))
            {
                NameCategory=true;

            }else {
                System.out.println("Khong co ten gia tri vua tim");
            }

        }
    }
}
