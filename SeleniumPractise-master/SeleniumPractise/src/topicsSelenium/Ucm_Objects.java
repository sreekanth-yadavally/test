/**
 * 
 */
package topicsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author revan
 *
 */
public class Ucm_Objects 
{
	WebDriver driver;
	
	public void homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
		// *********Home Page*************
		
		@FindBy(xpath=".//*[@id='bblogo']/a[3]/img")
		WebElement BlackBoard_link;
		
		@FindBy(xpath=".//*[@id='bblogo']/a[2]/img")
		WebElement email_link;
		
		@FindBy(xpath=".//*[@id='bblogo']/a[1]/img")
		WebElement library_link;
		
		@FindBy(xpath=".//*[@id='myCentral_head']/p/a/img")
		WebElement MyCentral_Link;
		
		@FindBy(xpath=".//*[@id='about']/a")
		WebElement AboutUs_link;
		
		@FindBy(partialLinkText="Academics")
		WebElement Academics_link;
		
		@FindBy(linkText="Apply")
		WebElement ApplyNow_link;
	
	
	public WebElement BlackBoard_link()
	{
		return BlackBoard_link();
	}
	
	public WebElement email_link()
	{
		return email_link();
	}
	
	public WebElement library_link()
	{
		return library_link();
	}
	
	public WebElement Academics_link()
	{
		return Academics_link();
	}
	
	public WebElement MyCentral_Link()
	{
		return MyCentral_Link();
	}
}


