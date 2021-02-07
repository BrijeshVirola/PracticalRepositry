package stepDefinitions;

import cucumber.TestContext;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    TestContext testContext;

    public Hooks(TestContext context){
        testContext = context;
    }

    @Before
    public void BeforeAllStepsExecution(){
        System.out.println("Common steps to be executed");
    }

    @After
    public void AfterAllStepsExecution(){
        System.out.println("Cleaning the Browser Process");
    }
}
