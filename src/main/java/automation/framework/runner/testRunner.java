package automation.framework.runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= "src/test/java/automation/framework/feature/", glue="automation.framework.stepDefinition",
monochrome=true,
plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} /*,dryRun=true, tags="@offerPage"*/)
public class testRunner extends AbstractTestNGCucumberTests
{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	
}

	
	