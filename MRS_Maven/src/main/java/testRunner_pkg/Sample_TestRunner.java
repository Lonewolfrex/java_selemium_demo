package testRunner_pkg;
	
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature;		


@RunWith(Cucumber.class)				
@CucumberOptions(
		features="/MRS_Maven/src/main/java/features_pkg/SampleTestRunner.feature",
		glue="/MRS_Maven/src/main/java/stepDefinition/Sample_Steps",
		plugin = {"pretty", "html:target/cucumber-reports"})						
public class Sample_TestRunner 				
{		
	
}