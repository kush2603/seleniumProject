package assignments;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUps {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
		services.click();

		Set<String> st = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(st);
		driver.switchTo().window(al.get(1));
		//System.out.println(driver.getTitle());
		WebElement resumeWriting = driver.findElement(By.xpath("//span[text()='RESUME WRITING']"));
		Actions a = new Actions(driver);
		a.moveToElement(resumeWriting).build().perform();
		
		WebElement resumeMaker = driver.findElement(By.xpath("//span[text()='Resume Maker']"));
		//a.moveToElement(resumeMaker).build().perform();
		resumeMaker.click();
		System.out.println(driver.getTitle());
		driver.close();
		
		 
		
	}

}
