package stepDefinitions;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Maven.AddEmployee.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver;
	
	@Given("^The user will log in with valid admin credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_will_log_in_with_valid_admin_credentials_something_and_something(String username, String password) throws Throwable {
	       
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\ogurlu\\eclipse-workspace\\AddEmployee\\src\\main\\java\\Maven\\AddEmployee\\file.properties");
			prop.load(fis);
			String url = prop.getProperty("url");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ogurlu\\Desktop\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Utility util = new Utility (driver);
			util.usernameID().sendKeys(username);
			util.passwordID().sendKeys(password);
			util.submitID().click();
			util.clickID().click();
			util.mmsaID().click();
			util.staffID().click();
			util.manageID().click();
			util.addID().click();
		
			
	    }

	    @When("^user enters employees \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_employees_something_something_and_something(String fName, String lName, String userName) throws Throwable {
	       
	    }

	    @Then("^employee has been added successfully$")
	    public void employee_has_been_added_successfully() throws Throwable {
	       
	    }

	    @And("^user will navigate to add employee page$")
	    public void user_will_navigate_to_add_employee_page() throws Throwable {
	        
	    }

	    @And("^user clicks submit button$")
	    public void user_clicks_submit_button() throws Throwable {
	      
	    }
	
	   
	    
	   
	    
}
