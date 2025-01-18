package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "features/Login.feature", "features/LoginWithScenarioOutline.feature" }, glue = {
		"steps" }, plugin = { "html:htmlreport/cucumber-test-report.html" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
