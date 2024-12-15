package important_Concepts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	
		driver.switchTo().frame(0);
		
		//try catch
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateField.sendKeys("26/03/1995");
		driver.switchTo().parentFrame();
	
		//try catch
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		
		//try catch
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(456,789)");
		
		
		//driver.close();
	}

}
