package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DifferentBowser {
	
	@Test
	public void openBrowser()
{
		
		
		//System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://facebook.com");
	}

}

