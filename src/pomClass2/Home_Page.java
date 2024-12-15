package pomClass2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	
	public WebDriver driver;
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='ext-gen10']")
	private WebElement calender;
	
	@FindBy(xpath="//span[@class='arrow']")
	private WebElement arrow;
	
	@FindBy(xpath="(//img[contains(@class,'sizer')])[2]")
	private WebElement sizer;
	
	@FindBy(xpath="//input[contains(@id,'SaveChangesButton')]")
	private WebElement savechangebutton;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[1]")
	private WebElement dropdown;
	
	//usage
	public void clickonCalender()
	{
		calender.click();
	}
	
	public void clickonArrow()
	{
		arrow.click();
	}

	public void clickonSizer()
	{
		try {
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.visibilityOf(arrow)).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void clickonSaveChangesBtn()
	{
		savechangebutton.click();
	}
	
	public void clickonDropDown()
	{
		dropdown.click();
	}
}
