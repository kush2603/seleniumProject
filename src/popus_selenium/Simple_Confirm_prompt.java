package popus_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Simple_Confirm_prompt {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		//Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		//Alert a = driver.switchTo().alert();
		//System.out.println(a.getText());
		//a.dismiss();
		
		//confirmation alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(2000);
		//click on cancel button
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(3000);
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.dismiss();
		
		//prompt alert
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert l = driver.switchTo().alert();
		System.out.println(l.getText());
		l.sendKeys("Automation Tester");
		Thread.sleep(4000);
		l.accept();
		Thread.sleep(5000);
		
		//take screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\popup.png");
		FileHandler.copy(src, des);
		
		driver.quit();

	}

}
