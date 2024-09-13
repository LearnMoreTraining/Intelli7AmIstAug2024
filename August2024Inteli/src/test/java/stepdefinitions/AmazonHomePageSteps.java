package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pageobjects.BabyWishListPage;
import pageobjects.HomePage;
import utility.BaseCode;
import utility.PageObjectManager;

import java.io.IOException;

public class AmazonHomePageSteps {

    WebDriver driver ;  //global variable
    PageObjectManager pageObjectManager;

    public AmazonHomePageSteps() throws IOException {
        BaseCode baseCode = new BaseCode();
        driver = baseCode.getWebDriver();
        pageObjectManager = new PageObjectManager(driver);

    }

    @Given("user navigates to amazon homepage")
    public void homePage(){


    }

    @And("user clicks the search icon")
    public void searchIcon(){
        pageObjectManager.getHomePage().clickSearchIcon();

    }

    @When("user enter the product name {string}")
    public void enterproductName(String productName){
        pageObjectManager.getHomePage().enterProductName(productName);

    }

    @Then("user verify the title of page")
    public void validateTitle() {
        System.out.println( driver.getTitle());
    }

    @When("user extracts all the values")
    public void userExtractsAllTheValues() {
            pageObjectManager.getHomePage().getDropdownText();
    }

    @Given("user navigates to baby wishlist page")
    public void userNavigatesToBabyWishlistPage() {
      pageObjectManager.getHomePage().clickBabyWishList();
    }

    @Then("verify the baby wishlist text")
    public void verifyTheBabyWishlistText() {

        Assert.assertEquals("Baby", pageObjectManager.getBabyWishListPage().getBabyWishListText());

    }

    @Given("user selects the value from the category dropdown")
    public void userSelectsTheValueFromTheCategoryDropdown() {

            pageObjectManager.getHomePage().selectDropdownValue();
    }
}
