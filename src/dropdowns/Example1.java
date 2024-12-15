package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//choose xpath's
		WebElement dropdownElement = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]"));
		Select dropdown = new Select(dropdownElement);
		if(dropdown.isMultiple())
		{
			//get all available options forom dropdown
			for(WebElement option : dropdown.getOptions())
			{
				dropdown.selectByVisibleText(option.getText());
			}
		}
		
		else
		{
			System.out.println("the dropdown does not support multiple selections");
		}
		
		driver.quit();	
	}

}
