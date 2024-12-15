package pomTestClass2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomClass2.Home_Page;
import pomClass2.Login_Page;

public class ActiTimeLoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Login_Page l = new Login_Page(driver);
		l.enterUserName();
		Thread.sleep(2000);
	    l.enterpassword();	
	    Thread.sleep(2000);
		l.clickOnLoginButton();
		Thread.sleep(3000);
		
		
		/*String url = driver.getCurrentUrl();
		System.out.println(url);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		*/
		Home_Page h = new Home_Page(driver);
		h.clickonCalender();
		Thread.sleep(3000);
		h.clickonArrow();
		Thread.sleep(3000);
		h.clickonSizer();
		Thread.sleep(3000);
		h.clickonSaveChangesBtn();
		Thread.sleep(3000);
		h.clickonDropDown();
		
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		//driver.quit();
		
		

	}

}
