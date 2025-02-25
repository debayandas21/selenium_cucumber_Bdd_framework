package automation.framework.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import automation.framework.utility.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class hooks {
	
	public TestContextSetup testContextSetup;
	public hooks(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
		
	}
	
	@After
	public void quit_process() throws IOException {
		testContextSetup.baseTest.WebDriverManager().quit();
	}
	
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	
	{
		WebDriver driver= testContextSetup.baseTest.WebDriverManager();
		
		if(scenario.isFailed()) {
		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
		}
	}
}
