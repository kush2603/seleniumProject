package seleniumBy_Amar_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement name = driver.findElement(By.name("firstname"));
	    name.sendKeys("Sandeep");
	    Thread.sleep(2000);
	    WebElement surname = driver.findElement(By.name("lastname"));
	    surname.sendKeys("Kushawaha");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9140336215");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("march2603");
	    Thread.sleep(2000);
	    WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	    Select s = new Select(date);
	    s.selectByVisibleText("31");
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select s1 = new Select(month);
	    s1.selectByIndex(2);
	    WebElement year = driver.findElement(By.id("year"));
	    Select s3 = new Select(year);
	    s3.selectByValue("1995");
	    WebElement sex = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	    sex.click();
	    driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
	    driver.quit();
	        
	}

}
