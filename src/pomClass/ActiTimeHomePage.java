package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {
	
	//1:Declaration
	
	@FindBy(xpath = "//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy(xpath = "(//td[@class='x-table-layout-cell'])[1]")
	private WebElement createReport;

	//2:Initilization
	
	public ActiTimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//3:Usage
	
	public void clickonReports()
	{
		reports.click();
	}
	
	public void clickonCreateReport()
	{
		createReport.click();
	}
	
	
}
