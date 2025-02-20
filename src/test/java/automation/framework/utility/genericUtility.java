package automation.framework.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class genericUtility {

	public WebDriver driver;
	public genericUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public void WebDriverWait(int arg1) {
		
		if(driver!=null) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(arg1));
		}
	}
}
