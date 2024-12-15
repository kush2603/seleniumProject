package visibilityText;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class VisibleText {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement emailV = driver.findElement(By.xpath("//input[@id='email']"));
		boolean b = emailV.isDisplayed();
		System.out.println(b);
		System.out.println(emailV.isEnabled());//enabled
		System.out.println(emailV.isSelected());//selected
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList l = new ArrayList(ids);
		System.out.println(l);
		
		File des = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\implicitwait.png");
		FileHandler.copy(des, src);
		driver.quit();

	}

}
