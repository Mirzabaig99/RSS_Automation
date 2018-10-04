package step_Defination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Schedular_POM;
import pom.Setup;
import utility.Take_ScreenShots;

public class Schedular_Sd extends Setup {
	Take_ScreenShots screenshots = new Take_ScreenShots();
	Schedular_POM Schedular = new Schedular_POM(driver, screenshots);

	@When("^User \"([^\"]*)\"$")
	public void user(String CheckView) throws IOException, InterruptedException {
		Schedular.verfiyResourceProjectViewTab(CheckView);

	}

	@When("^User clicks on different \"([^\"]*)\"$")
	public void user_clicks_on_different(String ClickView) throws IOException, InterruptedException {
		Schedular.Resource_Or_ProjectViewTab(ClickView);
	}

	@Then("^Application should change the view$")
	public void application_should_change_the_view() {
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
