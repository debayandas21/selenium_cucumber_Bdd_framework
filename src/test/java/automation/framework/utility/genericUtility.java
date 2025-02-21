package automation.framework.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class genericUtility {

	public WebDriver driver;
	public genericUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public void WebDriverWait(int arg1) throws InterruptedException {
		
		if(driver!=null) {
			Thread.sleep(2000);
		}
	}
}
