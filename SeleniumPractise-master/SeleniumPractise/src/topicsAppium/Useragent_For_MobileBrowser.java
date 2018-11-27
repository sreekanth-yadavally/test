package topicsAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Useragent_For_MobileBrowser 
{

	@Test
	public void test() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Revanth");
		cap.setCapability(MobileCapabilityType.VERSION, "4.4.2");
		
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "Main");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,cap);
/*
		Get the UserAgent from device 
		JavascriptExecutor je=(JavascriptExecutor)driver; 
		System.out.println(je.executeScript("return navigator.userAgent;",new Object[0])); 
		Thread.sleep(10000);
*/
		driver.get("http://www.facebook.com");
		driver.findElement(By.className("_56bg _4u9z _5ruq")).sendKeys("Revanths Appium Testing");
//		driver.quit(); 
		
		
	}
}
