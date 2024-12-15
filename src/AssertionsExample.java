import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	String title = driver.getTitle();
//	System.out.println(title);
//	Assert.assertEquals(title, "Google","title does not match");
//	//if the assertion fails this line wont execute
//	
//	System.out.println("Test passed:The line matches");
	
	String ele = "//a[contains(text(),'Store')]";
	Assert.assertEquals(ele,"Store","title does not match");
	System.out.println("test passed:The line matches");
	
	driver.quit();
		
	}
	

}
