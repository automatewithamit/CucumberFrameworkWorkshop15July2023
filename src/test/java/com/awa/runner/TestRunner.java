package com.awa.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefiles",
        glue = {"com.awa.stepdefinitions", "com.awa.hooks"},
        tags = "@Test",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {


}