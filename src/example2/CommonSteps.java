package example2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonSteps {
	
	
	public static void captureScreenshot(WebDriver d,String filename) throws IOException         //d = driver =  new ChromeDriver();
	{
		TakesScreenshot ts = (TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("D:\\Captures\\"+ filename +".png");
		FileHandler.copy(src, des);
	}
	
	         //iframe handling 
	
	public static void switchToIframeByIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void switchToIframeByIdORName(WebDriver driver,String value)
	{
		driver.switchTo().frame(value);
	}
	
	public static void switchToParentPage(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	public static void selectOptionFromDropdown(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	
}
	
	
	

