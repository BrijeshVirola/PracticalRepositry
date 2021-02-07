package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ClientPortalHomePage;
import pageObjects.CreateCollectionPage;

public class CreateCollectionPageSteps {

    TestContext testContext;
    CreateCollectionPage createCollectionPage;

    public CreateCollectionPageSteps(TestContext context){
        testContext = context;
        createCollectionPage = testContext.getPageObjectManager().getCreateCollectionPage();
    }

    @When("^User enter Item number Of Items$")
    public void user_enter_Item_number_Of_Items() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createCollectionPage.fill_NumberOfItems();

    }

    @When("^User click the delivery type$")
    public void user_click_the_delivery_type() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       createCollectionPage.clickOn_CollectionType();
    }

    @When("^User enter Customer Name$")
    public void user_enter_Customer_Name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       createCollectionPage.fill_CustomerName();
    }

    @When("^User enter Customer Reference Number$")
    public void user_enter_Customer_Reference_Number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       createCollectionPage.fill_CustomerReference();
    }

    @When("^User click on Enter Address Manually Button$")
    public void user_click_on_Enter_Address_Manually_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createCollectionPage.clickOn_AddressManually();
    }

    @When("^User enter Full Address Details$")
    public void user_enter_Full_Address_Details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createCollectionPage.fill_FullAddress();
    }

    @When("^User enter Customer Telephone Number$")
    public void user_enter_Customer_Telephone_Number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createCollectionPage.fill_CustomerContactNumber();
    }

    @When("^User enter Customer Email Address$")
    public void user_enter_Customer_Email_Address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createCollectionPage.fill_CustomerEmail();
    }

    @When("^User enter Extra collection notes$")
    public void user_enter_Extra_collection_notes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createCollectionPage.fill_ExtraCollectionNotes();
    }

    @When("^User enter Special Instructions$")
    public void user_enter_Special_Instructions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        createCollectionPage.fill_SpecialInstructions();
    }

    @When("^User click the collection date$")
    public void user_click_the_collection_date() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
       createCollectionPage.clickOn_BtnCollectionDate();
    }

    @When("^User click on continue button$")
    public void user_click_on_continue_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       createCollectionPage.clickOn_BtnContinue();
    }

}
