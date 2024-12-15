package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Select
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'dropdown')]"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Option 2");
		s.selectByVisibleText("Option 1");

		//driver.quit();
		

	}

}
