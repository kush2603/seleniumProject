package important_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		for(WebElement rows:row)
		{
		     List<WebElement> column = rows.findElements(By.xpath("td"));
		     for(WebElement columns :column) {
		    	 System.out.print(" " + columns.getText());
		     }
		}
	}

}
