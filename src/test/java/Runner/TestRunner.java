package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

//        features = "src/test/java/features/SignIn.feature",
        features = "src/test/java/features",
        glue = {"Steps", "Utility", "hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json", "junit:target/cucumber.json"}
)
public class TestRunner {

}