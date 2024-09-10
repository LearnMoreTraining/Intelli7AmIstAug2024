package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePageSteps {

    WebDriver driver ;  //global variable

    @Given("user navigates to amazon homepage")
    public void homePage(){
        driver = new ChromeDriver();  //local variable
        driver.get("https://www.amazon.in/");
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
}
