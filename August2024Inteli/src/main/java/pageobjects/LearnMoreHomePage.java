package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class LearnMoreHomePage {

    WebDriver driver;
    public LearnMoreHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LearnMoreHomePage enterUserName(){
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("LearnMore");
        return this;
    }

    public LearnMoreHomePage enterPassword(){
        driver.findElement(By.cssSelector("#password")).sendKeys("learnmore@123");

        return this;
    }

    public LearnMoreHomePage clickLoginButton(){
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        return this;
    }

    public void switchToChildWindow(){
       Set<String> winProperty = driver.getWindowHandles();
        Iterator<String> stringIterator = winProperty.iterator();
       String parentWin = stringIterator.next();
       String childWin = stringIterator.next();

       driver.switchTo().window(childWin);

    }

    public String getChildWindowTitle(){

       return driver.getTitle();
    }
}
