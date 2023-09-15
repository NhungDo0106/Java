package Baitap.BT3_Part2;

import Baitap.Basetest;
import Baitap.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteCategoryAssert extends Basetest {
    @Test(priority = 1)
    public void deleteCategory(){
        Login();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).click();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys("Categoryedit");
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys(Keys.ENTER);
        sleep(1);

        boolean DisplayName1 = driver.findElement(By.xpath("//table[@class='table aiz-table mb-0 footable footable-1 breakpoint-xl']//tr[1]//td[2]")).isDisplayed();
        Assert.assertTrue(DisplayName1, "Khong hien category vua tim");

        driver.findElement(By.xpath("(//a[@title='Delete'])[1]")).click();
        driver.findElement(By.xpath("//a[@id='delete-link']")).click();
        String message = driver.findElement(By.xpath("//span[@data-notify='message']")).getText();
        System.out.println(message);
        Assert.assertEquals(message, "Category has been deleted successfully", "Deleted khong thanh cong");
        sleep(2);

        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).click();
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys("Categoryedit");
        driver.findElement(By.xpath("//input[@id = 'search']/parent::div//input")).sendKeys(Keys.ENTER);
        sleep(1);

        boolean DisplayMessage = driver.findElement(By.xpath("//td[normalize-space()='Nothing found']")).isDisplayed();
        System.out.println("Nothing found");
        Assert.assertTrue(DisplayMessage, "Category van con chua duoc xoa");
    }
}
