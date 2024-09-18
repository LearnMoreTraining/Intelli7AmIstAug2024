package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertLearnMorePage {

    WebDriver driver;
    public AlertLearnMorePage(WebDriver driver){
        this.driver = driver ;
    }

    public void clickConfirmBox(){
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }

    public String getConfirmBoxText(){
       return driver.switchTo().alert().getText();
    }
    public void clickConfirmCancelButton(){
        driver.switchTo().alert().dismiss();
    }

    public String getUIText(){
       return driver.findElement(By.cssSelector("#demo")).getText();
    }
}
