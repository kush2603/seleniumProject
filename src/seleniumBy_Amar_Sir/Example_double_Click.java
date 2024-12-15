package seleniumBy_Amar_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_double_Click {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		
		
		

	}

}
