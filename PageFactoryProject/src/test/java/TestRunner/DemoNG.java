package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature",
glue= {"StepDefinition"}, 
plugin= {"pretty","html:target/cucumberreport/report.html"})
public class DemoNG extends AbstractTestNGCucumberTests{
	

}

/*package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resourcses\\Feature\\Sample2.feature",
glue = {"StepDefinition", "Hooks"},
//cucumber report
plugin= {"pretty", "html:target/cucumberreport/report1.html"},
//tags=("@SmokeTest or @SystemTest"),
monochrome= true)
//Junit report
//plugin= {"Junit:target/Junitreport/report.xml"})
	
	
	public class DemoNG extends AbstractTestNGCucumberTests{

}*/
