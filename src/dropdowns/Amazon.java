package dropdowns;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement categories = driver.findElement(By.name("url"));
		Select s = new Select(categories);
		//s.selectByValue("search-alias=appliances");
		//s.selectByIndex(3);
		s.selectByVisibleText("Baby");
		String title = driver.getTitle();
		System.out.println(title);
//		driver.findElement(By.partialLinkText(""));
		
		 List<WebElement> all = s.getOptions();
		for(WebElement xyz : all)
		{
			String option = xyz.getText();
			System.out.println(option);
		}
		
		driver.close();
		
		

	}

}
