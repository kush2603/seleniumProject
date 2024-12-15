package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=423567207599087599&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301638&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("kushawaha.sandeep@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("march2603");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        Thread.sleep(2000); 
       // WebElement point =  driver.findElement(By.xpath(""))
        

	}

}
