package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.Feature\\S4Addmultipleproducts.feature",
glue= {"com.bunnycart.stepdefinition"},
plugin= {"pretty","html:target/cucumberreport/report4.html"},
monochrome=true)
public class S4AddProductsNG extends AbstractTestNGCucumberTests {

}
