package Modules;

import Main.Base;
import Utilities.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Admin extends Base {

    Elements e=new Elements();

    @Test (priority = 1)
    public void admin_login() throws InterruptedException {

        driver.get("http://admin.cartlow.lan/");
        Thread.sleep(1500);
    }

    @Test(priority = 2)
            public void admin_email(){
        WebElement admin_email = driver.findElement(By.xpath(e.admin_email));
        admin_email.sendKeys("azeem.hassan@cartlow.com");
    }

    @Test(priority = 3)
            public void admin_password() {
        WebElement admin_password = driver.findElement(By.xpath(e.admin_password));
        admin_password.sendKeys("Cartlow@12");
    }

    @Test(priority = 4)
            public void admin_submitBtn(){
        WebElement admin_submit=driver.findElement(By.xpath(e.admin_submit));
        admin_submit.click();

    }

    @Test (priority = 5)
    public void Click_B2B() throws InterruptedException {

        iDelay(5);
        WebElement b2b = driver.findElement(By.xpath(e.b2b));
        b2b.click();
    }

    @Test(priority = 6)
            public void guest_users() {

        WebElement guests_users = driver.findElement(By.xpath(e.guests_users));
        guests_users.click();
    }
    @Test(priority = 7)
            public void complete_button() {
        WebElement complete_Admin = driver.findElement(By.xpath(e.complete_Admin));
        complete_Admin.click();
    }
    @Test (priority = 8)
            public void approve_users(){

        WebElement approve= driver.findElement(By.xpath(e.approve));
        approve.click();
        driver.switchTo().alert().accept();
    }
}
