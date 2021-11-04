package Main;

import Utilities.Elements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base {



    public static WebDriver driver;
    Elements e=new Elements();


    @BeforeTest
    public void main() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://b2b.cartlow.lan/");

    }

    public void iDelay(int j){driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(j));}

    public void iDelay (int i ,String xpath){

        WebDriverWait webDriverWait=new WebDriverWait(driver , Duration.ofSeconds(i));
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));

    }
    public void Delay(int j) throws InterruptedException{


        for(int i=0; i<j; i++){
            Thread.sleep(1500);
        }

    }
    public void iwait(int a){
        driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);


    }

}