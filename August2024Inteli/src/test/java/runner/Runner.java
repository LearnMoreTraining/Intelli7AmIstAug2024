package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
      features = {"src/test/resources/testdesign"},
      glue = {"stepdefinitions","hooks"},
        tags = "@wiki01",
        plugin = {"pretty",
                "html:target/reports/cucumber.html",
                "json:target/reports/xyz.json",
                "junit:target/reports/report.xml",
      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class Runner {
}
