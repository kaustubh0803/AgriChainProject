package baseUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	private WebDriver driver;
	
	//method to initialize the browser instance.
	public WebDriver initializeDriver() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
}
	//method to launch application.
	public WebDriver launchApplication() {
		driver=initializeDriver();
		driver.get("url");
		return driver;
	}
	
	//method to close browser.
	public void teardown() {
		driver.quit();
		
	}
	
}
