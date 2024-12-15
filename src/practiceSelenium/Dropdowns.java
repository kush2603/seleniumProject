package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText(""));
		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(products);
		s.selectByIndex(1);
		
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s1 = new Select(animals);
		s1.selectByValue("cat");
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
	}

}
