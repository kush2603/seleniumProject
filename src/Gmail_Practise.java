import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Practise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sandeep Kushawaha\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("(//div[contains(@class,'BHzsHc')])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("sandeepkushawaha87");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("march@6469");
		driver.close();
		

	}

}
