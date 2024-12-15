package practiceFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input")).sendKeys("automation tester");
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select s = new Select(animals);
        s.selectByIndex(2);
        driver.quit();

	}

}
