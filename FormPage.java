package goformz;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage 
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	public FormPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[contains(.,'Done')]")
	private WebElement doneButton;
	
	@FindBy(xpath="//button[contains(.,'Save ')]")
	private WebElement saveButton;
	
	@FindBy(xpath="//button[@data-qtip='Download']")
	private WebElement downloadButton;
	
	@FindBy(xpath="//button[contains(.,'Select')]")
	private WebElement selectButton;
	
	@FindBy(className="icon-check2")
	private WebElement checkmarkButton;

	@FindBy(className="x-tool-close")
	private WebElement closeModal;
	
	@FindBy(xpath="//*[contains(@class,'x-grid-cell-inner')]")
	private WebElement modalTopSelection;

	@FindBy(xpath="//*[contains(@id,'sigcanvas')]")
	private WebElement signatureCanvas;
		
	@FindBy(xpath="//*[contains(@class,'page-wrapper')]")
	private WebElement wholeForm;
	
	@FindBy(xpath="//*[contains(@style,'424px')]")
	private WebElement poNumber;	
	
	@FindBy(xpath="//*[contains(@style,'536px')]")
	private WebElement problems;
	
	@FindBy(xpath="//div[contains(@class,'form-actions-complete')]//button")
	private WebElement completeButton;
	
	public void clickCompleteButton() throws Exception
	{
		completeButton.click();
		TimeUnit.SECONDS.sleep(20);
	}
	
	public void clickSelectButton() throws Exception 
	{
		selectButton.click();
		TimeUnit.SECONDS.sleep(5);
	}
	
	public void clickDownloadButton() throws Exception
	{
		downloadButton.click();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void clickSaveButton() throws Exception
	{
		saveButton.click();
	    TimeUnit.SECONDS.sleep(8);
	}
	
	public void clickDoneButton() throws Exception
	{
		doneButton.click();
	    TimeUnit.SECONDS.sleep(3);
	}
	
	public void clickSaveSignatureButton() throws Exception
	{
		checkmarkButton.click();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void signIt()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@id,'sigcanvas')]")),-100,0)
		.clickAndHold()
		.moveByOffset(50, 50)
		.moveByOffset(100, -200)
		.release()
		.build()
		.perform();	
	}
	 
	public void selectJobComplete() 
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")),308,-1050).click().build().perform();	
	}
	
	public void selectCompanyName() 
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")),-200,-955).click().build().perform();
	}
	
	public void selectTechnician() throws Exception
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")),-200,-840).click().build().perform();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void insertPoNumber() throws Exception
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")),-200,-860).click().sendKeys("10500").build().perform();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void insertProblems() throws Exception
	{
		problems.clear();
		problems.sendKeys("We got it all under control");
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void selectPartMfg()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")),-380,-660).click().build().perform();
	}
	
	public void selectPartNumber()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")),-220,-660).click().build().perform();
	}
	
	public void selectQuantity() throws Exception
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), 200,-660).click().sendKeys("10").build().perform();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void selectDiscountLevel() throws Exception
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), -50,-550).click().build().perform();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void selectTaxRate() throws Exception
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), 140,-530).click().build().perform();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void selectWorkingTechnician() throws Exception
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), -300,-415).click().build().perform();
		TimeUnit.SECONDS.sleep(3);
	}
	
	public void selectWorkingStartTime() throws Exception
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), -130,-415).click().build().perform();
	}
	
	public void selectWorkingEndTime()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), -10,-415).click().build().perform();
	}
	
	public void customerSignDate()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), 100,-230).click().build().perform();
	}
	
	public void technicianSignDate()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), 100,-100).click().build().perform();		
	}
	
	public void customerSign()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), -260,-230).click().build().perform();		
	}
	
	public void technicianSign()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'page-wrapper')]")), -260,-100).click().build().perform();		
	}
	
	public void selectModalTopSelection()
	{
		modalTopSelection.click(); 
	}
	
	public void scrollMiddle() throws Exception
	{
	    WebElement element = driver.findElement(By.xpath("//*[contains(@style,'536px')]"));
	    jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void scrollBottom() throws Exception
	{
	    WebElement element = driver.findElement(By.xpath("//td[@id='td66']")); 
	    jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void selectAM()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[contains(@style,'padding-bottom: 24px;')]")), 100,0).click().build().perform();		
		driver.findElement(By.xpath("//li[contains(.,'AM')]")).click();
	}
	
	public void selectPM()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[contains(@style,'padding-bottom: 24px;')]")), 100,0).click().build().perform();
		driver.findElement(By.xpath("//li[contains(.,'PM')]")).click();		
	}
	
	public void assertTitle() 
	{
		assertEquals("Sample Work Order", driver.getTitle());
	}
	
	public void assertFilenameText()
	{
		assertEquals("Sample Work Order", driver.findElement(By.xpath("//div[contains(@class,'title')]")).getText());
	}
	
	public void assertZoomControlsText()
	{
		assertEquals("Zoom", driver.findElement(By.xpath("//div[contains(.,'Zoom') and contains(@class,'view-action-label')]")).getText());
	}
	
}