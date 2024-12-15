package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2_Ebay {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Mobile Phone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'gh-btn')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Advanced')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='register']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@_sp= 'p2481888.m1387.l3250'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[text()='Sell'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
	}

}
