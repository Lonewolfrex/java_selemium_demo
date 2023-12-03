package utilities_pkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.cdimascio.dotenv.Dotenv;

public class Common_Utilities {
		
	public WebDriver initialize_driver(String browser_type) {
		WebDriver driver = null;
		switch (browser_type) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\java_selemium_demo\\MRS_Maven\\chromedriver.exe"); 
			 driver = new ChromeDriver(); 			
			break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver", "C:\\java_selemium_demo\\MRS_Maven\\chromedriver.exe"); 
			 driver = new FirefoxDriver(); 			
			break;
		default:
			System.out.println("Invalid browser provided");
			break;
		}
		return driver;
	}

}
