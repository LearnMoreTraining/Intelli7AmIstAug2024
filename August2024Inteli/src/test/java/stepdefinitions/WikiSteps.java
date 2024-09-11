package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WikiSteps {
    WebDriver driver;
    @Given("user navigates to wiki homepage")
    public void wikiHome(){
      driver  = new EdgeDriver();
      driver.get("https://en.wikipedia.org/wiki/Infosys");
    }


    @When("user extracts the shareholder value")
    public void userExtractsTheShareholderValue() {
       int size= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();

        for(int k=0 ; k < size ; k++){
            String shareHolderValue = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
            System.out.println(shareHolderValue);
        }
    }

    @And("user extracts the shareholding value")
    public void userExtractsTheShareholdingValue() {

       int s =driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
               .size();
        for(int d=0 ; d < s ;d++ ){
          String shareHoldingValue =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                  .get(d).getText();
            System.out.println(shareHoldingValue);
        }

       int acqSize= driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[5]")).size();
        for(int i = 0 ; i < acqSize ; i++){

          String acqValue=  driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[5]")).get(i).getText();
            System.out.println(acqValue);
        }
    }

    @Then("validate the mapping")
    public void validateTheMapping() {
    }
}
