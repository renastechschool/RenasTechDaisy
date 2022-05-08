package code.renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //this is for feature files path
        glue = "code/renastech/stepDefinitions", //this is for steps path
        tags = "@LoginWithoutParams",
        dryRun = false, // when it is true it will check if there is any undefined steps
        plugin={ "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
}




)


public class TestRunner {
}
