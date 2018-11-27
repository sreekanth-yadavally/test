/**
 * 
 */
package topicsSelenium;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author revan
 *
 */
public class ExampleTestNGLog4j 
{
	//Example for Selenium using TestNG, Log4j
	WebDriver driver;
//	Logger logger;
	@BeforeTest
	public void startup()
	{
		//Opening Firefox
		driver = new FirefoxDriver();
	}
	@Test
	public void login()
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
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
//		logger.info("Logger Closed");
		
	}

}
