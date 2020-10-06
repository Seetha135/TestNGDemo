

package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleFunctionalities {

	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
	}
	
	@Test(priority=0)
	public void verifyTitle()
	{
		String expresult= "Facebook - Log In or Sign Up"
				+ "";
		String actualresult=driver.getTitle();
		Assert.assertEquals(actualresult, expresult);
		
	}
	
	@Test(priority=1)
	public void verifyText1()
	{
		String expText="Connect with friends and the \n world around you on Facebook.";
		String actText=driver.findElement(By.cssSelector("#content > div > div > div > div > div._7d._6_._76 > h2")).getText();
		Assert.assertEquals(actText,expText);
				
	}
	
	@Test(priority=2)
	public void verifyText2()
	{
		/*String expText2="Sign Up";
		String actText2=driver.findElement(By.cssSelector("#content > div > div > div > div > div._6_._74 > h2")).getText();
		Assert.assertEquals(actText2, expText2);*/
		
		boolean isPresent=driver.getPageSource().contains("Sign Up");
		Assert.assertTrue(isPresent);
	}
	
	@Test(priority=3)
	public void verifyRadioButton()
	{
		boolean radiobuttonSelected = driver.findElement(By.id("u_0_7")).isSelected();
		Assert.assertFalse(radiobuttonSelected);
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
