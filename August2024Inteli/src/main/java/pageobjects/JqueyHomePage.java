package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JqueyHomePage {

    WebDriver driver;

    public JqueyHomePage(WebDriver driver) {
        this.driver = driver ;
    }

    public void dragAndDrop(){
        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        WebElement dragElement = driver.findElement(By.cssSelector("#draggable"));
        WebElement dropElement = driver.findElement(By.cssSelector(".ui-widget-header.ui-droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(dragElement,dropElement).build().perform();
        driver.switchTo().defaultContent();
    }
}
