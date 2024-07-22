package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InventoryManagementPartCreationPage {

	WebDriver driver;
	WebDriverWait wait;

	// Locator for the "Parts" button
	By partsButton = By.linkText("Parts");
    By inventoryManagementButton = By.xpath("//h6[text()='Inventory Management']");
    By navigateToPartModule = By.id("select-parts");
    By createNewPart = By.id("part-create");
    // Locators for part creation fields (example names, adjust as necessary)
    By partNameField = By.name("Part Name");
    By partNumberField = By.name("Part Number");
    By descriptionField = By.name("Description");
    By quantityField = By.name("Quantity");
    By unitPriceField = By.name("Unit Price");
    By submitButton = By.xpath("//button[text()='Submit']");


	// Constructor
	public InventoryManagementPartCreationPage(WebDriver driver) {
		this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Method to click on the "Parts" button
	public void clickPartsButton() {
		WebElement partsBtn = wait.until(ExpectedConditions.elementToBeClickable(partsButton));
		partsBtn.click();
	}
	
	 public void clickInventoryManagementButton() {
	        WebElement inventoryMgmtBtn = wait.until(ExpectedConditions.elementToBeClickable(inventoryManagementButton));
	        inventoryMgmtBtn.click();
	    }
	 public void navigateToPartModule() {
		 WebElement navigateToPart = wait.until(ExpectedConditions.elementToBeClickable(navigateToPartModule));
		 	navigateToPart.click();
	}
	 public void clickNewPart() {
		 
			WebElement NewPart = wait.until(ExpectedConditions.elementToBeClickable(createNewPart));
			NewPart.click();
		 
	}
	 public void createPart(String partName, String partNumber, String description, String quantity, String unitPrice) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(partNameField)).sendKeys(partName);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(partNumberField)).sendKeys(partNumber);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField)).sendKeys(description);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(quantityField)).sendKeys(quantity);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(unitPriceField)).sendKeys(unitPrice);
	        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	    }

}
