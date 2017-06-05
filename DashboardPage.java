package goformz;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage
{
	public DashboardPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[contains(.,'New ')]")
	private WebElement newFormButton;
	
	@FindBy(xpath="//button[contains(.,'Select ')]")
	private WebElement selectButton;
	
	@FindBy(linkText="Forms")
	private WebElement formsMenu;

	@FindBy(xpath="//span[contains(.,'Sample Work Order')]")
	private WebElement sampleWorkOrder;
	
	public void clickFormsMenu() throws Exception
	{
		formsMenu.click();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void clickNewFormButton() throws Exception
	{
		newFormButton.click();
		TimeUnit.SECONDS.sleep(3);
	}
		
	public void clickSampleWorkOrder() throws Exception
	{
		sampleWorkOrder.click();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void clickSelectButton() throws Exception
	{
		selectButton.click();
		TimeUnit.SECONDS.sleep(8);
	}
	
	public void assertTitle() 
	{
		assertEquals("GoFormz", driver.getTitle());
	}
	
	public void assertFormsText()
	{
		assertEquals("Forms", driver.findElement(By.xpath("//div[contains(@class,'page-header')]//h2")).getText());
	}
	
	public void assertWelcomeText()
	{
		assertEquals("Welcome!", driver.findElement(By.xpath("//h1")).getText() );
	}
	
}