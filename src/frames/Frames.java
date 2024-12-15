package frames;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'a')]")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("automation tester");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.xpath("//select[contains(@class,'col-lg-3')]"));
		Thread.sleep(2000);
		Select s = new Select(animal);
		Thread.sleep(2000);
		s.selectByVisibleText("Big Baby Cat");
		String url = driver.getTitle();
		System.out.println(url);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\newScreenshot.png");
		FileHandler.copy(src, des);
		driver.close();
	}

}
