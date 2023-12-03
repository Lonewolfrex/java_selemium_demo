package testRunner_pkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions")
public class Sample_TestRunner extends AbstractTestNGCucumberTests {

}