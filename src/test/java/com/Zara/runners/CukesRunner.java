package com.Zara.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json"
        },
        features ="src/test/resources/features",
        glue = "com/Zara/step_definitions",
        tags=("@Api"),
        dryRun = true,
        stepNotifications = true
)
public class CukesRunner {

}
