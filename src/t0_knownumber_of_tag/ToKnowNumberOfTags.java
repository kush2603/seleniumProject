package t0_knownumber_of_tag;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToKnowNumberOfTags {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  
		  System.out.println(links.size());
		  
		  for(int i = 0; i < links.size(); i++) { System.out.println(links.get(i).getText());
		  }
		 
		
	      // Iterate through each link and check its status
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");

	            if (url != null && !url.isEmpty()) {
	                try {
	                    // Open a connection to the URL
	                    HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
	                    http.setRequestMethod("HEAD");  // Use "HEAD" for a faster check
	                    http.connect();

	                    // Get the response code
	                    int responseCode = http.getResponseCode();

	                    // Check if the link is broken (response code is not 200)
	                    if (responseCode != 200) {
	                        System.out.println("Broken Link: " + url + " -> Response Code: " + responseCode);
	                    } else {
	                        System.out.println("Valid Link: " + url);
	                    }
	                    
	                } catch (IOException e) {
	                    System.out.println("Error checking link: " + url + " -> Exception: " + e.getMessage());
	                }
	            } else {
	                System.out.println("Invalid or empty link: " + link.getText());
	            }
	        }

	        // Close the browser
	        driver.quit();
	    
	
		   
		   
		  
			/*
			 * // List<WebElement> ele = driver.findElements(By.tagName("input")); //
			 * System.out.println(ele.size()); // // for(int i = 0; i < ele.size(); i++) //
			 * { // System.out.println(ele.get(i).getText()); // }
			 * 
			 * // List<WebElement> li = driver.findElements(By.tagName("span")); //
			 * System.out.println(li.size()); // // for(int i =0; i<li.size();i++) // { //
			 * System.out.println(li.get(i).getText()); // }
			 */		 

		driver.close();
	}

}
