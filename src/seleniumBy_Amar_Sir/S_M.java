package seleniumBy_Amar_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_M {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*
		 * String currentURL = driver.getCurrentUrl(); System.out.println(currentURL);
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.xpath("//input[@class='a-input-text']")).sendKeys("sandeep kushawaha");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
