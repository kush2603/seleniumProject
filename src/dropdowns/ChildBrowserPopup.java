package dropdowns;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList a = new ArrayList(ids);
		System.out.println(a.get(0));
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("Selenium Jobs");
		
		Thread.sleep(2000);
		driver.switchTo().window((String) a.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

	}

}
