package t0_knownumber_of_tag;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep Kushawaha\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//to know the number of tags
		
		List <WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		
		for (int i = 0; i < ele.size(); i++)
		{
			System.out.println(ele.get(i).getText());
		}
		
		List<WebElement> ele1 = driver.findElements(By.tagName("input"));
		System.out.println(ele1.size());
		
		for(int t = 0; t < ele1.size(); t++)
		{
			System.out.println(ele1.get(t).getText());
		}
		
		HashMap<Integer ,String> hm = new HashMap<Integer,String>();
		hm.put(101, "Dhoni");
		hm.put(102, "Sehwag");
		hm.put(103, "anil");
		hm.put(104, "kohli");
		
		System.out.println(hm.size());
		driver.quit();
	}

}
