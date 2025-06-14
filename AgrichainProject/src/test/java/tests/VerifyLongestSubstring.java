package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseUtilities.BaseClass;
import pageobjects.HomePage;
import pageobjects.ResultPage;

@Test
public class VerifyLongestSubstring extends BaseClass {

	private WebDriver driver;
	private HomePage homePage;
	private ResultPage resultPage;
	private String st="abcabcdebcshdk";
	
	public void verifyLongestSubstring() {
		
		//launch the browser and application URL
		driver=launchApplication();
		
		//go to homepage and provide input string and click on submit
		homePage=new HomePage(driver);
		homePage.provideInputString(st);
		String subString=homePage.getLongestSubstring(st);
		resultPage=homePage.clickOnSubmit();
		
		//logic to get window handles since we are redirected in a new page
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String homePageWindow=it.next();
		String ResultPageWindow=it.next();
		driver.switchTo().window(ResultPageWindow);
		
		//Get text of the output substring is printed
		String outputString=resultPage.getOutputText();
		
		//Verify that the correct longest substring is calculated and displayed
		Assert.assertEquals(outputString, subString);
		
		//Close the browser
		teardown();
		
		
		
		
	}

}
