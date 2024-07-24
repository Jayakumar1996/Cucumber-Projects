package stepdefinitions;

import org.openqa.selenium.By;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OrgDesign extends BaseClass {

	By preopexpand = By.xpath("(//img[@data-testid='expand-icon'])[1]");
	By postopexpand = By.xpath("(//img[@data-testid='expand-icon'])[2]");
	
	//By preopminimize = By.xpath("//div[@data-testid='render-view-image-container']//canvas[1]");
	By preopminimize = By.xpath("//img[@data-testid='minimize-icon']");
	By postopminimize = By.xpath("//img[@data-testid='minimize-icon']");
	
	
@Given("Launch the Orthognathic Design case from CMS emulator")
public void launch_the_orthognathic_design_case_from_cms_emulator() throws InterruptedException {
	System.out.println("SRT Application is launched");
	urlLaunch("https://srtdeploymentstorage.z13.web.core.windows.net/#/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJDQVNFX0ZJTEVfTkFNRSI6IlIyX09SR19WMl9kZXNpZ25fcmV2aWV3IiwiQ0FTRV9JRCI6IjYwMDIiLCJDQVNFX1NUQVRVUyI6IlN1Y2Nlc3MiLCJDTVNfQVVUSF9UT0tFTiI6ImV5SmhiR2NpT2lKSVV6STFOaUlzSW5SNWNDSTZJa3BYVkNKOS5leUpsZUhBaU9qRTNOelUwTmpNek5EWjkucGJBMlhCVWdHeXlFOUN4NE5PelhHQ0pNbGl1U2FhTHV0a0h4SHAyRkhoMCIsIk5PVElGWV9QQVRIIjoiL3NvY2tldC5pbyJ9.X5ssyPvsFujNHp0Rt62cjjKPhsfY2xTaVjIF7tRCJJU");		
	sleep(20000);
}

@When("Click on Expand button in pre-op view")
public void click_on_expand_button_in_pre_op_view() throws InterruptedException {
 
	click(preopexpand);
}

@When("Click on Expand button in post-op view")
public void click_on_expand_button_in_post_op_view() throws InterruptedException {
    click(postopexpand);
}

@When("Click on minimize button in pre-op view")
public void click_on_minimize_button_in_pre_op_view() throws InterruptedException {
	//Actions a =new Actions(driver);
//	driver.findElement(postopexpand)
//	a.doubleClick(preopminimize).perform();
	
 click(preopminimize);
}

@When("Click on minimize button in post-op view")
public void click_on_minimize_button_in_post_op_view() throws InterruptedException {
   click(postopminimize);
}


}
