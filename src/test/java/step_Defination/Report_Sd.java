package step_Defination;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Report_POM;
import pom.Setup;
import utility.AllPage_Verify;

public class Report_Sd extends Setup {

	Report_POM report = new Report_POM(driver);
	AllPage_Verify verifyPage = new AllPage_Verify();

	@Given("^User is navugated to \"([^\"]*)\"$")
	public void user_is_navugated_to(String ExpName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("html/body/app-root/div/app-resource-scheduler/div[1]/app-navigation/nav/ul[2]/li[4]/a"))
				.click();
		verifyPage.Page_Verify(ExpName);
	}

	/*
	 * @When("^User select \"([^\"]*)\">  for resource dropdown$") public void
	 * user_select_for_resource_dropdown(String ReportType) {
	 * System.out.println("for resource dropdown"); //
	 * report.Report_Type("All"); }
	 */

	@When("^User select \"([^\"]*)\" for resource dropdown$")
	public void user_select_for_resource_dropdown(String arg1) {
		System.out.println("for resource dropdown");
	}

	@When("^User  Select \"([^\"]*)\" for Project dropdown$")
	public void user_Select_for_Project_dropdown(String arg1) throws AWTException, InterruptedException {

	}

	@When("^User  Select \"([^\"]*)\" for Location dropdown$")
	public void user_Select_for_Location_dropdown(String arg1) {

	}

	@When("^User  Select  \"([^\"]*)\" for Department dropdown$")
	public void user_Select_for_Department_dropdown(String arg1) {

	}

	@When("^User  Select  \"([^\"]*)\" for Start Date dropdown$")
	public void user_Select_for_Start_Date_dropdown(String arg1) {

	}

	@When("^User  Select  \"([^\"]*)\" for End Date dropdown$")
	public void user_Select_for_End_Date_dropdown(String arg1) {

	}

	@Then("^Clicks on Get Report$")
	public void clicks_on_Get_Report() {
		report.Get_Report_Button();
	}

	@After
	public void AfterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException wde) {
				System.err.println(wde.getMessage());
			} catch (ClassCastException cce) {
				cce.printStackTrace();
			}
		}
	}
}
