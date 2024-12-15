package childBrowserpopup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\SeleniumJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		Set<String> ids = driver.getWindowHandles();//as per sets defi. order of insertion is random
		ArrayList a = new ArrayList(ids);
		System.out.println(a.get(0));
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("Selenium Jobs");
	    driver.switchTo().window((String) a.get(1));//to switch the control to child browser
	    System.out.println(a.get(1));
	    Thread.sleep(2000);
	    String title = driver.getTitle();
	    System.out.println(title);
	    Thread.sleep(2000);
	    driver.close();
	    Thread.sleep(3000);
	    driver.quit();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	    
	    
	   
	    
	
		
		

	}

}
