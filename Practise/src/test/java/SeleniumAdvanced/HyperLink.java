package SeleniumAdvanced;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperLink {

	@Test
	private void playWithHyperLinks() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

//		1.Clicking a hyperlink and comes back
		WebElement dashboardLink = driver.findElement(By.linkText("Go to Dashboard"));
		dashboardLink.click();
		System.out.println("Take me to dashboard is performed");

		// To press back button
		driver.navigate().back();

//	2.Find the URL without clicking the link.
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL"));
		String attribute = whereToGo.getAttribute("href");
		System.out.println("This link is going to" + attribute);

//	3.Am I broken link?
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Link is broken");
		}

		// To press back button
		driver.navigate().back();

//		4.Count Links
		WebElement dashboardLink1 = driver.findElement(By.linkText("Go to Dashboard"));
		dashboardLink1.click();
		driver.navigate().back();

		List<WebElement> totalLInks = driver.findElements(By.tagName("a"));
		int linkCount = totalLInks.size();
		System.out.println("Total Links " + linkCount);

	}
}