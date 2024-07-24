package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.BaseClass;
import baseclass.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks extends BaseClass {

	@Before
	public void beforeScenario() {
		//browserLaunch(ConfigReader.getProperty("BROWSER"));
		multiPlatform(ConfigReader.getProperty("BROWSER"),ConfigReader.getProperty("PLATFORM"));
		System.out.println("Currently enter after launched");
		maximize();		
		System.out.println("Currently enter after Maximize");
		deleteAllCookies();
		System.out.println("Currently enter after Cookies");
		impWait(60);

	}

	@After
	public void afterScenario() {
		EmailSender.sendTestReport();
		quit();
	}

	@AfterStep
	public void takeScreenshotAfterStep(Scenario scenario) {
		try {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
		} catch (Exception e) {
			System.out.println("Failed to take screenshots" + e.getMessage());
		}

	}
}
