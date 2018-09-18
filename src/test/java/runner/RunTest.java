package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pom.Setup;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = { "src/test/java/Feature files" }, plugin = { "pretty:STDOUT",
		"html:C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\CucumberReporting_Practice\\Report\\Cucumber-pretty",
		"json:C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\CucumberReporting_Practice\\Report\\cucumber-json\\cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\CucumberReporting_Practice\\Report\\cucumber-extent\\report.html" }, tags = {}, monochrome = true, glue = {
				"step_Defination" }, dryRun = false)
public class RunTest extends Setup {

	@AfterClass
	public static void reportSetup() {
		Reporter.loadXMLConfig(new File("src/test/java/XML FIle/extent-config.xml"));
		/*
		 * Properties p = System.getProperties(); p.list(System.out);
		 */

		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit", "Windows 10");
		Reporter.setSystemInfo("2.53.0", "Selenium");
		Reporter.setSystemInfo("3.3.9", "Maven");
		Reporter.setSystemInfo("1.8.0_66", "Java Version");
		Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
	}
}