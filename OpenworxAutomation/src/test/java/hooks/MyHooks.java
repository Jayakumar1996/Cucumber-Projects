package hooks;

import baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends BaseClass {
	@Before
	public void beforeScenario() throws InterruptedException {
//		chromeLaunch();
		browserLaunch("chrome");
		urlLaunch("https://opnworx.com/app/login");
		deleteAllCookies();
		maximize();
		impWait(120);
		Thread.sleep(40000);

	}

	@After
	public void afterScenario() throws InterruptedException {
		Thread.sleep(40000);
		quit();
	}
}
