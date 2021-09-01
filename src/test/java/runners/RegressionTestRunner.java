package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = "stepdefinitions",
				tags = "@regression",
				dryRun = false,
				plugin ={ "html:target/default-cucumber-reportsRT",
								"json:target/json-reports/cucumberRT.json",
								"junit:target/xml-reports/cucumberRT.xml"}
)
public class RegressionTestRunner {
}
