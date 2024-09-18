package utility;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public BabyWishListPage getBabyWishListPage(){
        BabyWishListPage babyWishListPage = new BabyWishListPage(driver);
        return babyWishListPage;
    }

    public HomePage getHomePage(){
        HomePage homePage = new HomePage(driver);
        return homePage;
    }

    public SpiceJetHome getSpiceJetHome(){
        SpiceJetHome spiceJetHome = new SpiceJetHome(driver);
        return spiceJetHome;

    }

    public LearnMoreHomePage getLearnMoreHomePage(){
            LearnMoreHomePage learnMoreHomePage = new LearnMoreHomePage(driver);
            return learnMoreHomePage;
    }

    public SalesForceLoginPage getSalesforceLoginPage(){
        SalesForceLoginPage salesForceLoginPage = new SalesForceLoginPage(driver);
        return salesForceLoginPage;
    }

    public WikiPage getWikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }
}
