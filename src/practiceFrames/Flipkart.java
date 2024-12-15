package practiceFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath(""));]
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='gb_F']")).click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
    	driver.quit();
	}

}
