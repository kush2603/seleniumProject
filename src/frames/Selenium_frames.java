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

public class Selenium_frames {
	
	public static void main(String [] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		//now swtich to frame
		driver.switchTo().frame("frame1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='a']")).click();

		//now switch to default content
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		Thread.sleep(2000);
		Select s = new Select(animal);
		s.selectByVisibleText("Big Baby Cat");
		
		//TAKE SCREENSHOT AS PROOF
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\chercher.png");
		FileHandler.copy(src, des);
		
		//Get URl of current page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Take Title of Page
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
