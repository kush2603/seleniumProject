

import static org.testng.Assert.assertEquals;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

//import dev.failsafe.internal.util.Assert;

public class Example2 {

	public static WebDriver driver;
	
	@Test(priority = 1)
	public void myApplicationTitle()
	{
		String expected_title = "Swag Labs";
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		
		String actual_title = driver.getTitle();
		System.out.println("the title of the webpage is:-" + actual_title);
        assertEquals(expected_title, actual_title);	
	}
	@Test(priority = 2)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
}
