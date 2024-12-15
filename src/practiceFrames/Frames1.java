package practiceFrames;

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

public class Frames1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).sendKeys("automation tester");
		
		//now switchto default content
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement w = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s = new Select(w);
		s.selectByIndex(2);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage.\\chercher2.png");
		FileHandler.copy(src, des);
		driver.quit();
	}

}
