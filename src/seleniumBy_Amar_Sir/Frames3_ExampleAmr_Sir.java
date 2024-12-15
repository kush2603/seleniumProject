package seleniumBy_Amar_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames3_ExampleAmr_Sir {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement felement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(felement);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation Tester" + Keys.ENTER);
		WebElement felement1 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
	    driver.switchTo().frame(felement1);
	    driver.findElement(By.xpath("//input[@id='a']")).click();
	   
	    //now switch the control from child frame to main page
	    driver.switchTo().defaultContent();
	    WebElement felement3 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	    driver.switchTo().frame(felement3);
	    WebElement w = driver.findElement(By.xpath("//select[@id='animals']"));
	    Select s = new Select(w);
	    s.selectByValue("babycat");
	    driver.close();

	}

}
