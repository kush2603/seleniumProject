package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\SeleniumJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.MICROSECONDS);
		
		WebElement l = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions a = new Actions(driver);
		a.moveToElement(l).perform();
		driver.findElement(By.xpath("//a[@id=\'nav_prefetch_yourorders\']")).click();
		
		
		

	}

}
