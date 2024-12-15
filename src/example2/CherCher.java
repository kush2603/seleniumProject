package example2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CherCher {

	public static void main(String[] args) throws IOException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		
		driver.manage().window().maximize();
		
		//capture ss
		
		CommonSteps.captureScreenshot(driver, "abc1");
		
		CommonSteps.switchToIframeByIndex(driver, 0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("I am on this main frame");
		
		CommonSteps.captureScreenshot(driver, "abc2");
		
		CommonSteps.switchToParentPage(driver);
		
		CommonSteps.switchToIframeByIdORName(driver, "frame2");
		
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		
		CommonSteps.selectOptionFromDropdown(animal, "Avatar");
		
		CommonSteps.captureScreenshot(driver, "abc3");
		
		
	}
	
	
	
}
