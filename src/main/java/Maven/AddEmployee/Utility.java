package Maven.AddEmployee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	
	WebDriver driver;
	public Utility(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.cssSelector("input[id='tbxUserName']");
	public WebElement usernameID () {
		return driver.findElement(username);
	}
	
	By password = By.cssSelector("input[id='tbxPassword']");
	public WebElement passwordID () {
		return driver.findElement(password);
	}
	
	By submit = By.cssSelector("input[id='btnSubmit']");
	public WebElement submitID () {
		return driver.findElement(submit);
	}
	
	By click = By.cssSelector("a[id='ctl00_ctl00_hdr_hdr_rcbUsersSchools_Arrow']");
			public WebElement clickID () {
		return driver.findElement(click);
	}		
	
	By switchToMMSA = By.xpath("//li[contains(text(),'Minnesota MSA')]");
	public WebElement mmsaID () {
		return driver.findElement(switchToMMSA);
	}
	
	By staff = By.xpath("//div[@class='yui3-u']/div/ul/li[5]");
	public WebElement staffID () {
		return driver.findElement(staff);
	}
	
	By manage = By.xpath("//div[@class='yui3-u']/div/ul/li[5]/div/ul/li[1]");
	public WebElement manageID () {
		return driver.findElement(manage);
	}
	
	By add = By.xpath("//div[@id='ctl00_ctl00_c_c_rap1']/div[1]/a");
	public WebElement addID () {
		return driver.findElement(add);
	}
	
	
	
	
	
	
	
	
	

}
