package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.TestContext;

import java.io.IOException;

public class Hooks {

    TestContext context;
    public Hooks(TestContext context){
       this.context = context;
    }

    @Before()
    public void setPreCondition(){
        System.out.println("execution is started");
    }

    @After()
    public void postCondition() throws IOException {
       context.baseCode.getWebDriver().quit();
    }

    @AfterStep()
    public void captureScreenshot(Scenario sc) throws IOException {

        TakesScreenshot ts = (TakesScreenshot)context.baseCode.getWebDriver() ;
        byte[] byteData = ts.getScreenshotAs(OutputType.BYTES);
        sc.attach(byteData,"image/png",sc.getName());

    }
}
