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
import utility.TestContext;

import java.io.IOException;

public class AmazonHomePageSteps {

    TestContext context;

    public AmazonHomePageSteps(TestContext context) throws IOException {
            this.context = context;
    }

    @Given("user navigates to amazon homepage")
    public void homePage(){


    }

    @And("user clicks the search icon")
    public void searchIcon(){
        context.pageObjectManager.getHomePage().clickSearchIcon();


    }

    @When("user enter the product name {string}")
    public void enterproductName(String productName){
       context.pageObjectManager.getHomePage().enterProductName(productName);

    }

    @Then("user verify the title of page")
    public void validateTitle() throws IOException {
        System.out.println( context.baseCode.getWebDriver().getTitle());
    }

    @When("user extracts all the values")
    public void userExtractsAllTheValues() {
            context.pageObjectManager.getHomePage().getDropdownText();
    }

    @Given("user navigates to baby wishlist page")
    public void userNavigatesToBabyWishlistPage() {
      context.pageObjectManager.getHomePage().clickBabyWishList();
    }

    @Then("verify the baby wishlist text")
    public void verifyTheBabyWishlistText() {

        Assert.assertEquals("Baby", context.pageObjectManager.getBabyWishListPage().getBabyWishListText());

    }

    @Given("user selects the value from the category dropdown")
    public void userSelectsTheValueFromTheCategoryDropdown() {

            context.pageObjectManager.getHomePage().selectDropdownValue();
    }
}
