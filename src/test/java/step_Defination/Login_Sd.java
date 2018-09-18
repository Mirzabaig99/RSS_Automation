package step_Defination;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Login_POM;
import pom.Setup;
import utility.Take_ScreenShots;


public class Login_Sd extends Setup {
		Take_ScreenShots screenshots = new Take_ScreenShots();

	Login_POM login = new Login_POM(driver,screenshots );
	
	@Then("^User in on \"([^\"]*)\" URL$")
	public void user_in_on_URL(String arg1) {
		launch_URL();
		System.out.println("URL Launch");
	}

	@Given("^user is on Lopginpage$")
	public void user_is_on_Lopginpage() {

	}

	@When("^user enters \"([^\"]*)\" in EmployeeID textbox$")
	public void user_enters_in_EmployeeID_textbox(String EmpID) throws IOException {
		login.enter_EmployeeID(EmpID);
		screenshots.takeScreenShot(driver, "RCP");
	}

	@When("^user enters \"([^\"]*)\" in password textbox$")
	public void user_enters_in_password_textbox(String passwd) throws IOException {
		login.enter_Password(passwd);
		screenshots.takeScreenShot(driver, "RCP");
	}

	@When("^user cliks on LoginButton$")
	public void user_cliks_on_LoginButton() throws IOException {

		login.Click_Login();
		screenshots.takeScreenShot(driver, "RCP");

	}

	@Then("^user should navigate to homePage$")
	public void user_should_navigate_to_homePage() throws IOException, InterruptedException {

		Thread.sleep(2000);
//		login.ClickReport();
		screenshots.takeScreenShot(driver, "RCP");
	}

}
