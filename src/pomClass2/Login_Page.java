package pomClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	
	
	//initialization
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath="(//input[contains(@class,'textField')])[1]")
	private WebElement username;
	
	@FindBy(xpath="(//input[contains(@type,'password')])[1]")
	private WebElement password;
	
	@FindBy(xpath = "(//div)[11]")
	private WebElement loginBtn;
	
	
	//usage
	public void enterUserName()
	{
		username.sendKeys("admin");;
	}
	
	public void enterpassword()
	{
		password.sendKeys("manager");;
	}
	
	public void clickOnLoginButton()
	{
		loginBtn.click();
	}
	

	
	
	
	
	

}
