package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikiPage {

    WebDriver driver;
    public WikiPage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getShareHolderValue(){
        int size= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        List<String> shareholderValue = new ArrayList<String>();
        for(int k=0 ; k < size ; k++){
            String shareHolderValue = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
           shareholderValue.add(shareHolderValue);
        }

        return shareholderValue;
    }

    public List<String> getShareHoldingValue(){
        int s =driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                .size();

        List <String> shareHoldingValue = new ArrayList<String>();
        for(int d=0 ; d < s ;d++ ){
            String value =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                    .get(d).getText();
           shareHoldingValue.add(value);
        }
        return shareHoldingValue;
    }


    public Map<String, String> getShareHolderShareHoldingValue(){

        int size= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        Map<String,String> m = new HashMap<String,String>();
        for(int k=0 ; k < size ; k++){
            String shareHolderValue = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
            String shareHoldingValue =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                    .get(k).getText();
            m.put(shareHolderValue,shareHoldingValue);
        }
      return m;
    }
}
