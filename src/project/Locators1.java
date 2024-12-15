package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//driver.findElement(By.name("email")).sendKeys("kushawaha.sandeep@gmail.com");
		//driver.findElement(By.id("continue")).click();
		//driver.findElement(By.name("password")).sendKeys("march@2603");
		//Thread.sleep(2000);
		//driver.findElement(By.id("signInSubmit")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("auth-fpp-link-bottom")).click();
		//Thread.sleep(3000);
	    //driver.findElement(By.id("glow-ingress-line2")).click();
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		
		
		

	}

}
