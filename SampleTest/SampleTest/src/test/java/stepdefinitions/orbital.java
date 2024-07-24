package stepdefinitions;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;

public class orbital extends BaseClass {

	@Given("Launch the Orbital case from CMS emulator")
	public void launch_the_orbital_case_from_cms_emulator() throws InterruptedException {
		System.out.println("SRT Application is launched");
		urlLaunch("https://srtdeploymentstorage.z13.web.core.windows.net/#/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJDQVNFX0ZJTEVfTkFNRSI6IlIyX09yYml0YWxfVjJfcGxhbiIsIkNBU0VfSUQiOiI2MDAxIiwiQ0FTRV9TVEFUVVMiOiJTdWNjZXNzIiwiQ01TX0FVVEhfVE9LRU4iOiJleUpoYkdjaU9pSklVekkxTmlJc0luUjVjQ0k2SWtwWFZDSjkuZXlKbGVIQWlPakUzTnpVME5qTXpORFo5LnBiQTJYQlVnR3l5RTlDeDROT3pYR0NKTWxpdVNhYUx1dGtIeEhwMkZIaDAiLCJOT1RJRllfUEFUSCI6Ii9zb2NrZXQuaW8ifQ.N1uPruUSI3P5uVHAehVKQe6FToMrIPkGtwUlB9N9tmY");		
		sleep(20000);
		
	}
	
	
}
