package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class) // for junit to run
@CucumberOptions(
        features = "src/test/resources/features", // where is features
        glue="com.weborders.step_definitions"  // where is step_definitions


)

public class CucumberRunner {
}
