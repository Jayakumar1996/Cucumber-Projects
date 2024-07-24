package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	protected WebDriverWait wait;

	public static void browserLaunch(String browserName) {
		
		
		if (browserName.toLowerCase().equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.toLowerCase().equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.toLowerCase().equals("edge")) {
			driver = new EdgeDriver();

		} else if (browserName.toLowerCase().equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("The selected Browser is not Exist in the Local system");
		}
	}
	
 
	public static void multiPlatform(String browserName,String platform) {
	

	        switch (platform.toLowerCase()) {
	            case "windows":
	                // Set up WebDriver for Windows
	            	if (browserName.toLowerCase().equals("chrome")) {
	        			driver = new ChromeDriver();

	        		} else if (browserName.toLowerCase().equals("firefox")) {
	        			driver = new FirefoxDriver();

	        		} else if (browserName.toLowerCase().equals("edge")) {
	        			driver = new EdgeDriver();

	        		} else if (browserName.toLowerCase().equals("safari")) {
	        			driver = new SafariDriver();
	        		}
	        		else {
	        			System.out.println("The selected Browser is not Exist in the Local system");
	        		}
	                break;
	            case "mac":
	                // Set up WebDriver for macOS
	            	if (browserName.toLowerCase().equals("chrome")) {
	        			driver = new ChromeDriver();

	        		} else if (browserName.toLowerCase().equals("firefox")) {
	        			driver = new FirefoxDriver();

	        		} else if (browserName.toLowerCase().equals("edge")) {
	        			driver = new EdgeDriver();

	        		} else if (browserName.toLowerCase().equals("safari")) {
	        			driver = new SafariDriver();
	        		}
	        		else {
	        			System.out.println("The selected Browser is not Exist in the Local system");
	        		}
	                break;
	            case "linux":
	                // Set up WebDriver for Linux
	            	if (browserName.toLowerCase().equals("chrome")) {
	        			driver = new ChromeDriver();

	        		} else if (browserName.toLowerCase().equals("firefox")) {
	        			driver = new FirefoxDriver();

	        		} else if (browserName.toLowerCase().equals("edge")) {
	        			driver = new EdgeDriver();

	        		} else if (browserName.toLowerCase().equals("safari")) {
	        			driver = new SafariDriver();
	        		}
	        		else {
	        			System.out.println("The selected Browser is not Exist in the Local system");
	        		}
	                break;
	            default:
	                System.out.println("Invalid platform name");
	        }
	    }

		

	public static void urlLaunch(String url) {
		driver.get(url);

	}

	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void sendKeys(WebElement e, String data) {
		e.sendKeys(data);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void quit() {
		   if (driver != null) {
	            driver.quit();
	        }
	}

	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}

	public void sleep(long milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public void click(By locator) throws InterruptedException {
		WebElement element = findElement(locator);
		element.click();
		sleep(2000);
	}

	private WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

//	public void captureScreenshot(String fileName) {
//		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		Path destPath = Paths.get("screenshots", fileName + ".png");
//
//		try {
//			Files.createDirectories(destPath.getParent());
//			Files.move(srcFile.toPath(), destPath);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
