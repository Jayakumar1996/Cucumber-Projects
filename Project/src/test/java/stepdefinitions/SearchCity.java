package stepdefinitions;

import org.openqa.selenium.By;

import baseclass.BaseClass;
import io.cucumber.java.en.*;

public class SearchCity extends BaseClass{
		
	@Given("user enters email {string} and enters password {string} and clicks on login button")
	public void user_enters_email_and_enters_password_and_clicks_on_login_button(String string, String string2) {
		driver.findElement(By.linkText("Login")).click();
//		click(loginnavigator);
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[1]")).sendKeys(string);
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[2]")).sendKeys(string2);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}


	@When("Click the keywe or cb logo in the navbar to land on the homepage")
	public void click_the_keywe_or_cb_logo_in_the_navbar_to_land_on_the_homepage() {

		driver.findElement(By.xpath("//div[@class='header-module--headLogoCenter--74172']//img[1]")).click();	}

	@When("search for with city name {string}")
	public void search_for_with_city_name(String string) throws InterruptedException {

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
		Thread.sleep(1000);
		driver.findElement(By.className("dashboard-module--searchIcon--6a46c")).click();

	}
}
