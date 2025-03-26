package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.Feature\\S3SigninValidInvalid.feature",
glue= {"com.bunnycart.stepdefinition"},
plugin= {"pretty","html:target/cucumberreport/report3.html"},
monochrome=true)
public class S3ValidInvalidSiginNG extends AbstractTestNGCucumberTests{

}
