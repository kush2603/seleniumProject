package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //simple alert popup
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        //to view this element we have to use Explicit wait
        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(6000));
        w.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        
        //confirmation alert popup
        WebElement confirmation = driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
        confirmation.click();
        driver.switchTo().alert().accept();
        driver.close();
        
        //prompt alert popup
        driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Automation Tester");
        driver.switchTo().alert().accept();
        
        
        
        
        
        
        
        
     
	

	}

}
