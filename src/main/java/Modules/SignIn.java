package Modules;

import Main.Base;
import Utilities.Elements;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.*;

public class SignIn extends Base {

    Elements e=new Elements();
    Faker f=new Faker();

    @Test(priority = 1)
    public void Signin() throws InterruptedException {
        driver.get("http://b2b.cartlow.lan/");
        Thread.sleep(3000);
    }

    @Test (priority = 2)
        public void email_field() throws InterruptedException, IOException {
            iDelay(5);

            WebElement emailAddress = driver.findElement(By.xpath(e.emailAddress));
        String path  = "C:\\Users\\Tabinda Rana\\IdeaProjects\\B2BCortlow\\src\\main\\resources\\Test.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br=new BufferedReader(fr);
        String str= br.readLine();
            String lname=f.name().lastName().toLowerCase();
            emailAddress.sendKeys(""+ str);
        }

            @Test(priority = 3)
            public void password_field() throws InterruptedException{

            iDelay(5);
                WebElement pass = driver.findElement(By.xpath(e.pass));
                pass.sendKeys("11555777");
            }

            @Test(priority = 4)
                    public void login_button() throws InterruptedException{
            iDelay(5);
            WebElement login_Btn=driver.findElement(By.xpath(e.login_Btn));
            login_Btn.click();

    }
}