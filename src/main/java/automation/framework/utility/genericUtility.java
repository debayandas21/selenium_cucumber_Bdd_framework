package automation.framework.utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtility {

	public WebDriver driver;
	public genericUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public void WebDriverWait(int arg1) throws InterruptedException {
		
		if(driver!=null) {
			long milisec= arg1*1000;
			Thread.sleep(milisec);
		}
	}
	
	public void SwitchWindow() throws Exception
	{
		String defaultwindw= driver.getWindowHandle();
		Set<String>windows= driver.getWindowHandles();
		
		Iterator<String> I1= windows.iterator();
		while(I1.hasNext()) {
			String expectedWindow= I1.next();
			
			if(!defaultwindw.equals (expectedWindow)){
				driver.switchTo().window(expectedWindow);
				System.out.println(driver.switchTo().window(expectedWindow).getTitle());
			}else {
				driver.switchTo().window(defaultwindw);
			}
		}
		
	}
}
