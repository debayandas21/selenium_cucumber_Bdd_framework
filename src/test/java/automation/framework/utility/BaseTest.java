package automation.framework.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

	public WebDriver driver;
	public genericUtility genericUtility;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//globalConfig.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String Browser = prop.getProperty("browser");
		String app_url = prop.getProperty("url");

		if (driver == null) {
			switch (Browser) {
			case "Chrome":
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(app_url);
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				break;
			case "Edge":
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(app_url);
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				break;
			}
		}
		return driver;
	}
}
