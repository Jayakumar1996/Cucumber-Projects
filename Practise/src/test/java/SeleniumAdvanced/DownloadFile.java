package SeleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile {

	public static WebDriver driver;

	@Test
	public static void file() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");

				WebElement downloadLink = driver.findElement(By.xpath("//span[text()='Download']"));
				downloadLink.click();
				Thread.sleep(3000);
								
				File fileLocation = new File("C:\\Users\\Jayakumar\\Downloads");
				//Returns all the list files in the downloads
				File[] listFiles = fileLocation.listFiles();
				
				for (File file : listFiles) {
					
					if (file.getName().equals("TestLeaf Logo.png")) {
						System.out.println("File is downloaded");
						break;
					} 
					
				}
	}

}
