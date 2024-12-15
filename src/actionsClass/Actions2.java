package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//firstly swtich our control from mainpage to frame
		driver.switchTo().frame(0);
		WebElement d1 = driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement d2 = driver.findElement(By.xpath("//div[contains(@id,'droppable')]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(d1, d2).perform();
		driver.switchTo().defaultContent();
		WebElement doubleclick = driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]"));
		Actions a2 = new Actions(driver);
		a2.doubleClick(doubleclick).perform();
		
	}

}
