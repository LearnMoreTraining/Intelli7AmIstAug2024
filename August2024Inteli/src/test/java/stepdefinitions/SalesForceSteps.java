package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BaseCode;
import utility.PageObjectManager;
import utility.TestContext;

import java.io.IOException;

public class SalesForceSteps {

    TestContext context;
    public SalesForceSteps(TestContext context) throws IOException {
        this.context = context;
    }

    @Given("user navigates to salesforce login page")
    public void salesforce(){

    }

    @When("user enter the username {string} and password {string}")
    public void userNameAndPassword(String userName, String password) throws IOException {
        context.pageObjectManager.getSalesforceLoginPage().enterUsername();
        context.pageObjectManager.getSalesforceLoginPage().enterPassword();
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {

    }

    @Then("user validates the navigation to the homepage")
    public void userValidatesTheNavigationToTheHomepage() {

    }

    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {
    }
}
