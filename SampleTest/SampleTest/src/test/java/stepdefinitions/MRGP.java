package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MRGP extends BaseClass{

	By alltab = By.xpath("//section[@class=' flex flex-col bg-black']");
	By summarytab = By.xpath("//p[text()='Summary']");
	By gearicon = By.xpath("//button[@data-testid='controlIcon']");
	By twoDview = By.xpath("//p[text()='2D Slice View']");
	By threeDview = By.xpath("//p[text()='3D']");
	By models = By.xpath("//div[@data-testid='test-modelList']");
//	By mandibleyeicon= By.xpath("(//img[@alt='eyeIcon'])[1]");
	By craniaeyeicon = By.xpath("(//img[@alt='eyeIcon'])[2]");
	By teetheyeicon = By.xpath("(//img[@alt='eyeIcon'])[3]");
	By graftseyeicon = By.xpath("(//img[@alt='eyeIcon'])[4]");
	By remainingmandiblelefteyeicon = By.xpath("(//img[@alt='eyeIcon'])[5]");
	By remainingmandiblerighteyeicon = By.xpath("(//img[@alt='eyeIcon'])[6]");

	@Given("Launch the MRGP case from CMS emulator")
	public void launch_the_mrgp_case_from_cms_emulator() throws InterruptedException {
		System.out.println("SRT Application is launched");
		urlLaunch(
				"https://srtdeploymentstorage.z13.web.core.windows.net/#/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJDQVNFX0ZJTEVfTkFNRSI6IlIyX01SR1BfVjJfcGxhbiIsIkNBU0VfSUQiOiI2MDAwIiwiQ0FTRV9TVEFUVVMiOiJTdWNjZXNzIiwiQ01TX0FVVEhfVE9LRU4iOiJleUpoYkdjaU9pSklVekkxTmlJc0luUjVjQ0k2SWtwWFZDSjkuZXlKbGVIQWlPakUzTnpVME5qTXpORFo5LnBiQTJYQlVnR3l5RTlDeDROT3pYR0NKTWxpdVNhYUx1dGtIeEhwMkZIaDAiLCJOT1RJRllfUEFUSCI6Ii9zb2NrZXQuaW8ifQ.HahZ9R5Hdi6mdFz-uL2XqFU-9b5OdYAATttTXV-2Ktk");
		sleep(20000);
	}

	@When("User gets the list of tab names details")
	public void user_gets_the_list_of_tab_names_details() {

		List<WebElement> elements = driver.findElements(alltab);
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}

	@When("User click on summary tab")
	public void user_click_on_summary_tab() throws InterruptedException {

		click(summarytab);
	}

	@When("User click on the gear icon to open VCP")
	public void user_click_on_the_gear_icon_to_open_vcp() throws InterruptedException {

		click(gearicon);
	}

	@When("User Click on 2D slice view in VCP")
	public void user_click_on_2d_slice_view_in_vcp() throws InterruptedException {

		click(twoDview);
	}

	@When("User Click on 3D in VCP")
	public void user_click_on_3d_in_vcp() throws InterruptedException {
		click(threeDview);
	}

	@When("User Gets displayed models name list")
	public void user_gets_displayed_models_name_list() {
		List<WebElement> elements = driver.findElements(models);
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}

	@When("User Click on the gear icon to close VCP")
	public void user_click_on_the_gear_icon_to_close_vcp() throws InterruptedException {

		click(gearicon);
	}

	@When("User selects {string} from VCP")
	public void user_selects_from_vcp(String string) throws InterruptedException {
	   
		WebElement eyeicon = driver.findElement(By.xpath("(//*[contains(text(),"+string+")]/following::img[@alt=\"eyeIcon\"][1])"));
		WebElement mandibleslider = driver.findElement(By.xpath("(//*[contains(text(),"+string+")]/following::span[@data-index=\"0\"])[1]"));
		try {
			if (driver.findElement(By.xpath("//p[text()='"+string+"']")).isDisplayed()) {
				
				driver.findElement(By.xpath("(//*[contains(text(),'"+string+"')]/following::span[@data-index=\"0\"])[1]"))
						.click();
				Thread.sleep(2000);
				Actions sliderAction = new Actions(driver);
				// Move the slider by certain offset (assuming 100 pixels here, adjust as
				// needed)
				sliderAction.dragAndDropBy(mandibleslider, -100, 0).build().perform();
			}
		} catch (Exception e) {
			eyeicon.click();
			Thread.sleep(2000);
			Actions sliderAction = new Actions(driver);
			// Move the slider by certain offset (assuming 100 pixels here, adjust as
			// needed)
			sliderAction.dragAndDropBy(mandibleslider, -100, 0).build().perform();
		}
	}


	}
		
	


