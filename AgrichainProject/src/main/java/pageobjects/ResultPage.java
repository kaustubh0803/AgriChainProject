package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
	
	public WebDriver driver;
	
	public ResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="") //locator for input box on the HomePage
	WebElement OutputElement;
	
	public String getOutputText() {
		return OutputElement.getText();
	}
	
	
}
