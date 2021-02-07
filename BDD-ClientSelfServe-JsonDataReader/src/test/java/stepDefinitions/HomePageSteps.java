package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.HomePage;

import java.io.FileNotFoundException;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) throws FileNotFoundException {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Automating Label Creation");
        homePage.navigateTo_HomePage();

    }

}
