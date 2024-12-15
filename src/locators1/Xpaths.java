package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name , 'q')]")).sendKeys("selenium driver download");//realtive x-path //tagname[contains(@name,'q')]
		//driver.findElement(By.xpath("//a[contains(text( ),'Gmail')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@alt,'Camera search')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() = 'Images']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@alt,'Camera')]")).click();

	}

}
