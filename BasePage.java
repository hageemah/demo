package goformz;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	public WebDriver driver;
	private static final Log LOG = LogFactory.getLog(BasePage.class);

	public static void goToUrl(WebDriver driver, String url) 
	{
		LOG.info("getting URL: " + url);
		driver.get(url);
	}
	
	public void switchTab() throws Exception
	{
		for(String winHandle : driver.getWindowHandles())
    	{
    	driver.switchTo().window(winHandle);
    	}
		TimeUnit.SECONDS.sleep(7);
	}
	
	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
