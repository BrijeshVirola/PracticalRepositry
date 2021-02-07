package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClientPortalHomePage {

    public ClientPortalHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[text()='Create label']")
    private WebElement Btn_CreateLabel;

    public void clickOn_CreateLabelBtn(){
    Btn_CreateLabel.click();
    }

}
