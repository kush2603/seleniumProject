package explicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[contains(@class,'nav-line-2')])[3]")).click();
        WebElement ele = driver.findElement(By.xpath("//input[contains(@id,'ap_email')]"));
        //WebDriverWait w = new WebDriverWait(driver, 15);
        //w.until(ExpectedConditions.visibilityOf(ele));
        ele.sendKeys("automation tester");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();
        
        

	}

}
