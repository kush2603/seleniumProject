package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorGmailPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("For work")).click();//by linktext
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.className("laptop-desktop-only")).click();//by className
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("NewTester");
		driver.findElement(By.id("lastName")).sendKeys("kushawaha");
		driver.findElement(By.id("username")).sendKeys("kushawaha_1995");
		//driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}

}
