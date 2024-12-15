package t0_knownumber_of_tag;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		/*
		 * List<WebElement> li = driver.findElements(By.tagName("td"));
		 * 
		 * System.out.println(li.size());
		 * 
		 * for(int i = 0; i < li.size(); i++) { System.out.println(li.get(i).getText());
		 * }
		 */

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for (WebElement column : columns) {
				System.out.println(column.getText());
			}
		}
		driver.close();

	}

}
