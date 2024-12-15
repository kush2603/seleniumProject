package dimensions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Dimensions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\SeleniumJava\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Dimension d = new Dimension(200, 200);
		driver.manage().window().setSize(d);
		Point p = new Point(500, 700);
		driver.manage().window().setPosition(p);
		
	}

}
