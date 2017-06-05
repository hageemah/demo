package goformz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class FillOutFormTest extends BaseTest 
{
	Log LOG = LogFactory.getLog(BasePage.class);
    
	@Test	//Happy Path Test. Create a new form, save it, and download it.
	public void testPositive() throws Exception
	{
		final LoginPage loginPageObject = new LoginPage(driver);
	    final DashboardPage dashboardPageObject = new DashboardPage(driver);
	    final BasePage basePageObject = new BasePage(driver);
	    final FormPage formPageObject = new FormPage(driver);
		
	    LOG.info("Logging in and loading the dashboard");
	    String baseUrl = "https://app.goformz.com/";
		BasePage.goToUrl(driver, baseUrl);
		loginPageObject.assertTitle();
		loginPageObject.assertLoginText();
	    loginPageObject.validUsername();
	    loginPageObject.validPassword();
	    loginPageObject.clickLoginButton();
	    dashboardPageObject.assertTitle();
	    dashboardPageObject.assertWelcomeText();
	    dashboardPageObject.clickFormsMenu();	    
	    dashboardPageObject.assertFormsText();
	    dashboardPageObject.clickNewFormButton();
	    dashboardPageObject.clickSampleWorkOrder();
	    dashboardPageObject.clickSelectButton();
	    basePageObject.switchTab();	    

	    LOG.info("Filling out the form"); 
	    formPageObject.assertTitle();
	    formPageObject.assertFilenameText();
	    formPageObject.assertZoomControlsText();
	    formPageObject.selectJobComplete();
	    formPageObject.selectCompanyName();
	    formPageObject.selectModalTopSelection();
	    formPageObject.clickDoneButton();
	    formPageObject.insertPoNumber();
	    formPageObject.selectTechnician();
	    formPageObject.selectModalTopSelection();
	    formPageObject.insertProblems();
	    formPageObject.scrollMiddle();
	    formPageObject.selectPartMfg();
	    formPageObject.selectModalTopSelection();
	    formPageObject.clickDoneButton();
	    formPageObject.selectPartNumber();
	    formPageObject.selectModalTopSelection();
	    formPageObject.clickDoneButton();
	    formPageObject.selectQuantity();
	    formPageObject.selectDiscountLevel();
	    formPageObject.selectModalTopSelection();
	    formPageObject.selectTaxRate();
	    formPageObject.selectModalTopSelection();
	    formPageObject.selectWorkingTechnician();
	    formPageObject.selectModalTopSelection();
	    formPageObject.selectWorkingStartTime();
	    formPageObject.selectAM(); 
	    formPageObject.clickDoneButton();
	    formPageObject.selectWorkingEndTime();
	    formPageObject.selectPM();
	    formPageObject.clickDoneButton();
	    formPageObject.scrollBottom();
	    formPageObject.customerSign();
	    formPageObject.signIt();
	    formPageObject.clickSaveSignatureButton();
	    formPageObject.customerSignDate();
	    formPageObject.clickDoneButton();
	    formPageObject.technicianSign();
	    formPageObject.signIt();
	    formPageObject.clickSaveSignatureButton();
	    formPageObject.technicianSignDate();
	    formPageObject.clickDoneButton();
	    
	    LOG.info("Saving and downloading the form");
	    formPageObject.clickSaveButton();
	    formPageObject.clickDownloadButton();
	    formPageObject.clickSelectButton();
	    formPageObject.clickCompleteButton();
	    
	    //Done
	}
}
