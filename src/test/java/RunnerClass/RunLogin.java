package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"},
        glue = {""},features = "src/test/java/Features/Login.feature")
public class RunLogin {

}
