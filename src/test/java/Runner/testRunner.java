package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "Features\\tags_Demo.feature", glue= {"step_def"},plugin= {"html:target/Cucumber_sel.html"},tags= {"@SmokeTest, @RegressionTest"})
public class testRunner {

}
