package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
         //1:Declaration
		//2:Initilization
		//3:Usage
	//2:Initilization
			public ActiTimeLoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}	
	
		//declaration
        @FindBy(xpath = "//input[@id='username']")
		private WebElement un;
		
		@FindBy(xpath = "(//input[@type='password'])[1]")
		private WebElement pwd;
		
		@FindBy(xpath = "//a[@id='loginButton']")
		private WebElement loginButton;
		
		
		
		//3:usage
		public void enterActiTimeLoginPageUsername()
		{
			un.sendKeys("admin");
		}
		
		public void enterActiTimeLoginPagePassword()
		{
			pwd.sendKeys("manager");
		}
		
		public void loginButton()
		{
			loginButton.click();
		}
		
		

	}


