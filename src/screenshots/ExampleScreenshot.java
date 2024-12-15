package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.bouncycastle.jcajce.provider.symmetric.Serpent.TSerpentGMAC;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ExampleScreenshot {

	public static WebDriver driver;

	 public static void screenShot(WebDriver driver, String path) 
	 {
		TakesScreenshot ts = TakesScreenshot.getScreenshotAs(OutputType.FILE);
	  }
	 
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//a[contains(text(),'My eBay')])[1]")).click();
		//// take screenshot
		screenShot();
		driver.quit();
		driver.quit();

	}

}
