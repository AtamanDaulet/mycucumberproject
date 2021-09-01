package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = "stepdefinitions",
				tags = "@smoke",
				dryRun = false,
				plugin ={ "html:target/default-cucumber-reportsST",
								"json:target/json-reports/cucumberST.json",
								"junit:target/xml-reports/cucumberST.xml"}
)
public class SmokeTestRunner {
}
