package automation.framework.stepDefinition;

import java.io.IOException;

import automation.framework.utility.TestContextSetup;
import io.cucumber.java.After;

public class hooks {
	
	public TestContextSetup testContextSetup;
	public hooks(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
		
	}
	
	@After
	public void quit_process() throws IOException {
		testContextSetup.baseTest.WebDriverManager().quit();
	}
}
