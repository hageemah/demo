package goformz;

import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	protected static WebDriver driver;
	private static final Log LOG = LogFactory.getLog(BaseTest.class);

	@Before
	public void setUp()
	{
		// the path to the Firefox Driver needs to be set for the machine
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		LOG.info("Starting Driver");
		driver = new FirefoxDriver();
		Dimension dimension = new Dimension(1200,650);
		driver.manage().window().getSize().getHeight();
		driver.manage().window().setSize(dimension);
		System.out.println("Height is now " + driver.manage().window().getSize().getHeight());
		System.out.println("Width is now " + driver.manage().window().getSize().getWidth());
		driver.manage().window().setPosition(new Point(0,0));
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() 
	{
		LOG.info("Quitting Driver");
		driver.quit();
	}
}