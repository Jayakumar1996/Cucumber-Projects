package SeleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileExample {

	@Test
	public void fileUpload() throws InterruptedException, Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

//		WebElement uploadButton = driver.findElement(By.xpath("(//div[@class='card']//form)[1]")); 
		WebElement uploadButton = driver.findElement(By.xpath("//span[@id='j_idt88:j_idt89']"));
		uploadButton.click();

		Thread.sleep(3000);
		//Windows
		String file = "C:\\Users\\Jayakumar\\Downloads\\TestLeaf Logo.png";
		
		//To convert a String into a Plain text
		StringSelection selection = new StringSelection(file);	
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//To perform Keyboard Action
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("File uploaded successfully");
	}
}
