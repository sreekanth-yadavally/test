/**
 * 
 */
package topicsSelenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * @author revan
 *
 */
public class HomePage extends Ucm_Objects
{
	
	
//	Logger logger;
	
	
	
	WebDriver driver = new FirefoxDriver();
	@Given("I am Given")
	public void NavLinks()
	{
		
		
//		PropertyConfigurator.configure("D:\\maven\\ucmo.edu\\log4j.properties");
//		logger = Logger.getLogger("ExampleTestNGLog4j");
		
		System.out.println("In UCM home page");	
		
	}
	@When("I am when")
	public void BlackboardLink()
	{
		
		System.out.println("I click Blackboard nav link");
//		Ucm_Objects ob = new Ucm_Objects();
//		ob.BlackBoard_link().click();
		
	}
	@Then("I am then")
	public void Success()
	{
		System.out.println("It will open Blackboard home page");
		System.out.println("Executed Successfully");
	}
	@Given("I am in google home page")
	public void openURL()
	{
		
		driver.get("http://www.google.com");
	}
	@When("I enter git")
	public void openGit()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("git");
		
	}
	@Then("It will open Suggestions")
	public void suggestions()
	{
		System.out.println("Execution Completed");
	}

	
}
