package stepDefinitions;

import com.sun.security.ntlm.Client;
import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ClientPortalHomePage;

public class ClientPortalHomePageSteps {

    TestContext testContext;
    ClientPortalHomePage clientPortalHomePage;

    public ClientPortalHomePageSteps(TestContext context){
        testContext = context;
        clientPortalHomePage = testContext.getPageObjectManager().getClientPortalHomePage();
    }

    @When("^User click on CreateLabel button$")
    public void user_click_on_CreateLabel_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       clientPortalHomePage.clickOn_CreateLabelBtn();

    }
}
