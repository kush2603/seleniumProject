package framesinSelenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("Automation Tester");
		
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
	    WebElement animal =	driver.findElement(By.xpath("//select[@id='animals']"));
	
		Select s = new Select(animal);
		s.selectByVisibleText("Baby Cat");
		
		File des = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\xyz.png");
		FileHandler.copy(des, src);
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList a = new ArrayList(ids);
		System.out.println(a.get(0));
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		
		
		
		
	}

	

}
