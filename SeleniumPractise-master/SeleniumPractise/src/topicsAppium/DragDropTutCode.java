package topicsAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragDropTutCode 
{
	
	
	//DragDrop 
	@Test 
	public void testDragDrop() throws Exception{ 
	DesiredCapabilities capabilities=new DesiredCapabilities(); 
	capabilities.setCapability("automationName","Appium"); 
	capabilities.setCapability("platformName","Android"); 
	capabilities.setCapability("platformVersion","4.4.2"); 
	capabilities.setCapability("deviceName","Revanth"); 
	capabilities.setCapability("app","C:\\Users\\revan\\Downloads\\DragSortDemo.apk"); 
	capabilities.setCapability("appPackage","com.mobeta.android.demodslv"); 
	capabilities.setCapability("appActivity","Launcher"); 
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); 
	((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title")).get(0)).click(); 
	new TouchAction((MobileDriver)driver).longPress((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0)).moveTo((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(7)).release().perform(); 
	Thread.sleep(5000); 
	driver.quit(); 
	//driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0) 
	} 
	//Swipe 
	@Test 
	public void testSwipe() throws MalformedURLException,Exception{ 
	DesiredCapabilities capabilities=new DesiredCapabilities(); 
	capabilities.setCapability("automationName","Appium"); 
	capabilities.setCapability("platformName","Android"); 
	capabilities.setCapability("platformVersion","4.4.2"); 
	capabilities.setCapability("deviceName","Revanth"); 
	capabilities.setCapability("app","C:\\Users\\revan\\Downloads\\DragSortDemo.apk"); 
	capabilities.setCapability("appPackage","com.mobeta.android.demodslv"); 
	capabilities.setCapability("appActivity","Launcher"); 
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); 
	((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title")).get(2)).click(); 
	new TouchAction((MobileDriver)driver).longPress((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(1)).moveTo(91,572).release().perform(); 
	Thread.sleep(5000); 
	driver.quit(); 
	} 
	//MultiTouch 
	@Test 
	public void testMultiTouch() throws MalformedURLException,Exception{ 
	DesiredCapabilities capabilities=new DesiredCapabilities(); 
	capabilities.setCapability("automationName","Appium"); 
	capabilities.setCapability("platformName","Android"); 
	capabilities.setCapability("platformVersion","4.4.2"); 
	capabilities.setCapability("deviceName","Revanth"); 
	capabilities.setCapability("app","C:\\Users\\revan\\Downloads\\DragSortDemo.apk"); 
	capabilities.setCapability("appPackage","multitouchpro.tests"); 
	capabilities.setCapability("appActivity","Multitouch"); 
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); 
	TouchAction action1=new TouchAction((MobileDriver)driver).longPress(114,363).waitAction(100).release().perform(); 
	TouchAction action2=new TouchAction((MobileDriver)driver).longPress(839,1450).waitAction(100).release().perform(); 
	new MultiTouchAction((MobileDriver)driver).add(action1).add(action2).perform(); 
	Thread.sleep(5000); 
	driver.quit(); 
	} 
	

}
