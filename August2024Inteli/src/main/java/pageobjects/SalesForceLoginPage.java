package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ExcelHandler;

import java.io.IOException;

public class SalesForceLoginPage {

    WebDriver driver;
    public SalesForceLoginPage(WebDriver driver){
       this.driver = driver;
    }

    public void enterUsername() throws IOException {

        driver.findElement(By.id("username")).sendKeys(ExcelHandler.getExcelData("login",1,0));
    }

    public void enterPassword() throws IOException {
        driver.findElement(By.id("password")).sendKeys(ExcelHandler.getExcelData("login",1,1));
    }

    public void clickLoginButton(){
        driver.findElement(By.linkText("Forgot Your Password?")).click();
        driver.findElement(By.partialLinkText("got Your Pas")).click();
    }

}
