package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample_Steps {
	
	WebDriver driver=null;
	
	@Given("^Open the chrome and launch the MRS application$")
	public void open_the_chrome_and_launch_the_MRS_application() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C://java_selemium_demo//MRS_Maven//chromedriver.exe"); 
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize(); 
		 driver.get("https://demo.openmrs.org/openmrs/login.htm");
		 if(driver.getTitle().toString() == "Login") {
			 System.out.println("MRS application launched successfully");
		 }
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("Admin123");
	}

	@When("^Select the session$")
	public void select_the_session() throws Throwable {
	    driver.findElement(By.id("Operation")).click();
	}

	@When("^Click the login Button$")
	public void click_the_login_Button() throws Throwable {
	    driver.findElement(By.id("loginButton")).click();
	}

	@Then("^Assert the Successful navigation to home page$")
	public void assert_the_Successful_navigation_to_home_page() throws Throwable {
	    if(driver.getTitle().toString() == "Home") {
			 System.out.println("Login to MRS application successful.");
		 }
	}

	@When("^Click on the Logout Button$")
	public void click_on_the_Logout_Button() throws Throwable {
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^Assert the Successful Navigation to logout page$")
	public void assert_the_Successful_Navigation_to_logout_page() throws Throwable {
	    if(driver.getTitle().toString() == "Home") {
			 System.out.println("Logout from MRS application successful.");
		 }
		driver.quit();
	}	
	
}
