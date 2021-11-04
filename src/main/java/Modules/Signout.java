package Modules;

import Main.Base;
import Utilities.Elements;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Signout extends Base {

    Elements e=new Elements();
    Faker f=new Faker();

    @Test(priority = 1)
    public void sign_out_profile()throws InterruptedException{
        Thread.sleep(1500);
        WebElement sign_out_profile= driver.findElement(By.xpath(e.sign_out_profile));
        sign_out_profile.click();
    }
    @Test(priority = 2)
    public void signout_profile_btn() throws InterruptedException {
        Thread.sleep(300);
        WebElement profile= driver.findElement(By.xpath(e.p));
        profile.click();
    }

        @Test(priority = 3)
        public void logout_btn(){
       WebElement logout_btn= driver.findElement(By.xpath(e.logout_btn));
       logout_btn.click();
        }
    }

