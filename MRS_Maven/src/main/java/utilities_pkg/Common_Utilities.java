package utilities_pkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.cdimascio.dotenv.Dotenv;

public class Common_Utilities {
		
	public static WebDriver initialize_driver(String browser_type) {
		WebDriver driver = null;
		if(browser_type == "chrome") {
			System.setProperty("webdriver.chrome.driver", "/MRS_Maven/chromedriver.exe"); 
			driver = new ChromeDriver(); 
		} else if(browser_type == "firefox") {
			System.setProperty("webdriver.firefox.driver", "/MRS_Maven/chromedriver.exe"); 
			 driver = new FirefoxDriver(); 				
		}
		return driver;
	}

}
