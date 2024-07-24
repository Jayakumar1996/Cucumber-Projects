package org.ts.Demo;

import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;

import baseclass.BaseClass;

public class AppTest extends BaseClass {

	@Test
	public void seleniumPractise() throws InterruptedException {

		browserLaunch("chrome");
		urlLaunch("https://www.selenium.dev/selenium/web/web-form.html");
		deleteAllCookies();
		maximize();
		impWait(60);
		Faker faker = new Faker();
		String randomName = faker.name().fullName();

		// Text field
//		String dynamicText1 = "Jayakumar";
//		textField.sendKeys(dynamicText1);
		WebElement textField = driver.findElement(By.id("my-text-id"));
		textField.sendKeys(randomName);

		// Password field
		WebElement passwordField = driver.findElement(By.name("my-password"));
		passwordField.sendKeys(randomName);

		// Textarea field
		WebElement textAreaField = driver.findElement(By.name("my-textarea"));
		textAreaField.sendKeys(randomName);

		// disabled field
		WebElement disabledField = driver.findElement(By.name("my-disabled"));
		boolean isDisabled = !disabledField.isEnabled();

		if (isDisabled) {
			System.out.println("The field is disabled.");
		} else {
			System.out.println("The field is not disabled.");
		}

		// ReadOnly Input
		WebElement readOnlyField = driver.findElement(By.name("my-readonly"));

		String readOnlyAttribute = readOnlyField.getAttribute("Readonly input");
		boolean isReadOnly = readOnlyAttribute != null && readOnlyAttribute.equals("true");

		if (isReadOnly) {
			System.out.println("The field is read-only.");
		} else {
			System.out.println("The field is not read-only.");
		}

		// Dropdown (select)
		WebElement dropdown = driver.findElement(By.name("my-select"));

		Select select = new Select(dropdown);
		select.selectByVisibleText("One");
		Thread.sleep(2000);
		select.selectByVisibleText("Two");
		Thread.sleep(2000);
		select.selectByVisibleText("Three");

		// Dropdown(Datalist)
		WebElement searchField = driver.findElement(By.name("my-datalist"));
		searchField.sendKeys("San Francisco");
		searchField.clear();
		searchField.sendKeys("New York");
		Thread.sleep(2000);
		searchField.clear();
		searchField.sendKeys("Seattle");
		Thread.sleep(2000);
		searchField.clear();
		searchField.sendKeys("Los Angeles");
		Thread.sleep(2000);
		searchField.clear();
		searchField.sendKeys("Chicago");

		// File Input
		String filePath = "C:\\Users\\jayakumart\\Documents\\KeyWe\\Agent images\\Sample.jpg";
		WebElement uploadButton = driver.findElement(By.xpath("//input[@type='file']"));
		uploadButton.sendKeys(filePath);

		// Color Picker
		WebElement colorPicker = driver.findElement(By.name("my-colors"));

		String randomColor = generateRandomColor();
		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", colorPicker, randomColor);
		Thread.sleep(2000);

		// Date picker
//		WebElement datePickerInput = driver.findElement(By.name("my-date"));
//		datePickerInput.click();
//
//		WebElement desiredDateElement = driver.findElement(By.xpath("//td[@data-date='1700092800000']"));
//		desiredDateElement.click();

		//Checkbox
		WebElement defCheckbox = driver.findElement(By.id("my-check-2"));
		defCheckbox.click();

		WebElement defRadio = driver.findElement(By.id("my-radio-2"));
		defRadio.click();
		Thread.sleep(2000);

		// Example range
		WebElement rangeSlider = driver.findElement(By.name("my-range")); 
		int sliderWidth = rangeSlider.getSize().getWidth();

		Actions actions = new Actions(driver);

		Random random1 = new Random();
		int xOffset = random1.nextInt(sliderWidth);

		actions.clickAndHold(rangeSlider).moveByOffset(xOffset, 0).release().build().perform();
		Thread.sleep(2000);
		actions.clickAndHold(rangeSlider).moveByOffset(xOffset, -1).release().build().perform();
		Thread.sleep(9000);

//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.quit();
	}
}
