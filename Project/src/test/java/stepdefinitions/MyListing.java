package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.BaseClass;
import io.cucumber.java.en.*;

public class MyListing extends BaseClass {
	
	@When("User navigates to My Listing module")
	public void user_navigates_to_my_listing_module() {

		driver.findElement(By.xpath("//div[text()='My Listing']")).click();
	}

	@When("User clicks the required dropdown and then the results are displayed")
	public void user_clicks_the_required_dropdown_and_then_the_results_are_displayed() {

		WebElement dropdownField = driver.findElement(By.id("calender"));
		// dropdownField.click();
		Select dropdown = new Select(dropdownField);
        dropdown.selectByVisibleText("Sold"); 
        
        // Get the currently selected option
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());

        // Get all options from the dropdown
        List<WebElement> allOptions = dropdown.getOptions();
        System.out.println("All options:");
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
	}
	
	@When("User clicks Add Listing button")
	public void user_clicks_add_listing_button() {
		
		driver.findElement(By.xpath("//button[text()='Add Listing']")).click();
	}
	
	@When("User enters the property datas for adding the exclusives")
	public void user_enters_the_property_datas_for_adding_the_exclusives() throws InterruptedException {
		driver.findElement(By.name("address")).sendKeys("15310 Santella CT, LOS GATOS, CA 95032");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='position-absolute SerachDropdown1']//p[1]")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.name("listing_status"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Draft");
		Thread.sleep(200000);
		
	}
	
	@Then("User clicks save then that property is displayed in the mylisting page")
	public void user_clicks_save_then_that_property_is_displayed_in_the_mylisting_page() {
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).getText();
		
	}

}
