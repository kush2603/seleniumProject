package synchronization_waits;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\SeleniumJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement e = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		//WebDriverWait t = new WebDriverWait(driver,15);
		//t.until(ExpectedConditions.visibilityOf(e));
		e.click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		WebDriverWait w = new WebDriverWait (driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("INDIA");
		driver.quit();

	}

}
