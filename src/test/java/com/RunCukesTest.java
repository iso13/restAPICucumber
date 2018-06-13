package com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = { "com.step_definitions"},
        features = "classpath:features",
		plugin = {"pretty", "json:target/cucumber-json-reports/cucumber.json"},
        tags = {"not @wip"}
)

public class RunCukesTest {

}
