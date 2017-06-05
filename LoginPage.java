package goformz;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage 
{
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="username") 
	private WebElement username;
	
	@FindBy(id="password") 
	private WebElement password;
	
	@FindBy(xpath="//*[contains(@class,'herobtn') and @ng-disabled and not(@disabled)]")
	private WebElement loginButton;
	
	public void validUsername()
	{
		username.clear();
		username.sendKeys("sungbae@gmail.com");
	}
	
	public void validPassword() throws Exception
	{
		password.clear();
		password.sendKeys("jura55ic");
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void clickLoginButton() throws Exception
	{
		loginButton.click();
		TimeUnit.SECONDS.sleep(5);
	}
	
	public void assertTitle() 
	{
		assertEquals("GoFormz - Login", driver.getTitle());
	}
	
	public void assertLoginText()
	{
		assertEquals("Customer Login", driver.findElement(By.xpath("//h2[contains(.,'Customer Login')]")).getText());
	}

}