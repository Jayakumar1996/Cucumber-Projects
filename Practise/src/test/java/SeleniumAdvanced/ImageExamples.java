package SeleniumAdvanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImageExamples {

	@Test
	private void checkBrokenImage() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/broken-images");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	

		WebElement brokenImage = driver.findElement(By.xpath("//img[@alt='Image 1']"));
		
		//"naturalWidth" = 0
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is broken");
		}else {
			System.out.println("The Image is NOT broken");
		}
	}

}
