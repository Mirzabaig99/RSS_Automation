package pom;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import utility.Take_ScreenShots;

public class Setup {

	ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.Resources_File");
	private String URL = System.getProperty("url");
//	private String BROWSER = System.getProperty("browser");
	private String BROWSER = "FireFox";
	public static WebDriver driver;
	private String nodeURL;

	public void launch_Browser() throws InterruptedException, MalformedURLException {
		// ---------
		if (BROWSER.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.firefox.marionette",
					"D:\\Software\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if (BROWSER.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (BROWSER.equalsIgnoreCase("IE")) {

			nodeURL = "http://192.168.171.102:4547/wd/hub";

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

			capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

			System.setProperty("webdriver.ie.driver",
					"D:\\Software\\JAR Files\\Geckodriver\\geckodriver-v0.20.0-win64\\IEDriverServer.exe");

			// it is used to initialize the IE driver
			driver = new RemoteWebDriver(new URL(nodeURL), capabilities);

		}
		Thread.sleep(2000);
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
