package seleniumBy_Amar_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2_ByAmarSir {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement felemnt = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		Thread.sleep(2000);
		driver.switchTo().frame(felemnt);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='getquoteinput']")).sendKeys("wipro" + Keys.ENTER);
		

	}

}
