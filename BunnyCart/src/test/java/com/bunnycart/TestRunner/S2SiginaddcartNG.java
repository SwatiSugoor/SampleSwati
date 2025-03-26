package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.Feature\\S2SigninAddtocart.feature",
glue= {"com.bunnycart.stepdefinition"},
plugin= {"pretty","html:target/cucumberreport/report2.html"},
monochrome=true)
public class S2SiginaddcartNG extends AbstractTestNGCucumberTests {

}
