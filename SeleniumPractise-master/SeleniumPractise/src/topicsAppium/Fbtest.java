/**
 * 
 */
package topicsAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author revan
 *
 */
public class Fbtest 
{
	@Test
	public void fblogin() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capb = DesiredCapabilities.android();
		
		capb.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		capb.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capb.setCapability(MobileCapabilityType.DEVICE_NAME, "Revanth");
		capb.setCapability(MobileCapabilityType.VERSION, "4.4.2");
		//Add applocation if needed
		
		capb.setCapability("appPackage", "io.selendroid.testapp");
		capb.setCapability("appActivity", "HomeScreenActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
//		WebDriver driver = new AndroidDriver(url, capb);
		AndroidDriver driver = new AndroidDriver(url,capb);
//		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/my_text_field\")").sendKeys("revanthkng@gmail.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.currentActivity());
//		Thread.sleep(3000);
//		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/waitingButtonTest\")").isDisplayed());
//		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/waitingButtonTest\")").click();
		
		Thread.sleep(12000);
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/visibleButtonTest\")").isDisplayed());
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/visibleButtonTest\")").click();
		// close the browser
	
	}
	

}
