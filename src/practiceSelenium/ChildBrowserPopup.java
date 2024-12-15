package practiceSelenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
		services.click();
		Set<String> st = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(st);
		driver.switchTo().window(al.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement resumeMaker = driver.findElement(By.xpath("//span[text()='RESUME WRITING']"));
		resumeMaker.click();
		driver.close();
		//to switch to parent window
		driver.switchTo().window(al.get(0));
		String title2 = driver.getTitle();
		System.out.println(title2);

	}

}
