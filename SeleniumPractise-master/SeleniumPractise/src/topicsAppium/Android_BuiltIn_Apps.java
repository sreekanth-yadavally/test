/**
 * 
 */
package topicsAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author revan
 *
 */
public class Android_BuiltIn_Apps 
{
	@Test
	public void test_bultin_Apps() throws MalformedURLException
	{
		DesiredCapabilities cap = DesiredCapabilities.android();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Revanth");
		
		cap.setCapability("appPackage", "com.htc.android.worldclock");
		cap.setCapability("appActivity", "WorldClockTabControl");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
