package automation.framework.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class productSelectionPage {
	public WebDriver driver;

	public productSelectionPage(WebDriver driver) {
		this.driver = driver;
	}

	By SearchField = By.xpath("//input[@type='search']");
	By productName = By.xpath("//*[@class='product']//h4");
	By incrementSign = By.xpath("//*[@class='increment']");
	By addtoCart= By.xpath("//button[text()='ADD TO CART']");

	public void verify_pageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "GreenKart - veg and fruits kart", "Title matched");
	}

	public void enter_productName(String param1) {
		driver.findElement(SearchField).sendKeys(param1);
	}

	public String get_productName() {
		String proName = driver.findElement(productName).getText();
		String productName = proName.split("-")[0].toString().trim();

		return productName;
	}

	public void increaseCount(int count) {
		int i = 0;

		while (i <= count - 1) {
			driver.findElement(incrementSign).click();
			i++;
		}
	}
	
	public void addToCart_click()
	{
		if(driver.findElement(addtoCart).isDisplayed()) {
			driver.findElement(addtoCart).click();
		}
	}
}
