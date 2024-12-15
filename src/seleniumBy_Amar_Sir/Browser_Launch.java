package seleniumBy_Amar_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.internal.util.Assert;

public class Browser_Launch {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("automationtester@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		String expected_result = driver.getTitle();
		System.out.println(expected_result);
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
//		Assert.assertEquals(actual_result,expected_result);
		driver.close();
	}
}
