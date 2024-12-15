package actionsClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		WebElement w = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement l = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	    Actions a = new Actions(driver);
	    a.dragAndDrop(w, l).perform();
	    Thread.sleep(2000);
	    
	    driver.switchTo().defaultContent();
	    WebElement wl = driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]"));
	    Actions a1 = new Actions(driver);
	    a1.doubleClick(wl).perform();
	    Thread.sleep(4000);
        driver.navigate().back();
        
        WebElement mte = driver.findElement(By.xpath("//a[text()='Contribute']"));
        Actions a2 = new Actions(driver);
        a2.moveToElement(mte).perform();
        
        driver.findElement(By.xpath("//a[text()='Bug Triage']")).click();
        Thread.sleep(2000);
        WebElement mte3 = driver.findElement(By.xpath("//a[text()='Contribute']"));
        Actions a3 = new Actions(driver);
        a3.moveToElement(mte3).perform();
        driver.findElement(By.xpath("(//a[text()='Style Guides'])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'jQuery UI')]")).click();
        
        //right click
        WebElement rightClick = driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]"));
        Actions act = new Actions(driver);
        act.contextClick(rightClick).perform();
       
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\screenshotPackage\\Moveto1.png");
        FileHandler.copy(src, des);
        Thread.sleep(2000); 
        
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Set<String> ids = driver.getWindowHandles();
        ArrayList a5 = new ArrayList(ids);
        System.out.println(a5.get(0));
        
        driver.quit();
        
        
     }

}
