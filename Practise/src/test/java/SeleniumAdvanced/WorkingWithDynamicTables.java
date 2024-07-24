package SeleniumAdvanced;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithDynamicTables {

	@Test
	private void tableExample() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of columns " + columnCount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println("Number of rows "+ rowsCount);
		
	
	}
}
