import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jquery.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement contribute = driver.findElement(By.xpath("//a[text()='Contribute']"));
		Actions a = new Actions(driver);
		a.moveToElement(contribute).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Style Guides')]")).click();
		WebElement support = driver.findElement(By.xpath("(//a[contains(text(),'Support')])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(support).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Stack Overflow')]")).click();

	}

}
