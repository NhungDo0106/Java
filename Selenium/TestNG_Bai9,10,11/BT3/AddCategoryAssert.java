package Baitap1_2;

import Bai10.Common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddCategoryAssert extends Basetest {
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
    @Test(priority = 2)//Kiem tra Text trang AddCategory
    public void testAddCategory1(){
        testLoginToCategory();// goi lai testLoginToCategory

        driver.findElement(By.xpath("//span[normalize-space()= 'Add New category']")).click();
        String TitleAdd = driver.findElement(By.xpath("//h5[normalize-space() ='Category Information']")).getText();
        System.out.println(TitleAdd);
        Assert.assertEquals(TitleAdd,"Category Information","Ten TitleAdd khong dung");

        String name = driver.findElement(By.xpath("//label[normalize-space()='Name']")).getText();
        System.out.println(name);
        Assert.assertEquals(name,"Name","Name khong dung");

        String Parent = driver.findElement(By.xpath("//label[normalize-space()='Parent Category']")).getText();
        System.out.println(Parent);
        Assert.assertEquals(Parent,"Parent Category","Parent Category khong dung");

        String Order = driver.findElement(By.xpath("//label[normalize-space()='Ordering Number']")).getText();
        System.out.println(Order);
        Assert.assertEquals(Order,"Ordering Number","Order khong dung");

        String Type = driver.findElement(By.xpath("//label[normalize-space()='Type']")).getText();
        System.out.println(Type);
        Assert.assertEquals(Type,"Type","Type khong dung");

        String Banner = driver.findElement(By.xpath("//label[normalize-space()='Banner (200x200)']")).getText();
        System.out.println(Banner);
        Assert.assertEquals(Banner,"Banner (200x200)","Banner khong dung");

        String Icon = driver.findElement(By.xpath("//label[normalize-space()='Icon (32x32)']")).getText();
        System.out.println(Icon);
        Assert.assertEquals(Icon,"Icon (32x32)","Icon khong dung");

        String MetaTitle = driver.findElement(By.xpath("//label[normalize-space()='Meta Title']")).getText();
        System.out.println(MetaTitle);
        Assert.assertEquals(MetaTitle,"Meta Title","MetaTitle khong dung");

        String MetaDescription = driver.findElement(By.xpath("//label[normalize-space()='Meta description']")).getText();
        System.out.println(MetaDescription);
        Assert.assertEquals(MetaDescription,"Meta description","MetaDescriptionr khong dung");

        String Filtering = driver.findElement(By.xpath("//label[normalize-space() = 'Filtering Attributes']")).getText();
        System.out.println(Filtering);
        Assert.assertEquals(Filtering,"Filtering Attributes","Filtering khong dung");

        boolean Save = driver.findElement(By.xpath("//button[normalize-space() = 'Save']")).isEnabled();
        Assert.assertTrue(Save, "Nut Save khong hien thi");

    }
    @Test(priority = 3)//Them moi thanh cong categories và kiem tra Text tren trang chu
    public void testAddCategory2(){
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
        sleep(1);
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
        String message = driver.findElement(By.xpath("//span[@data-notify='message']")).getText();
        System.out.println(message);
        Assert.assertEquals(message, "Category has been inserted successfully", "Dang ky khong thanh cong");

        String AllCategories = driver.findElement(By.xpath("//h1[normalize-space()='All categories']")).getText();
        System.out.println(AllCategories);
        Assert.assertEquals(AllCategories, "All categories", "Khong co title All categories");


        String Categories = driver.findElement(By.xpath("//h5[normalize-space()='Categories']")).getText();
        System.out.println(Categories);
        Assert.assertEquals(Categories, "Categories", "Khong co title Categories");


        boolean Add = driver.findElement(By.xpath("//span[normalize-space()='Add New category']")).isEnabled();
        Assert.assertTrue(Add,"Nut add khong hien thi");

    }
    @Test(priority = 4)
    public void testSearch() {
        testLoginToCategory();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).click();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys("Category1");
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys(Keys.ENTER);

        boolean searchcategory = driver.findElement(By.xpath("//table[@class='table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[2]")).isDisplayed();
        Assert.assertTrue(searchcategory,"Khong tim thay category vua tim");
    }
}
