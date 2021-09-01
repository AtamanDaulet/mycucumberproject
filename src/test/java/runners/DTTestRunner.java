package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = "stepdefinitions",
				tags = "@DT",
				dryRun = false,
				plugin ={ "html:target/default-cucumber-reportsDT",
								"json:target/json-reports/cucumberDT.json",
								"junit:target/xml-reports/cucumberDT.xml"}
)
public class DTTestRunner {
}
