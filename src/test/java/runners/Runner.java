package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = "stepdefinitions",
//				tags = "@flower or @iPhone"
//				tags = "@flower and @iPhone"
				tags = "@googlesearch",
//				tags = "@DTable1"
//				tags = "@wip",
//				tags = "@dttables",
//				tags = 	"@seleniumgrid123",
//
				strict = true,
				monochrome = true,
				dryRun = false,
				plugin ={ "html:target/default-cucumber-reports",
									"json:target/json-report/cucumber.json",
									"junit:target/xml-report/cucumber.xml",
									"rerun:target/FailedRerun.txt"}
)
public class Runner {
}
