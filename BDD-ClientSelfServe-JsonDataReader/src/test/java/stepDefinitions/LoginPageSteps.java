package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.LoginPage;
import testDataTypes.LabelDetails;

public class LoginPageSteps {

    TestContext testContext;
    LoginPage loginPage;

    public LoginPageSteps(TestContext context){
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @When("^User enter Login Credentials$")
    public void user_enter_Login_Credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        loginPage.fill_LoginCredentials();

    }

    @When("^User click on Login button$")
    public void user_click_on_Login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickOn_LogIn();
        Thread.sleep(5000);

    }
 }
