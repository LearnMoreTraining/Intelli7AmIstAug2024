package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.ExcelHandler;

import java.io.IOException;

public class HomePage {
    WebDriver driver;
    String token;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterProductName(String productName){
        try {
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        }
        catch(ElementClickInterceptedException a){
            JavascriptExecutor j = (JavascriptExecutor) driver;
            j.executeScript("window.scrollBy(0,1000)","");
            j.executeScript("arguments[0].SetAttibute('value','iphone')",  driver.findElement(By.id("twotabsearchtextbox")));
        }

    }

    public void enterProductName(String sheetName, int row , int column) throws IOException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ExcelHandler.getExcelData(sheetName,row,column));
    }

    public void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void selectDropdownValue(){
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
       // categoryDropdown.selectByIndex(2);
       // categoryDropdown.selectByVisibleText("Books");
        categoryDropdown.selectByValue("search-alias=mobile-apps");
    }

    public void clickBabyWishList(){

        WebElement accountElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(accountElement).build().perform();
        // driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
        driver.findElement(By.linkText("Baby Wishlist")).click();
    }

    public void getDropdownText(){
        WebElement dropdownelement = driver.findElement(By.id("searchDropdownBox"));
        int dropdownSize = dropdownelement.findElements(By.tagName("option")).size();

        for(int i =0 ; i< dropdownSize ; i++){

            String dropdownValues= dropdownelement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(dropdownValues);
        }
    }

    public void parentWindow(){
      token =  driver.findElement(By.id("1223")).getText();
    }

    public void childWindow(){
        driver.findElement(By.id("qw")).sendKeys(token);
    }

    public void selectFromDropdownValue(String cityCode){

            driver.findElement(By.xpath("//a[@value='"+cityCode+"']")).click();
    }

    public void selectSearchResult(String index){
        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+index+"']")).click();
    }

    public boolean radioButton(){
      return  driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).isDisplayed();
    }
}
