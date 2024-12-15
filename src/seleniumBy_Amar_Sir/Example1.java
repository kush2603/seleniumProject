package seleniumBy_Amar_Sir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
       /* String source = driver.getPageSource();
        System.out.println(source); */
        driver.manage().window().setSize(null);
        //driver.close();
	}

}
