package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\SeleniumJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		//WebDriverWait w = new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.visibilityOf(ele1));
		ele1.click();
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@type='email']"));
		//WebDriverWait w1  = new WebDriverWait(driver,10);
		//w1.until(ExpectedConditions.visibilityOf(ele2));
		ele2.sendKeys("INDIA");
		
		driver.quit();
		
		

	}

}
