package scrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_In_selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\SeleniumJava\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
		Point loc = scroll.getLocation();
		System.out.println(loc);
		
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	    Thread.sleep(3000);
	    js.executeScript("Scroll(571,1938)");
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    driver.quit();

	}

}
