package childBrowserPopup_BY_AmarSir;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//switchWindow
		Set<String> all_ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(all_ids);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		

	}

}
