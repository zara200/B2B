package Modules;

import Main.Base;
import Utilities.Elements;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;


public class Signup_Guest extends Base {

    Elements e= new Elements();
    Faker f=new Faker();



    @Test (priority = 1)
    public void fillSignUpForm(ITestContext context) throws InterruptedException {

        Thread.sleep(1500);
        WebElement guestAccessBtn = driver.findElement(By.xpath(e.guestAccessBtn));
        guestAccessBtn.click();
    }
        @Test(priority = 2)
        public void full_name(ITestContext context) throws InterruptedException {
            Thread.sleep(1500);
            WebElement name = driver.findElement(By.id(e.name));
            String lname = f.name().lastName().toLowerCase();
            context.setAttribute("Name", lname);
            name.sendKeys("demo" + lname);
        }
        @Test(priority = 3)
                public void phone_number() {
            WebElement num = driver.findElement(By.xpath(e.num));
            num.sendKeys("5039");
            num.sendKeys(f.number().digits(5));
        }

        @Test(priority = 4)
        public void email() throws IOException {
            WebElement email = driver.findElement(By.xpath(e.email));
            String lname=f.name().lastName().toLowerCase()+"@cartlow.lan";
            email.sendKeys(lname);
            FileWriter file=new FileWriter("src/main/resources/Test.txt",true);
            file.write(lname);
            file.write("\n");
            file.close();
        }

        @Test(priority = 5)
                public void password() {
            WebElement pas = driver.findElement(By.xpath(e.pass));
            pas.sendKeys("11555777");
        }

        @Test(priority = 6)
              public void checkbox() throws InterruptedException {
        WebElement chk=driver.findElement(By.xpath(e.chk));
        chk.click();
        WebElement guestAccess=driver.findElement(By.xpath(e.getGuestAcess));
        guestAccess.click();
            Thread.sleep(4500);


        }


}



