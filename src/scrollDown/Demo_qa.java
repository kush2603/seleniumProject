package scrollDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_qa {
	
	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//scroll down page to inspect element
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("scroll(1029,594)");
		System.out.println("Scroll Windows by 1029,594");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(@class,'avatar mx-auto white')])[4]")).click();
		Thread.sleep(2000);
		
		//scroll down page to inspect element
		js.executeScript("scroll(130, 666)");
		System.out.println("Scroll Windows by 130, 666");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Progress Bar')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'startStopButton')]")).click();
		Thread.sleep(2000);
		
		WebElement reset = driver.findElement(By.xpath("//button[contains(@id,'resetButton')]"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(reset));
		reset.click();
        

   
		
		
	}

}
