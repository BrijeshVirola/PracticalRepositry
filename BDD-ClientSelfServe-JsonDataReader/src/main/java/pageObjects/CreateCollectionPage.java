package pageObjects;

import dataProviders.JsonDataReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateCollectionPage {

    public CreateCollectionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@id='numberOfItems']")
    private WebElement Txtbx_NumberOfItems;

    @FindBy(how = How.XPATH, using = "//label[@for='collectionType']")
    private WebElement Btn_CollectionType;

    @FindBy(how = How.XPATH, using = "//input[@id='customerName']")
    private WebElement Txtbx_CustomerName;

    @FindBy(how = How.XPATH, using = "//input[@id='customerReferenceNo']")
    private WebElement Txtbx_CustomerReferenceNumber;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-sm' and @type='button']")
    private WebElement Btn_EnterAddManually;

    @FindBy(how = How.XPATH, using = "//input[@id='line1']")
    private WebElement Txtbx_AddressLineOne;

    @FindBy(how = How.XPATH, using = "//input[@id='line2']")
    private WebElement Txtbx_AddressLineTwo;

    @FindBy(how = How.XPATH, using = "//input[@id='postcode']")
    private WebElement Txtbx_Postcode;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    private WebElement Txtbx_City;

    @FindBy(how = How.XPATH, using = "//input[@id='county']")
    private WebElement Txtbx_County;

    @FindBy(how = How.XPATH, using = "//input[@id='customerPhone']")
    private WebElement Txtbx_CustomerPhoneNumber;

    @FindBy(how = How.XPATH, using = "//input[@id='customerEmail']")
    private WebElement Txtbx_CustomerEmail;

    @FindBy(how = How.XPATH, using = "//textarea[@id='description']")
    private WebElement Txtbx_ExtraCollectionNotes;

    @FindBy(how = How.XPATH, using = "//input[@id='specialInstructions']")
    private WebElement Txtbx_SpecialInstructions;

    @FindBy(how = How.XPATH, using = "//label[@for='collectionDate__3']")
    private WebElement Btn_CollectionDate;

    @FindBy(how = How.XPATH, using = "//span[text()=' Continue ']")
    private WebElement Btn_ContinueBtn;

    public void enter_NumberOfItems(String numberofitems){

        Txtbx_NumberOfItems.sendKeys(numberofitems);
    }

    public void clickOn_CollectionType(){
    Btn_CollectionType.click();
    }

    public void enter_CustomerName(String customerName){
    Txtbx_CustomerName.sendKeys(customerName);
    }

    public void enter_CustomerReferenceNumber(String customerReferenceNo){
    Txtbx_CustomerReferenceNumber.sendKeys(customerReferenceNo);
    }

    public void clickOn_AddressManually(){
    Btn_EnterAddManually.click();
    }
    public void enter_AddressLineOne(String addLineOne){
    Txtbx_AddressLineOne.sendKeys(addLineOne);
    }

    public void enter_AddressLineTwo(String addLineTwo){
    Txtbx_AddressLineTwo.sendKeys(addLineTwo);
    }

    public void enter_PostCode(String postCode){
    Txtbx_Postcode.sendKeys(postCode);
    }

    public void enter_City(String city){
    Txtbx_City.sendKeys(city);
    }

    public void enter_County(String county){
    Txtbx_County.sendKeys(county);
    }

    public void enter_CustomerTelephoneNumber(String customerNo){
    Txtbx_CustomerPhoneNumber.sendKeys(customerNo);
    }

    public void enter_CustomerEmailAddress(String customerEmail){
    Txtbx_CustomerEmail.sendKeys(customerEmail);
    }

    public void enter_ExtraCollectionNotes(String extraNotes){
    Txtbx_ExtraCollectionNotes.sendKeys(extraNotes);
    }

    public void enter_SpecialInstruction(String speInstruction){
    Txtbx_SpecialInstructions.sendKeys(speInstruction);
    }

    public void clickOn_BtnCollectionDate(){
    Btn_CollectionDate.click();
    }

    public void clickOn_BtnContinue(){
    Btn_ContinueBtn.click();
    }

    public void fill_NumberOfItems(){
    enter_NumberOfItems(JsonDataReader.getjsonData("NumberOfItems"));
    }

    public void fill_CustomerName(){
    enter_CustomerName(JsonDataReader.getjsonData("CustomerName"));
    }

    public void fill_FullAddress(){
    enter_AddressLineOne(JsonDataReader.getjsonData("AddressLineOne"));
    enter_AddressLineTwo(JsonDataReader.getjsonData("AddressLineTwo"));
    enter_PostCode(JsonDataReader.getjsonData("Postcode"));
    enter_City(JsonDataReader.getjsonData("Town/City"));
    enter_County(JsonDataReader.getjsonData("County"));
    }

    public void fill_CustomerContactNumber(){
    enter_CustomerTelephoneNumber(JsonDataReader.getjsonData("CustomerPhoneNo"));
    }

    public void fill_CustomerEmail(){

        enter_CustomerEmailAddress(JsonDataReader.getjsonData("CustomerEmailAddress"));
    }

    public void fill_ExtraCollectionNotes(){
    enter_ExtraCollectionNotes(JsonDataReader.getjsonData("ExtraCollectionNotes"));
    }

    public void fill_SpecialInstructions(){
    enter_SpecialInstruction(JsonDataReader.getjsonData("SpecialInstructions"));
    }

    public void fill_CustomerReference(){
    enter_CustomerReferenceNumber(JsonDataReader.getjsonData("CustomerReferenceNo"));
    }
}
