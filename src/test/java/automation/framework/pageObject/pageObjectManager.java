package automation.framework.pageObject;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	public WebDriver driver;
	public productSelectionPage productSelectionpage;
	public pageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public productSelectionPage get_productSelectionPage() {
		productSelectionpage= new productSelectionPage(driver);
		return productSelectionpage;
	}
}
