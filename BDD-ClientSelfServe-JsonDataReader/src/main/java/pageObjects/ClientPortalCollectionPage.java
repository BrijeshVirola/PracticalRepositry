package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClientPortalCollectionPage {

    public ClientPortalCollectionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[text()='Create a collection']")
    private WebElement Btn_CreateCollection;

    public void clickOn_CreateCollectionBtn(){
        Btn_CreateCollection.click();
    }


}
