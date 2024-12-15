import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[contains(@class,'nI-gNb-menuItems__anchorDropdown')])[3]")).click();
		Set<String> all_ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(all_ids);
		driver.switchTo().window(al.get(1));
		driver.switchTo().window(al.get(0));
		
		driver.close();
		driver.quit();
	}

}
