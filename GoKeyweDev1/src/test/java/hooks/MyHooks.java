package hooks;

import baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends BaseClass {
	@Before
	public void beforeScenario() {
//		chromeLaunch();
		browserLaunch("chrome");
//		urlLaunch("https://dev1.gokeywe.com/");
		handleAuth();
		deleteAllCookies();
		maximize();
		impWait(60);

	}

	@After
	public void afterScenario() throws InterruptedException {
		Thread.sleep(5000);
//		quit();
	}
}
 