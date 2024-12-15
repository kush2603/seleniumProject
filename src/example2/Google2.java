package example2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Google2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Google2.captureScreenshot(driver,"googlesearchpage");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Pushpa" + Keys.ENTER);		
		
		Thread.sleep(2000);

		Google2.captureScreenshot(driver,"pushpasearch");
		
	}
	
	public static void captureScreenshot(WebDriver d,String filename) throws IOException         //d = driver =  new ChromeDriver();
	{
		TakesScreenshot ts = (TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("D:\\Captures\\"+ filename +".png");
		FileHandler.copy(src, des);
	}
}

	
