package automation.framework.pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class offerPage {

	public WebDriver driver;
	public offerPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By topDeal= By.xpath("//*[@class='cart-header-navlink']");
	By table_cell= By.xpath("//table[@class='table table-bordered']//tr//td");
	
	public void click_checkOut() {
		if(driver.findElement(topDeal).isDisplayed()) {
			driver.findElement(topDeal).click();
		}
	}
	
	public void capture_tableDetail() {
		
		List<WebElement> element= driver.findElements(By.xpath("//table[@class='table table-bordered']//tr//td"));
		ArrayList<String> arrayList = new ArrayList<>();;
		for(int i=0; i< element.size(); i++) {
			String values= element.get(i).getText();
			arrayList.add(values);
		}
		System.out.println(arrayList);
	}
}
