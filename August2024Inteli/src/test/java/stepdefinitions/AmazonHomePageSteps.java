package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utility.BaseCode;

public class AmazonHomePageSteps {

    WebDriver driver ;  //global variable

    public AmazonHomePageSteps(){
        BaseCode baseCode = new BaseCode();
        driver = baseCode.getWebDriver();
    }

    @Given("user navigates to amazon homepage")
    public void homePage(){


    }

    @And("user clicks the search icon")
    public void searchIcon(){
        driver.findElement(By.xpath("//input[@value='Go']")).click();
    }

    @When("user enter the product name {string}")
    public void enterproductName(String productName){
          driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    @Then("user verify the title of page")
    public void validateTitle() {
        System.out.println( driver.getTitle());
    }

    @When("user extracts all the values")
    public void userExtractsAllTheValues() {
        WebElement dropdownelement = driver.findElement(By.id("searchDropdownBox"));
       int dropdownSize = dropdownelement.findElements(By.tagName("option")).size();

        for(int i =0 ; i< dropdownSize ; i++){

           String dropdownValues= dropdownelement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(dropdownValues);
        }
    }

    @Given("user navigates to baby wishlist page")
    public void userNavigatesToBabyWishlistPage() {
        WebElement accountElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(accountElement).build().perform();
        driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
    }

    @Then("verify the baby wishlist text")
    public void verifyTheBabyWishlistText() {

      String text=  driver.findElement(By.xpath("//div[@class='a-section a-spacing-none _gift-registry-header-desktop_style_headerCard__3kHDW']/child::div/child::h2")).getText();
        System.out.println(text);

    }
}
