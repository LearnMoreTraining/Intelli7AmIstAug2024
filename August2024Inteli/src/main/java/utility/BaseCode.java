package utility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCode {

    WebDriver driver;
    public WebDriver getWebDriver() throws IOException {
        File f = new File("src/main/resources/configuration/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(f);
        Properties prob = new Properties();
        prob.load(fis);

        if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
             driver = new ChromeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("edge")){

            driver = new EdgeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else{
            throw new InvalidArgumentException("enter valid browser name");
        }

        driver.get(prob.getProperty("environement"));
        driver.manage().window().maximize();
        return driver;
    }
}
