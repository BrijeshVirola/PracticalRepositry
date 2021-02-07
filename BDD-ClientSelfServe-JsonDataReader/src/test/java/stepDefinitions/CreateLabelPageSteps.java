package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import org.junit.Test;
import pageObjects.CreateLabelPage;

public class CreateLabelPageSteps {

    TestContext testContext;
    CreateLabelPage createLabelPage;

    public CreateLabelPageSteps(TestContext context) {
        testContext = context;
        createLabelPage = testContext.getPageObjectManager().getCreateLabelPage();
    }

    @When("^User select Delivery Type$")
    public void user_select_Delivery_Type() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.clickOn_DeliveryType();

    }

    @When("^User select Title$")
    public void user_select_Title() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.clickOn_RadioBtnTitle();

    }

    @When("^User enter First Name$")
    public void user_enter_First_Name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.fill_FirstName();

    }

    @When("^User enter Last Name$")
    public void user_enter_Last_Name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.fill_LastName();

    }

    @When("^User click on Enter Address Manually button$")
    public void user_click_on_Enter_Address_Manually_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.clickON_BtnManualAddress();

    }

    @When("^User enter Full Address$")
    public void user_enter_Full_Address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.fill_AddressDetails();

    }

    @When("^User enter Phone Number$")
    public void user_enter_Phone_Number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.fill_CustomerContactNo();
    }

    @When("^User enter Customer Reference$")
    public void user_enter_Customer_Reference() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.fill_CustomerReference();

    }

    @When("^User click on Submit button$")
    public void user_click_on_Submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLabelPage.clickOn_SubmitBtn();
    }

}