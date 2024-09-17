package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;

import java.io.IOException;

public class TestContext {

   public BaseCode baseCode;
   public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
         baseCode = new BaseCode();
         pageObjectManager = new PageObjectManager(baseCode.getWebDriver());
    }
}
