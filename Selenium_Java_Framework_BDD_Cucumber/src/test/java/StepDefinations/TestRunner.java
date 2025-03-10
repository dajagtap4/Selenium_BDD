package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
     (
		features ="src/test/resources/Features",
		glue = {"StepDefinations"}, 
		//monochrome=true,
		plugin = {
				   "pretty","junit:target/JUnitReports/report.xml",
				   "pretty","json:target/JSONReports/report.json",
				   "pretty","html:target/HTMLReports"
				}
		//tags="@login"
	 )
public class TestRunner {

}
