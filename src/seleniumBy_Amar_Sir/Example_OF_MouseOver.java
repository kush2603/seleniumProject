package seleniumBy_Amar_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_OF_MouseOver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a = new Actions(driver);
		a.moveToElement(electronics).build().perform();
		
		WebElement gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		a.moveToElement(gaming).build().perform();
		
		WebElement gaming_mouse = driver.findElement(By.xpath("//a[text()='Gaming Mouse']"));
		a.moveToElement(gaming_mouse);
		gaming_mouse.click();
		
		driver.close();

	}

}
