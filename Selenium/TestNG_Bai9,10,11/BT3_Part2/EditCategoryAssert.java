package Baitap.BT3_Part2;

import Baitap.Basetest;
import Baitap.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditCategoryAssert extends Basetest {
    @Test(priority = 1)
    public void testSearch() {
        Login();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).click();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys("Category1");
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys(Keys.ENTER);
        sleep(1);

        boolean searchcategory1 = driver.findElement(By.xpath("//table[@class='table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[2]")).isDisplayed();
        Assert.assertTrue(searchcategory1,"Khong tim thay category vua tim");

        driver.findElement(By.xpath("(//a[@title='Edit'])[1]")).click();
        //Clear name
        driver.findElement(By.xpath("//input[@value='Category1']")).clear();
        //Input Name
        driver.findElement(By.xpath("//input[@value='Category1']")).sendKeys("Categoryedit");


        // Click vao dropdown Parent Category
        driver.findElement(By.xpath("//label[normalize-space()='Parent Category']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Parent Category']/following-sibling::div//input")).sendKeys("Arc");
        sleep(1);
        driver.findElement(By.xpath("//li[normalize-space()='Arc']")).click();
        sleep(1);


        //Clear number
        driver.findElement(By.xpath("//input[@id='order_level']")).clear();
        //Input Order
        driver.findElement(By.xpath("//input[@id='order_level']")).sendKeys("0969123456");


        // Select dropdown Type
        Select select = new Select(driver.findElement(By.xpath("//select[@name='digital']")));
        select.selectByVisibleText("Physical");
        sleep(1);
        select.getFirstSelectedOption().getText();


        //Select image Banner
        driver.findElement(By.xpath("(//div[@class='input-group-text bg-soft-secondary font-weight-medium'][normalize-space()='Browse'])[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("icon");
        sleep(2);
        driver.findElement(By.xpath("//div[@title='icon.jpg']")).click();
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();


        //Select image Icon
        sleep(1);
        driver.findElement(By.xpath("(//div[@class='input-group-text bg-soft-secondary font-weight-medium'][normalize-space()='Browse'])[2]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("play");
        sleep(2);
        driver.findElement(By.xpath("//div[@title='play.jpg']")).click();
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();


        //Clear Meta title
        driver.findElement(By.xpath("//input[@name = 'meta_title']")).clear();
        //Input Meta title
        driver.findElement(By.xpath("//input[@name = 'meta_title']")).sendKeys("Meta Title2");


        //Clear Meta Description
        driver.findElement(By.xpath("//textarea[@name='meta_description']")).clear();
        //Input Description
        sleep(1);
        driver.findElement(By.xpath("//textarea[@name='meta_description']")).sendKeys("Description2");


        //Clear Slug
        driver.findElement(By.xpath("//input[@id='slug']")).clear();
        //Input Description
        sleep(1);
        driver.findElement(By.xpath("//input[@id='slug']")).sendKeys("Slug");



        // Select dropdown Filtering Acttributes
        driver.findElement(By.xpath("//label[normalize-space()='Filtering Attributes']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Filtering Attributes']/following-sibling::div//input")).sendKeys("Fabric");
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Fabric']")).click();


        //Click button Save
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        String message = driver.findElement(By.xpath("//span[@data-notify='message']")).getText();
        System.out.println(message);
        Assert.assertEquals(message, "Category has been updated successfully", "Update khong thanh cong");
        sleep(1);

    }
    @Test(priority = 2)
    public void searchEditCategory() {
        Login();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).click();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys("Categoryedit");
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys(Keys.ENTER);
        sleep(1);

        boolean DisplayName = driver.findElement(By.xpath("//table[@class='table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[2]")).isDisplayed();
        Assert.assertTrue(DisplayName, "Khong hien category vua tim");

        boolean DisplayParent = driver.findElement(By.xpath("//table[@class = 'table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[3]")).isDisplayed();
        Assert.assertTrue(DisplayParent,"Khong hien dung ten Parent");


        boolean DisplayOrder = driver.findElement(By.xpath("//table[@class = 'table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[4]")).isDisplayed();
        Assert.assertTrue(DisplayOrder,"Khong hien dung ten Order Level");

        boolean DisplayBanner = driver.findElement(By.xpath("//table[@class = 'table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[6]")).isDisplayed();
        Assert.assertTrue(DisplayParent,"Khong hien dung ten Parent");


        boolean DisplayIcon = driver.findElement(By.xpath("//table[@class = 'table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[7]")).isDisplayed();
        Assert.assertTrue(DisplayParent,"Khong hien dung ten Parent");
    }
}
