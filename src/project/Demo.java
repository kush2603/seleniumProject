package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		driver.navigate().back();
	    Thread.sleep(4000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.quit();
		



	}

}
