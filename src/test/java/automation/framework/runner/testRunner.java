package automation.framework.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= "src/test/java/automation/framework/feature/", glue="automation.framework.stepDefinition",
monochrome=true,
plugin= {"html:target/cucumber.html"})
public class testRunner extends AbstractTestNGCucumberTests
{
	
	
	
	
}

	
	