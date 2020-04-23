package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles",glue="stepdefinitions",
dryRun=true,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/TestResult.html"},
tags={"@tag1"})


public class HomeOnlineTestRunner {
	

	
	

}
