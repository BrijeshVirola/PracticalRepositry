package pageObjects;


import dataProviders.JsonDataReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import testDataTypes.LabelDetails;

public class LoginPage {

   public LoginPage(WebDriver driver){
       PageFactory.initElements(driver, this);
    }

   @FindBy(how = How.XPATH, using = "//input[@type='text' and @name='username']")
   private WebElement txtbx_UserName;

   @FindBy(how = How.XPATH, using = "//input[@type='password' and @name='password']")
   private WebElement txtbx_PassWord;

   @FindBy(how = How.XPATH, using = "//button[@class='auth0-lock-submit' and @type='submit']")
   private WebElement Btn_LogIn;

   public void enter_UserName(String username) {
   txtbx_UserName.sendKeys(username);
   }

   public void enter_PassWord(String password){
   txtbx_PassWord.sendKeys(password);
   }

   public void clickOn_LogIn(){
   Btn_LogIn.click();
   }

   public void fill_LoginCredentials(){
      enter_UserName(JsonDataReader.getjsonData("username"));
      enter_PassWord(JsonDataReader.getjsonData("password"));
   }

}
