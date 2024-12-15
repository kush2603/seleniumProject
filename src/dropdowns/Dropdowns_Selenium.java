package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement products = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
        Select s = new Select(products);//by index
        s.selectByIndex(2);//by index
        
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select s1 = new Select(animals);
        s1.selectByIndex(2);
        
        driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
        
        WebElement multi = driver.findElement(By.xpath("//select[@id='second']"));
        Select s2 = new Select(multi);
        s2.selectByVisibleText("Burger");//by visible text
        Thread.sleep(2000);
        s2.deselectByVisibleText("Burger");//deselect methods
        
     }

}
