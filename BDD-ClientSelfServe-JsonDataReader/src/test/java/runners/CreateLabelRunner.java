package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/functionalTests", glue = {"stepDefinitions"},
                  tags = {"@CreateLabel"})
public class CreateLabelRunner {
}
