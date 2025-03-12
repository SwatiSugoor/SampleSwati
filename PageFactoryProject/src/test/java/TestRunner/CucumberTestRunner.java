package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src\\test\\resources\\Feature",
glue= {"StepDefinition"}, 
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests{
	

}
