package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//simple alert popup
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
	   
		//confirmation alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    Alert a1 = driver.switchTo().alert();
	    System.out.println(a1.getText());
	    a1.accept();
	    
	    Thread.sleep(2000);
	    //prompt alert
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	    Thread.sleep(2000);
	    Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.sendKeys("Automation tester");
		alt2.accept();
	    driver.quit();

	}

}
