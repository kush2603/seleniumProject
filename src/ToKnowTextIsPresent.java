import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToKnowTextIsPresent {

	public static void main(String[] args) {
		
		
		int flag = 0;
		for(int i = 2; i <= 30; i++)
		{
			for(int j = 2; j < i ; j++)
			{
				if(i % j == 0)
				{
					flag = 1;
				}
			}
			if(flag == 0)
			{
				System.out.println(i + "is a prime number");
			}
			else
			{
				flag = 0;
			}
		}
		
		
		
		
		
		/*
		 * int number = 1; 
		 * for(int i = 1; i <= 4; i++) 
		 * { 
		 * for(int j = 1; j <= i; j++) 
		 * {
		 *   if(number <= 10) 
		 *   { System.out.print(number + " "); number++; 
		 *   }
		 *   }
		 * System.out.println(); }
		 */
		
		/*
		 * for(int i =1; i <= 5; i++) { for(int j = 1; j < i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		/*
		 * WebDriver driver = new ChromeDriver(); //
		 * driver.get("https://artoftesting.com/samplesiteforselenium");
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 */
		 
		
		/*
		 * WebElement username =
		 * driver.findElement(By.xpath("(//input[@class='form_input'])[1]"));
		 * System.out.println(username.isDisplayed());
		 */
		/*
		 * WebElement check =
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 * System.out.println(check.isDisplayed());
		 */
	  
		
		/*
		 * String str1 = "automation tester"; String str2 = "Automation tester";
		 * System.out.println(str1.equals(str2)); System.out.println(str1.charAt(0));
		 * String add = str1.concat(str2); System.out.println(add); String replace =
		 * str1.replaceAll("Automation", "manual"); if(str1.equals(replace)) {
		 * System.out.println("done"); } else { System.out.println("no"); }
		 */
		
		/*
		 * WebElement select = driver.findElement(By.xpath("//input[@id='male']"));
		 * select.click(); System.out.println(select.isSelected());
		 */
	   
		/*
		 * WebElement dropDown =
		 * driver.findElement(By.xpath("//select[@id='testingDropdown']")); Select s =
		 * new Select(dropDown); List<WebElement> options = s.getAllSelectedOptions();
		 * System.out.println(options);
		 */
		  
		  
		  
		  
	
	}
	
	    
	
	
	
}


