package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.ClientPortalCollectionPage;
import pageObjects.ClientPortalHomePage;

public class ClientPortalCollectionPageSteps {

    TestContext testContext;
    ClientPortalCollectionPage clientPortalCollectionPage;

    public ClientPortalCollectionPageSteps(TestContext context){
        testContext = context;
        clientPortalCollectionPage = testContext.getPageObjectManager().getClientPortalCollectionPage();
    }

    @When("^User click on Single Collection button$")
    public void userClickOnSingleCollectionButton() {
        // Write code here that turns the phrase above into concrete actions
        clientPortalCollectionPage.clickOn_CreateCollectionBtn();

    }


}
