package stepdefinitions;

import org.openqa.selenium.By;

import baseclass.BaseClass;
import io.cucumber.java.en.*;

public class StepDefinitions extends BaseClass {

	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		driver.findElement(By.linkText("Login")).click();

	}

	@When("User enters the valid email address {string} and valid password {string}")
	public void user_enters_the_valid_email_address_and_valid_password(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[1]")).sendKeys(string);
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[2]")).sendKeys(string2);
		Thread.sleep(2000);
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {

	}

	@When("User enters the invalid email address {string} and invalid password {string}")
	public void user_enters_the_invalid_email_address_and_invalid_password(String string, String string2) {
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[1]")).sendKeys(string);
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[2]")).sendKeys(string2);
	}

	@Then("User should not get logged in")
	public void user_should_not_get_logged_in() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@When("User enters the valid email address {string} and invalid password {string}")
	public void user_enters_the_valid_email_address_and_invalid_password(String string, String string2) {
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[1]")).sendKeys(string);
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[2]")).sendKeys(string2);
	}

	@When("User enters the invalid email address {string} and valid password {string}")
	public void user_enters_the_invalid_email_address_and_valid_password(String string, String string2) {
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[1]")).sendKeys(string);
		driver.findElement(By.xpath("(//input[@id='signinLogin'])[2]")).sendKeys(string2);
	}

	@When("User does not enters email address and password")
	public void user_does_not_enters_email_address_and_password() {

	}



}
