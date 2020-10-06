/**
 * 
 */
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author sony
 *
 */
public final class verifyTitle {
	
	WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
	
	@Test
	public void titleVerification() {
		String expresult= "Facebook - Log In or Sign Up"
				+ "";
		String actualresult=driver.getTitle();
		Assert.assertEquals(actualresult, expresult);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		//driver.close();
	}

}








