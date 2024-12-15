package practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//this line of code is only executed with chromeBrowser
		driver.navigate().to("https://www.naukri.com/mnjuser/settings/communication");
		driver.manage().window().maximize();
		driver.quit();
		

	}

}
