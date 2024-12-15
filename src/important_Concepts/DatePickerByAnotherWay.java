package important_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerByAnotherWay {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='16']")).click();
		Thread.sleep(10);
		//driver.quit();
		
		
	}

}
