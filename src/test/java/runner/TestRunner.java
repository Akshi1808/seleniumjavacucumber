package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions (
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition" },
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" }
)
public class TestRunner {

}
