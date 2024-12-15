package childBrowserpopup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	///////////////////////////////////////////////////////////////////////////////////////////////	
		
		driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
		Set<String> all_ids = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<String>(all_ids);
        driver.switchTo().window(a.get(1));
        driver.findElement(By.xpath("//a[@class='gnbItemLink rw']")).click();
        driver.quit();
		/*
		 * // WebDriverWait w = new WebDriverWait(driver,); //
		 * driver.switchTo().window("D0D8054274944BEE1ADCF2A49EFB65CA");
		 * //driver.findElement(By.xpath(
		 * "//img[@src='https://static.naukimg.com/s/7/123/i/resumeDisplay.c7a649c3.png']"
		 * )).click();
		 */        
		
	}

}
