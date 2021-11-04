package Modules;

import Main.Base;
import Utilities.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Order_flow extends Base{


        Elements e=new Elements();

        @Test (priority = 1)
        public void select_category()  throws InterruptedException {

            Thread.sleep(4000);
            WebElement mobile = driver.findElement(By.xpath(e.f_mobile));
            mobile.click();
        }


        @Test (priority = 2)
        public void Add_to_cart() throws InterruptedException {

            Thread.sleep(3000);
            WebElement add_to_cart = driver.findElement(By.xpath(e.f_add_to_cart));
            add_to_cart.click();
        }
            @Test(priority = 3)
                    public void cross_cart_button() throws InterruptedException {
                Thread.sleep(3000);
                WebElement cross_button = driver.findElement(By.xpath(e.f_cross_button));
                cross_button.click();
            }

            @Test(priority = 4)
                    public void cart_btn() throws InterruptedException {
            Thread.sleep(3000);
            WebElement cart_button=driver.findElement(By.xpath(e.f_cart_button));
            cart_button.click();

        }
        @Test (priority = 5)
        public void Order_place() throws InterruptedException{

            Thread.sleep(1000);
            WebElement order_place= driver.findElement(By.xpath(e.f_order_place));
            order_place.click();
            Thread.sleep(3000);
            driver.get("http://b2b.cartlow.lan/account");
            Thread.sleep(1500);
            driver.navigate().refresh();

        }


        @Test (priority = 6)
        public void Cancel_Order() throws InterruptedException {

            Thread.sleep(5000);
            WebElement delete = driver.findElement(By.xpath(e.f_delete));
            delete.click();
        }
        @Test(priority = 7)
                public void select_reason() throws InterruptedException {

            Thread.sleep(1500);
            WebElement reason = driver.findElement(By.xpath(e.f_reason));
            reason.sendKeys("Change my mind");
        }
        @Test(priority = 8)
                public void Cancel_order_btn() throws InterruptedException {
            Thread.sleep(1500);
            WebElement cancel_button= driver.findElement(By.xpath(e.f_cancel_button));
            cancel_button.click();
        }
    }
