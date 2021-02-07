package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

import java.io.FileNotFoundException;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ClientPortalHomePage clientPortalHomePage;
    private CreateLabelPage createLabelPage;
    private ClientPortalCollectionPage clientPortalCollectionPage;
    private CreateCollectionPage createCollectionPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage() throws FileNotFoundException {
       return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public LoginPage getLoginPage(){
       return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public ClientPortalHomePage getClientPortalHomePage(){
        return (clientPortalHomePage == null) ? clientPortalHomePage = new ClientPortalHomePage(driver) : clientPortalHomePage;
    }

    public CreateLabelPage getCreateLabelPage(){
        return (createLabelPage == null) ? createLabelPage = new CreateLabelPage(driver) : createLabelPage;
    }
    public ClientPortalCollectionPage getClientPortalCollectionPage(){
        return (clientPortalCollectionPage == null) ? clientPortalCollectionPage = new ClientPortalCollectionPage(driver) : clientPortalCollectionPage;
    }

    public CreateCollectionPage getCreateCollectionPage(){
        return (createCollectionPage == null) ? createCollectionPage = new CreateCollectionPage(driver) : createCollectionPage;
    }

}
