package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/yashbhargava/Downloads/Automation/E2EProject/src/test/java/Features/Login.feature",
		glue="stepDefinations",
		format= {"pretty","html:test-output"},// To generate different types of reporting.
		monochrome=true,//display the console output in a proper readable format
		strict= true,// Will check if any Step is not defined in step Definition file
		dryRun= false
		)

public class TestRunner  extends AbstractTestNGCucumberTests{
	

}
