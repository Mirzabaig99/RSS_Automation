package step_Defination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pom.Setup;
import utility.CleanFolder;
import utility.Take_ScreenShots;

public class Browser_launch_Sd extends Setup {

	Take_ScreenShots screenshots = new Take_ScreenShots();
	CleanFolder clean = new CleanFolder();

	@Given("^User opens the browser$")
	public void user_opens_the_browser() throws IOException, InterruptedException {
		clean.clearfolder();
		launch_Browser();
		System.out.println("Browser_launch");
		screenshots.takeScreenShot(driver, "launch_Browser_RCP");
	}

	@When("^User launches the URL$")
	public void user_launches_the_URL() {
		launch_URL();
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
