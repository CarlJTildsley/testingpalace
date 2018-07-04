package Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:target/html/"},
        //format = {"pretty","json:target/output.json/"},
        //format = {"pretty","json:target/"},
        features = {"src/test/resources/features.feature"},
        //features = {"src/test/java/features.feature"} )
        tags = {"@tag"})
//@Suite.SuiteClasses({
//        StepDefinitions.class
//})
public class CucumberRunnerTests {

}
