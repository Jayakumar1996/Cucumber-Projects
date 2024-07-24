package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;
import io.cucumber.java.en.*;

public class Buyers extends BaseClass{
	
	@When("User navigates to buyers module")
	public void user_navigates_to_buyers_module() {
		driver.findElement(By.xpath("//div[text()='Buyers']")).click();

	}
	
	@When("User searches using the buyers name {string}")
	public void user_searches_using_the_buyers_name(String string) throws Exception {

		WebElement searchField = driver.findElement(By.id("gsearch"));
		searchField.sendKeys(string);
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@When("User clears the search data and verifies the data is back to normal")
	public void user_clears_the_search_data_and_verifies_the_data_is_back_to_normal() throws Exception {
		
		WebElement searchField = driver.findElement(By.id("gsearch"));
		searchField.clear();
		Thread.sleep(2000);
//		searchField.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//img[@class='search-icon-img cursor-pointer']")).click();
	}

}
