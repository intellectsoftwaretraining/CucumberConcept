package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features/LoginTest.feature"
		,glue={"steps"}
		,plugin = {"pretty","summary","html:target/cucumber/report.html"}
		,monochrome = true
		,dryRun = false
		, tags = "@login"
		)
public class CucumberRunner {

}
