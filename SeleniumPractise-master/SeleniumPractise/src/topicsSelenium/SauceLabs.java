package topicsSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SauceLabs 
{
	WebDriver driver;
	@Test
	public void SauceLabsTest() throws MalformedURLException
	{
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("version", "10");
		cap.setCapability("platform", "XP");
		
		driver = new RemoteWebDriver(new URL("http://RevanthG:f331358b-5dd8-4573-9291-6a3cfbb28a69@ondemand.saucelabs.com:80/wd/hub"), cap);
		driver.get("http://www.ucmo.edu");
		System.out.println(driver.getTitle());
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
