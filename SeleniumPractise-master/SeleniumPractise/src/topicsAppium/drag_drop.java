/**
 * 
 */
package topicsAppium;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author revan
 *Drag drop for Appium
 */
public class drag_drop 
{
	@Test
	public  void drapDrop() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("automationName", "Appium");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "4.4.2");
//		cap.setCapability("deviceName", "Revanth");
		
		
		//Alternative method
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Revanth");
		cap.setCapability(MobileCapabilityType.VERSION, "4.4.2");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\revan\\Downloads\\DragSortDemo.apk");
		
		
		cap.setCapability("appPackage", "com.mobeta.android.demodslv");
		cap.setCapability("appActivity", "Launcher");
		
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,cap);
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.mobeta.android.demodslv:id/activity_title\").text(\"Basic usage playground\")").click();
		
		new TouchAction((MobileDriver)driver).longPress((WebElement) driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/action_bar_overlay_layout\")").get(1)).moveTo((WebElement) driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/action_bar_overlay_layout\")").get(4)).release().perform();
		
	
		
		
	}

	private MobileDriver MobileDriver(AndroidDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
