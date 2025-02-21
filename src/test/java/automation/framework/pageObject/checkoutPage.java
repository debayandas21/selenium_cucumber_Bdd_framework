package automation.framework.pageObject;

import org.openqa.selenium.WebDriver;

public class checkoutPage {

	public WebDriver driver;
	public checkoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void click_checkOut() {
		System.out.println("Checkout link clicked");
	}
}
