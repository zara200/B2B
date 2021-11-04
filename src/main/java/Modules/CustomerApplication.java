package Modules;

import Main.Base;
import Utilities.Elements;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class CustomerApplication extends Base {


    Elements e = new Elements();
    Faker f = new Faker();
    Signup_Guest signup = new Signup_Guest();

    @Test(priority = 1)
    public void clickCompleteButton() throws InterruptedException {

        Thread.sleep(3000);
        WebElement crs = driver.findElement(By.xpath(e.crs));
        crs.click();

        Thread.sleep(3000);
        WebElement completeButton = driver.findElement(By.xpath(e.completeButton));
        completeButton.click();

    }

    @Test(priority = 2)
    public void User_fname() {

        WebElement firstname = driver.findElement(By.xpath(e.firstname));
        firstname.sendKeys("");

    }

    @Test(priority = 2)
    public void User_lname() {
        WebElement lastname = driver.findElement(By.xpath(e.lastname));
        lastname.sendKeys("Demo");
    }

    @Test(priority = 4)
    public void User_company() {

        WebElement company = driver.findElement(By.xpath(e.company));
        company.sendKeys(f.company().name());

    }

    @Test(priority = 5)
    public void User_campanyWeb() {
        WebElement companyWeb = driver.findElement(By.xpath(e.companyWeb));
        companyWeb.sendKeys("testingweb@cartlow.com");
    }


    @Test(priority = 6)
    public void officeAddress() {

        WebElement oAddress1 = driver.findElement(By.xpath(e.oAddress1));
        oAddress1.sendKeys(f.address().fullAddress());

        WebElement oAddress2 = driver.findElement(By.xpath(e.oAddress2));
        oAddress2.sendKeys(f.address().secondaryAddress());
    }

    @Test(priority = 7)
    public void office_city() {

        WebElement oCity = driver.findElement(By.xpath(e.oCity));
        oCity.sendKeys(f.address().city());
    }

    @Test(priority = 8)
    public void office_state() {
        WebElement oState = driver.findElement(By.xpath(e.oState));
        oState.sendKeys(f.address().state());
    }

    @Test(priority = 9)
    public void office_zip() {
        WebElement oZip = driver.findElement(By.xpath(e.oZip));
        oZip.sendKeys(f.address().zipCode());
    }

    @Test(priority = 10)
    public void office_country() {
        WebElement oCountry = driver.findElement(By.xpath(e.oCountry));
        Select se = new Select(oCountry);
        se.selectByIndex(3);
    }

    @Test(priority = 11)
    public void shippingAddress() {

        WebElement sAddress1 = driver.findElement(By.xpath(e.sAddress1));
        sAddress1.sendKeys(f.address().fullAddress());

        WebElement sAddress2 = driver.findElement(By.xpath(e.sAddress2));
        sAddress2.sendKeys(f.address().secondaryAddress());
    }

    @Test(priority = 12)
    public void shipping_city() {
        WebElement sCity = driver.findElement(By.xpath(e.sCity));
        sCity.sendKeys(f.address().city());
    }

    @Test(priority = 13)
    public void shipping_state() {
        WebElement sState = driver.findElement(By.xpath(e.sState));
        sState.sendKeys(f.address().state());
    }

    @Test(priority = 14)
    public void shipping_zip() {
        WebElement sZip = driver.findElement(By.xpath(e.sZip));
        sZip.sendKeys(f.address().zipCode());
    }

    @Test(priority = 15)
    public void shipping_option() {
        WebElement sOption = driver.findElement(By.xpath(e.sOption));
        sOption.click();
        Select se = new Select(sOption);
        se.selectByIndex(4);
    }

    @Test(priority = 16)
    public void businessInformation_currency() {

        WebElement bCurrency = driver.findElement(By.xpath(e.bCurrency));
        bCurrency.click();
        Select se = new Select(bCurrency);
        se.selectByIndex(1);
    }

    @Test(priority = 17)
    public void business_radioBtn() {
        WebElement bRadioBtn = driver.findElement(By.xpath(e.bRadioBtn));
        bRadioBtn.click();
    }

    @Test(priority = 18)
    public void business_anual_sale() {

        WebElement bAnualSales = driver.findElement(By.xpath(e.bAnualSales));
        bAnualSales.click();
        Select select = new Select(bAnualSales);
        select.selectByIndex(1);
    }

    @Test(priority = 19)
    public void business_company_type() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement bTypeCompany = driver.findElement(By.xpath(e.bTypeCompany));
        bTypeCompany.click();
        Select sel = new Select(bTypeCompany);
        sel.selectByIndex(2);
        WebElement click_company= driver.findElement(By.xpath(e.click_company));
        click_company.click();


    }

    @Test(priority = 20)
    public void uploadImages() throws InterruptedException {

        Thread.sleep(3000);
        WebElement utradeimage = driver.findElement(By.xpath(e.utradeimage));
        utradeimage.sendKeys("C://Users//Tabinda Rana//Downloads//b2b.docx");

        Thread.sleep(1500);
        WebElement trnimage = driver.findElement(By.xpath(e.trnimage));
        trnimage.sendKeys("C://Users//Tabinda Rana//Downloads//b2b.docx");

    }

    @Test(priority = 21)
    public void submit() throws InterruptedException {

        Thread.sleep(1500);
        WebElement submit = driver.findElement(By.xpath(e.submit));
        submit.click();
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");


    }

    @Test(priority = 22)
    public void successfull_msg() throws InterruptedException {

        Thread.sleep(1500);
        List<WebElement> msg = driver.findElements(By.xpath(e.closeToast));
        int size = msg.size();
        System.out.println(size);
        for (WebElement element : msg) {
            Thread.sleep(1500);
            element.click();
        }
    }
}




