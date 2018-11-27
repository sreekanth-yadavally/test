/**
 * 
 */
package topicsSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author revan
 *
 */
public class Screenshot_JS 
{
	WebDriver driver;
//	Logger logger;
	@BeforeTest
	public void startup()
	{
		//Opening Firefox
		driver = new FirefoxDriver();
		
	}
	@Test
	public void login() throws IOException
	{
		//Initializing logger
//		PropertyConfigurator.configure("C:\\Users\\revan\\git\\SeleniumPractise\\SeleniumPractise\\log4j.properties");
//		logger = Logger.getLogger("ExampleTestNGLog4j");
//		logger.info("Logger Started");
//		logger.info("Firefox Opened");
//		driver.get("http://www.google.com");
//		logger.info("google opened");
		
		//Opening Gmail
		driver.navigate().to("http://www.gmail.com");
//		logger.info("gmail opened");
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("d:\\screenshot.jpg"));
		
				
	}

}
