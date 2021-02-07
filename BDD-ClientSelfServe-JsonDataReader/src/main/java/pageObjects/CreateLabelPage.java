package pageObjects;

import dataProviders.JsonDataReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLabelPage {

    public CreateLabelPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//label[@for='deliveryType']")
    private WebElement Btn_DeliveryType;

    @FindBy(how = How.XPATH, using = "//label[@for='customerTitle__2']")
    private WebElement RadioBtn_Title;

    @FindBy(how = How.XPATH, using = "//input[@id='customerFirstName']")
    private WebElement TxtBx_FirstName;

    @FindBy(how = How.XPATH, using = "//input[@id='customerLastName']")
    private WebElement TxtBx_LastName;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-sm' and @type='button']")
    private WebElement Btn_AddressManually;

    @FindBy(how = How.XPATH, using = "//input[@id='line1']")
    private WebElement TxtBx_AddressLineOne;

    @FindBy(how = How.XPATH, using = "//input[@id='line2']")
    private WebElement TxtBx_AddressLineTwo;

    @FindBy(how = How.XPATH, using = "//input[@id='postcode']")
    private WebElement TxtBx_PostCode;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    private WebElement TxtBx_City;

    @FindBy(how = How.XPATH, using = "//input[@id='county']")
    private WebElement TxtBx_County;

    @FindBy(how = How.XPATH, using = "//input[@id='country']")
    private WebElement TxtBx_Country;

    @FindBy(how = How.XPATH, using = "//input[@id='customerPhone']")
    private WebElement TxtBx_CustomerPhone;

    @FindBy(how = How.XPATH, using = "//input[@id='customerId' and @name='customerId']")
    private WebElement TxtBox_CustomerReference;

    @FindBy(how = How.XPATH, using = "//span[text()=' Submit ']")
    private WebElement Btn_Submit;

    public void clickOn_DeliveryType() {
        Btn_DeliveryType.click();
    }

    public void clickOn_RadioBtnTitle(){
    RadioBtn_Title.click();
    }

    public void enter_FirstName(String firstname){
    TxtBx_FirstName.sendKeys(firstname);
    }

    public void enter_LastName(String lastname){
    TxtBx_LastName.sendKeys(lastname);
    }

    public void clickON_BtnManualAddress(){
    Btn_AddressManually.click();
    }

    public void enter_AddressLineOne(String AddLineOne){
    TxtBx_AddressLineOne.sendKeys(AddLineOne);
    }

    public void enter_AddressLineTwo(String AddLineTwo){
    TxtBx_AddressLineTwo.sendKeys(AddLineTwo);
    }

    public void enter_PostCode(String postcode){
    TxtBx_PostCode.sendKeys(postcode);
    }

    public void enter_City(String city){
    TxtBx_City.sendKeys(city);
    }

    public void enter_County(String county){
    TxtBx_County.sendKeys(county);
    }

    public void enter_Country(String country){
    TxtBx_Country.sendKeys(country);
    }

    public void enter_CustomerPhone(String customerNo){
    TxtBx_CustomerPhone.sendKeys(customerNo);
    }

    public void enter_CustomerReference(String customerReference){
    TxtBox_CustomerReference.sendKeys(customerReference);
    }

    public void clickOn_SubmitBtn(){
    Btn_Submit.click();
    }

    public void fill_FirstName(){

        enter_FirstName(JsonDataReader.getjsonData("FirstName"));
    }

    public void fill_LastName(){

        enter_LastName(JsonDataReader.getjsonData("LastName"));
    }

    public void fill_AddressDetails(){
       enter_AddressLineOne(JsonDataReader.getjsonData("AddressLineOne"));
       enter_AddressLineTwo(JsonDataReader.getjsonData("AddressLineTwo"));
       enter_PostCode(JsonDataReader.getjsonData("Postcode"));
       enter_City(JsonDataReader.getjsonData("Town/City"));
       enter_County(JsonDataReader.getjsonData("County"));
       enter_Country(JsonDataReader.getjsonData("Country"));
    }

    public void fill_CustomerContactNo(){

        enter_CustomerPhone(JsonDataReader.getjsonData("CustomerPhoneNo"));
    }

    public void fill_CustomerReference(){

    enter_CustomerReference(JsonDataReader.getjsonData("CustomerReferenceNo"));
    }
}
