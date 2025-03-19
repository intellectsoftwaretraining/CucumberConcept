package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features/DataDriven.feature"
		,glue={"steps"}
		,plugin = {"pretty","summary","html:target/cucumber/report.html"}
		,monochrome = true
		,dryRun = false
		, tags = "@datadriven"
		)
public class CucumberRunner {

}
