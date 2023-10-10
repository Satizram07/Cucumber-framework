package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@oragehrm/failed_senario.txt", glue = "com.StepDefinitions", dryRun = false, plugin = "pretty")

public class RerunClass extends AbstractTestNGCucumberTests {

}
