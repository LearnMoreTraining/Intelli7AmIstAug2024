package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterProductName(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void selectDropdownValue(){

    }

    public void clickBabyWishList(){

        WebElement accountElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(accountElement).build().perform();
        driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
    }

    public void getDropdownText(){
        WebElement dropdownelement = driver.findElement(By.id("searchDropdownBox"));
        int dropdownSize = dropdownelement.findElements(By.tagName("option")).size();

        for(int i =0 ; i< dropdownSize ; i++){

            String dropdownValues= dropdownelement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(dropdownValues);
        }
    }
}
