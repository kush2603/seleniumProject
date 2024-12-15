package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click me, to Open an alert after 5 seconds']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Change Text to Selenium Webdriver']")).click();
		//WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//w1.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		
		//enable button after 10 seconds
		driver.findElement(By.xpath("//button[text()='Enable button after 10 seconds']")).click();
		WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
		System.out.println(button.getText());
		
		//enable checkbox after 10 seconds
		driver.findElement(By.xpath("//button[text()='Check Checkbox after 10 seconds']")).click();
		
		

	}

}
