package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features",glue ="com.StepDefinitions", dryRun=false,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","rerun:Banking/failed_senario.txt"})
public class Runner extends AbstractTestNGCucumberTests {

}


