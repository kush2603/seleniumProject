import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> li = driver.findElements(By.xpath("(//a[contains(@class,'MV3Tnb')])[1]"));
		
		System.out.println(li.size());
		for(int i = 1; i < li.size(); i++)
		{
			System.out.println(li.get(i).getText());
		}	
	}

}
