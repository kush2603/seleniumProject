package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage2 {

	
	@FindBy(xpath = "//img[@id='closeLightbox']")
	private WebElement closeBox;
	
	@FindBy(xpath = "//img[@src='/img/default/top_nav/default-logo.png?hash=274618146']")
	private WebElement actilogo;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement actiTimeLogout;
	
	@FindBy (xpath = "(//img[@src='/img/default/pixel.gif?hash=274618146'])[11]")
	private WebElement user;
	
	
	public ActiTimeHomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3:usage
	
	public void actiTimeBoxClose()
	{
		closeBox.click();
	}
	public void checkActiLogo()
	{
	  boolean logo = actilogo.isDisplayed();
	  System.out.println(logo);
	}
	
	public void actiPagelogout()
	{
		actiTimeLogout.click();
	}

	public void clickonUsers()
	{
		user.click();
	}
}
