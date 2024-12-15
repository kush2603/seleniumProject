package practise_selenium2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {
	
	public static void main(String[]args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//close the initial login popup
		try {
		driver.findElement(By.xpath("//span[contains(text(),'✕')]")).click();
		}
		catch(Exception e)
		{
			System.out.println("login popup did not appear");
		}
		
		//Validate login page with invalid login credentials
		
		//click on login button
		driver.findElement(By.xpath("(//a[@class='_1TOQfO'])[1]")).click();
		
		//enter incorrect mobile number
		WebElement enterMobileNumber = driver.findElement(By.xpath("//input[contains(@class,'r4vIwl BV+Dqf')]"));
		enterMobileNumber.sendKeys("123456789");
		
		//click on request OTP button
		driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]")).click();
		
		//enter valid credentials message
		WebElement error_message = driver.findElement(By.xpath("//span[contains(text(),'Please enter valid Email ID/Mobile number')]"));
		System.out.println(error_message.getText());
		
		
//		Now, verify login page with valid credentials
		Thread.sleep(2000);
		enterMobileNumber.clear();
		driver.navigate().refresh();
		WebElement entereValidEmail = driver.findElement(By.xpath("//input[contains(@class,'r4vIwl BV+Dqf')]"));
		entereValidEmail.sendKeys("kushawaha.sandeep@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]")).click();
		
		List <WebElement> otpValues = driver.findElements(By.xpath("//input[contains(@class,'r4vIwl IX3CMV')]"));
		String value = "364388";
		int i=0;
		
		for(WebElement e :otpValues) {
			e.sendKeys(String.valueOf(value.charAt(i)));
	        i++;	
		}
		
		//taking screenshot because here page is requesting for OTP which we cannot handle by using selenium;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\practise_selenium2\\flipkartss.png");
		FileHandler.copy(src, des);
//		Thread.sleep(2000);
		
		//navigate to homepage
		driver.findElement(By.xpath("//img[contains(@class,'W5mR4e')]")).click();
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[3]"));
		Actions a = new Actions(driver);
		a.moveToElement(fashion).perform();
		WebElement t_shirt = driver.findElement(By.xpath("(//a[contains(@class,'_3490ry')])[2]"));
		t_shirt.click();
		
		//choose t_shirt
		WebElement t_shirt1 = driver.findElement(By.xpath("(//img[contains(@class,'_53J4C')])[1]"));
		t_shirt1.click();
		
		Set<String> all_ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(all_ids);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'XL')])[1]")).click();
		WebElement add_to_Cart = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
		add_to_Cart.click();
		Thread.sleep(2000);
		driver.close();
		//return to parent window
		driver.switchTo().window(al.get(0));
//		Thread.sleep(1000);
		
//		navigate back to homepage
		driver.navigate().back();
		try {
			driver.findElement(By.xpath("//span[contains(text(),'✕')]")).click();
			}
			catch(Exception e)
			{
				System.out.println("login popup did not appear");
			}
		WebElement f = driver.findElement(By.xpath("(//div[contains(@class,'YBLJE4')])[3]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(f).perform();
		
		WebElement clickOnT_shirt = driver.findElement(By.xpath("(//a[contains(@class,'_3490ry')])[2]"));
		clickOnT_shirt.click();
//		driver.switchTo().window(al.get(1));
		WebElement another_tShirt = driver.findElement(By.xpath("(//div[contains(@class,'gqcSqV YGE0gZ')])[5]"));
		another_tShirt.click();
		
		Set<String> ids =driver.getWindowHandles();
		ArrayList<String> arrayList = new ArrayList<>(ids);
		driver.switchTo().window(arrayList.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		WebElement chooseSize = driver.findElement(By.xpath("(//a[contains(text(),'L')])[2]"));
		chooseSize.click();
		Thread.sleep(1000);
		
		WebElement addToCart = driver.findElement(By.xpath("//button[contains(@class,'QqFHMw vslbG+ In9uk2')]"));
		addToCart.click();
		
		//go to cart and remove the previous added one
		WebElement remove = driver.findElement(By.xpath("(//div[contains(@class,'sBxzFz')])[4]"));
		remove.click();
		WebElement clickOnRemove = driver.findElement(By.xpath("(//div[contains(text(),'Remove')])[2]"));
		clickOnRemove.click();
		Thread.sleep(2000);
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\Sandeep Kushawaha\\eclipse-workspace\\seleniumFirstProject\\src\\practise_selenium2\\flipkartSc2nd.png");
		FileHandler.copy(src1, des2);
		driver.quit();
		
		

		
		
		

		
		
		
		
		 
}
}
