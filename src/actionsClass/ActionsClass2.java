package actionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
	    Thread.sleep(2000);
	    
	    driver.switchTo().defaultContent();
	    WebElement w = driver.findElement(By.xpath("(//a[@title='jQuery UI'])[2]"));
	    Actions a2 = new Actions(driver);
	    a2.doubleClick(w).perform();
		
	    
	    
	    

	}

}
