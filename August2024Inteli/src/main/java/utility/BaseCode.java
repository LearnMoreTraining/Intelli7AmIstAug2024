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
import java.time.Duration;
import java.util.Properties;

public class BaseCode {

   public WebDriver driver;
    public WebDriver getWebDriver() {

        if(driver == null) {

            File f = new File("src/main/resources/configuration/frameworkconfig.properties");
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(f);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Properties prob = new Properties();
            try {
                prob.load(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (prob.getProperty("browser").equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (prob.getProperty("browser").equalsIgnoreCase("edge")) {

                driver = new EdgeDriver();
            } else if (prob.getProperty("browser").equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
            } else {
                throw new InvalidArgumentException("enter valid browser name");
            }

            driver.get(prob.getProperty("environement"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }

        return driver;
    }
}
