package seleniumBy_Amar_Sir;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Child {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		Thread.sleep(2000);
		Set<String> st = driver.getWindowHandles();
        ArrayList<String> al = new ArrayList<>(st);
        driver.switchTo().window(al.get(1));
        //String title = driver.getTitle();
        //System.out.println(title);
        WebElement resume = driver.findElement(By.xpath("//span[text()='RESUME WRITING']"));
        Actions a = new Actions(driver);
        a.moveToElement(resume).build().perform();
        driver.close();
        //driver.findElement(By.xpath("(//div[@class='mainHead'])[6]")).click();
       // Thread.sleep(2000);
        driver.switchTo().window(al.get(0));
        String title = driver.getTitle();
        System.out.println(title);
        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();
        Thread.sleep(2000);
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
       // w.until(ExpectedConditions.elementToBeClickable(w));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement signInWithGoogle = driver.findElement(By.xpath("//span[text()='Sign in with Google']"));
        signInWithGoogle.click();
        driver.findElement(By.xpath("//div[text()='kushawahasandeep26@gmail.com']")).click();
        
	}
}
