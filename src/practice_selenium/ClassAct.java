package practice_selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ClassAct {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\SeleniumJava\\chrome-win64\\chrome-win64\\chrome.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jquery.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
    WebElement ele = driver.findElement(By.xpath("//a[text()='Contribute']"));
    Actions a = new Actions(driver);
    a.moveToElement(ele).perform();
    driver.findElement(By.xpath("//a[text()='Bug Triage']")).click();
    
    //context click
    WebElement ele2 = driver.findElement(By.xpath("//a[text()='Contribute to jQuery']"));
    Actions a2 = new Actions(driver);
    a2.contextClick(ele2).perform();
    
    
    
    //TakeScreenshot
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\screenshot2.png");
    FileHandler.copy(src, des);
   
	}

}
