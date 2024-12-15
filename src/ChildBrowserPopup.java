import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		Set<String> all_ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList(all_ids);
		String parent_window = al.get(0);
		String child_window = al.get(1);
		driver.switchTo().window(child_window);
		driver.findElement(By.xpath("(//span[@class='gnbLabel'])[1]")).click();
		driver.switchTo().window(parent_window);
		driver.quit();


		

	}

}
