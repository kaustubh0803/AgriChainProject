package pageobjects;


import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public ResultPage resultPage;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="") //locator for input box on the HomePage
	WebElement inputElement;
	
	@FindBy(xpath="") ///locator for Submit button on the HomePage
	WebElement submitElement;
	
	public void provideInputString(String st) {
		inputElement.sendKeys(st);
	}
	
	public ResultPage clickOnSubmit() {
		submitElement.click();
		return resultPage;
	}
		
	public String getLongestSubstring(String st) {
		int l= st.length();
		int maxLength=0;
		int left=0;
		String maxSubString="";
		HashSet<Character> set=new HashSet<>();
		for(int right=0; right<l; right++) {
			char currentChar=st.charAt(right);
			while(set.contains(currentChar)) {
				set.remove(st.charAt(left));
				left++;
			}
			set.add(currentChar);
			maxLength=Math.max(maxLength, right-left+1);
			maxSubString=st.substring(left,right+1);
		}
		return maxSubString;
	}
	
	}

