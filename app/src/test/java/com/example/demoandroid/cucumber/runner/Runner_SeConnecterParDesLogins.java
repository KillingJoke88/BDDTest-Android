package com.example.demoandroid.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Se_connecter_par_des_logins.feature",
        glue = ""
)
public class Runner_SeConnecterParDesLogins {
    
}
