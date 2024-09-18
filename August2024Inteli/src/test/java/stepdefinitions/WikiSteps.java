package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utility.TestContext;

public class WikiSteps {

    TestContext context;
    public WikiSteps(TestContext context){
        this.context = context;
    }

    @Given("user navigates to wiki homepage")
    public void wikiHome(){

    }


    @When("user extracts the shareholder value")
    public void userExtractsTheShareholderValue() {
      context.pageObjectManager.getWikiPage().getShareHolderValue();
    }

    @And("user extracts the shareholding value")
    public void userExtractsTheShareholdingValue() {
        context.pageObjectManager.getWikiPage().getShareHoldingValue();

    }

    @Then("validate the mapping")
    public void validateTheMapping() {

        Assert.assertEquals("Public",context.pageObjectManager.getWikiPage().getShareHolderValue().get(3));
        Assert.assertEquals("16.81%",context.pageObjectManager.getWikiPage().getShareHoldingValue().get(3));
    }


}
