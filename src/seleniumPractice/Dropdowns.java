package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);
		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(products);
		s.selectByIndex(3);
		WebElement animals = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		Select s1 = new Select(animals);
		s1.selectByVisibleText("Baby Cat");
		WebElement multipleValues = driver.findElement(By.xpath("//select[@id='second']"));
		Select s2 = new Select(multipleValues);
		s2.selectByVisibleText("Burger");
		Thread.sleep(2000);
		s2.deselectByVisibleText("Burger");
		//screenshot//
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\Screenproof.png");
		FileHandler.copy(src, des);
		
	}

}
