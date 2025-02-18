package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(tags="", features= {"src/test/resources/Features"}, glue = {"StepDefinitions"}, plugin = {"pretty", "html:target/htmlreport.html"})

@CucumberOptions(tags="@Sanity", features= {"src/test/resources/Features"}, glue = {"StepDefinitions"}, plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	

}
 