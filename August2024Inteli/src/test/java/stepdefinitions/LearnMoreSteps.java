package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.ht.Le;
import org.junit.Assert;
import org.junit.Test;
import utility.TestContext;

public class LearnMoreSteps {

    TestContext context;

    public LearnMoreSteps(TestContext context){
        this.context = context ;
    }

    @Given("user switch to child window")
    public void switchToTheWindow(){

        context.pageObjectManager.getLearnMoreHomePage()
                .enterUserName()
                .enterPassword()
                .clickLoginButton();


    }

    @Then("verify the title")
    public void verifyTheTitle() {
        context.pageObjectManager.getLearnMoreHomePage().switchToChildWindow();
        Assert.assertEquals("Event Management",context.pageObjectManager.getLearnMoreHomePage().getChildWindowTitle());
    }
}
