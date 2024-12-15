package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.myntra.com/");
		driver.navigate().forward();
		driver.get("https://accounts.google.com/");
		Thread.sleep(6000);
		driver.quit();		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
