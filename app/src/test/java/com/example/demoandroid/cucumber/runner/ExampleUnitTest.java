package com.example.demoandroid.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login_details.feature",
        glue = ""
)
public class ExampleUnitTest {

}