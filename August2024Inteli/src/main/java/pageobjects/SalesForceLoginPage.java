package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesForceLoginPage {

    WebDriver driver;
    public SalesForceLoginPage(WebDriver driver){
       this.driver = driver;
    }

    public void enterUsername(){

        driver.findElement(By.id("username")).sendKeys("abc");
    }

    public void enterPassword(){
        driver.findElement(By.id("password")).sendKeys("123");
    }

    public void clickLoginButton(){

    }

}
