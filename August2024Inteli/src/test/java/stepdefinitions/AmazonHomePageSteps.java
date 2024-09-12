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

import java.io.IOException;

public class AmazonHomePageSteps {

    WebDriver driver ;  //global variable
    BabyWishListPage babyWishListPage;
    HomePage homePage ;

    public AmazonHomePageSteps() throws IOException {
        BaseCode baseCode = new BaseCode();
        driver = baseCode.getWebDriver();
        babyWishListPage = new BabyWishListPage(driver);
        homePage = new HomePage(driver);
    }

    @Given("user navigates to amazon homepage")
    public void homePage(){


    }

    @And("user clicks the search icon")
    public void searchIcon(){

      homePage.clickSearchIcon();
    }

    @When("user enter the product name {string}")
    public void enterproductName(String productName){
          homePage.enterProductName(productName);
    }

    @Then("user verify the title of page")
    public void validateTitle() {
        System.out.println( driver.getTitle());
    }

    @When("user extracts all the values")
    public void userExtractsAllTheValues() {

    }

    @Given("user navigates to baby wishlist page")
    public void userNavigatesToBabyWishlistPage() {
      homePage.clickBabyWishList();
    }

    @Then("verify the baby wishlist text")
    public void verifyTheBabyWishlistText() {

        Assert.assertEquals("Baby", babyWishListPage.getBabyWishListText());

    }
}
