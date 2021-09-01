package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = "database_stepdefinitions",
				tags ="@dbread",
				dryRun = false,
				plugin ={ "html:target/default-cucumber-reports",
								"json:target/json-report/cucumber.json",
								"junit:target/xml-report/cucumber.xml"}
)

public class DBRunner {
}
