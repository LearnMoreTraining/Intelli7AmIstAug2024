package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LmtiExplicitWaitPage {
    WebDriver driver;

    public LmtiExplicitWaitPage(WebDriver driver) {

        this.driver = driver ;
    }

    public void clickChangeText(){
        driver.findElement(By.cssSelector("#quote")).click();
    }

    public String getChangeText(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.pollingEvery(Duration.ofSeconds(10));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));

      return  driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
    }
}
