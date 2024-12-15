package pomTestClass;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.ActiTimeHomePage;
import pomClass.ActiTimeHomePage2;
import pomClass.ActiTimeLoginPage;

public class ActiTimeLoginPageTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ActiTimeLoginPage l = new ActiTimeLoginPage(driver);
		l.enterActiTimeLoginPageUsername();
		Thread.sleep(2000);
		l.enterActiTimeLoginPagePassword();
		Thread.sleep(2000);
		l.loginButton();
	
		//HomPage1
		ActiTimeHomePage h = new ActiTimeHomePage(driver);
		h.clickonReports();
		Thread.sleep(3000);
		h.clickonCreateReport();
		Thread.sleep(3000);
	    
		//homePage2
		ActiTimeHomePage2 h2 = new ActiTimeHomePage2(driver);
		h2.actiTimeBoxClose();
		h2.checkActiLogo();
		driver.navigate().back();
		Thread.sleep(2000);
		h2.clickonUsers();
		Thread.sleep(2000);
		h2.actiPagelogout();
		
		
		
		//String title = driver.getTitle();
		//System.out.println(title);
		driver.quit();

	}

}
