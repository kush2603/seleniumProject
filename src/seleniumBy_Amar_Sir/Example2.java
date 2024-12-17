package seleniumBy_Amar_Sir;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.findElement(By.xpath("//img[contains(@class,'banner-image')]")).click();
        Set<String> all_ids = driver.getWindowHandles();
        ArrayList<String> al = new ArrayList<String>(all_ids);
        
        driver.switchTo().window(al.get(1));  
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
        
	}

}
