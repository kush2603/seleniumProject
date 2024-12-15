package seleniumBy_Amar_Sir;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_ByAmarSir {

	public static void main(String[] args) throws InterruptedException   {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@id='nseindex']")).click();
		Thread.sleep(2000);
		//to switch selenium control to child window
		Set<String> s = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(s);
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='srchword']")).sendKeys("nse indices");
		driver.findElement(By.xpath("//input[@class='msprite btn_srch']")).click();
		driver.close();
		
	}
}
