package automation.framework.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import automation.framework.pageObject.pageObjectManager;

public class TestContextSetup {
	
	public BaseTest baseTest;
	public WebDriver driver;
	public pageObjectManager PageobjectManager;
	public genericUtility genericUtil;
	
	public TestContextSetup() throws IOException {
		
		baseTest= new BaseTest();
		PageobjectManager= new pageObjectManager(baseTest.WebDriverManager());
		genericUtil= new genericUtility(baseTest.WebDriverManager());
		
	}

}
