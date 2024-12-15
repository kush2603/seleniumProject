package explicitWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebDriverWait w = new WebDriverWait(driver , Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='CLICK ME!']"))).click();
		

	}

}
