package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "features/Login.feature" }, glue = {
		"steps" }, plugin = { "html:htmlreport/cucumber-test-report.html","pretty" ,"json:target/cucumber-report.json"})
public class TestRunner2 extends AbstractTestNGCucumberTests {

}
