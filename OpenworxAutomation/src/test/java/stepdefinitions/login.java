package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;
import io.cucumber.java.en.*;

public class login extends BaseClass {
	
	@Given("User navigates to login pagee")
	public void user_navigates_to_login_pagee() {
		System.out.println("Login page");
	}

	@When("User enters the valid email address {string} and valid password {string}")
	public void user_enters_the_valid_email_address_and_valid_password(String string, String string2) {
		driver.findElement(By.id("mat-input-0")).sendKeys(string);		
		driver.findElement(By.id("mat-input-1")).sendKeys(string2);
	}
	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
	}
	
	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() throws Exception {

	boolean contains = driver.getTitle().contains("Openworx");
	Assert.assertTrue(contains);
	Thread.sleep(2000);
	}

	@When("User enters the invalid email address {string} and invalid password {string}")
	public void user_enters_the_invalid_email_address_and_invalid_password(String string, String string2) throws InterruptedException {
		driver.findElement(By.id("mat-input-0")).sendKeys(string);		
		driver.findElement(By.id("mat-input-1")).sendKeys(string2);
		Thread.sleep(40000);
	}
	
	@Then("User should not get logged in")
	public void user_should_not_get_logged_in() {
		  boolean isErrorDisplayed = driver.findElement(By.id("mat-error-2")).isDisplayed();
		  Assert.assertTrue("Error message displayed, user login failed", isErrorDisplayed);
	}
	
	@When("User enters the valid email address {string} and invalid password {string}")
	public void user_enters_the_valid_email_address_and_invalid_password(String string, String string2) {
		driver.findElement(By.id("mat-input-0")).sendKeys(string);		
		driver.findElement(By.id("mat-input-1")).sendKeys(string2);
	}
	
	@When("User enters the invalid email address {string} and valid password {string}")
	public void user_enters_the_invalid_email_address_and_valid_password(String string, String string2) {
		driver.findElement(By.id("mat-input-0")).sendKeys(string);		
		driver.findElement(By.id("mat-input-1")).sendKeys(string2);
	}
	
	@When("User does not enters email address and password")
	public void user_does_not_enters_email_address_and_password() {
		System.out.println("User does not enters email address and password");
	}
	@Then("Verify an error message occurred")
	public void verify_an_error_message_occurred() {
        WebElement toasterMessage = driver.findElement(By.id("toast-container"));
        
        // Get the text content of the toaster message
        String messageText = toasterMessage.getText();
		  Assert.assertNotNull("Toaster message element is present", toasterMessage);
		  Assert.assertEquals("Expected toaster message", "Your expected message", messageText);
	}
	
	@Then("Verify the login button is disabled")
	public void verify_the_login_button_is_disabled() {
		WebElement disabledField = driver.findElement(By.xpath("//span[text()=' Login ']"));
		boolean isDisabled = disabledField.isEnabled();

		if (isDisabled) {
			System.out.println("The field is disabled.");
		} else {
			System.out.println("The field is not disabled.");
		}
	}

}
