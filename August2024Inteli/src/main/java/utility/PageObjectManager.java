package utility;

import org.openqa.selenium.WebDriver;
import pageobjects.BabyWishListPage;
import pageobjects.HomePage;
import pageobjects.SalesForceLoginPage;
import pageobjects.SpiceJetHome;

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

    public void getLearnMoreHomePage(){

    }

    public SalesForceLoginPage getSalesforceLoginPage(){
        SalesForceLoginPage salesForceLoginPage = new SalesForceLoginPage(driver);
        return salesForceLoginPage;
    }
}
