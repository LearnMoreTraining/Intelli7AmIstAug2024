package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCode {

    public WebDriver getWebDriver(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in/");
        return driver;
    }
}
