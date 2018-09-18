package pom;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.Take_ScreenShots;

public class Setup {

	ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.Resources_File");
	private String URL = System.getProperty("url");
	private String BROWSER = System.getProperty("browser");
	public static WebDriver driver;

	public void launch_Browser() {
//---------
		if (BROWSER.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.firefox.marionette",
					"D:\\Software\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (BROWSER.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Take_ScreenShots screenshots = new Take_ScreenShots();
	}

	public void launch_URL() {
		driver.get(bundle.getString("URL"));
	}

	public void close_browser() {
		driver.close();
	}
}
