package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement scroll = driver.findElement(By.xpath("(//a[text()='Read More'])[30]"));
		
		//To know the exact location of webelement till where we want to scroll down
	
		Point loc = scroll.getLocation();
		System.out.println(loc);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(696,5846)");
		
		
		
		
		

	}

}
