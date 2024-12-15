package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Point p = new Point(200,400);
		//driver.manage().window().setPosition(p);
		//Dimension d = new Dimension(800,300);
		//driver.manage().window().setSize(d);
		
        WebElement w = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
        Select s = new Select(w);
        s.selectByVisibleText("Google");
		
		
		

	}

}
