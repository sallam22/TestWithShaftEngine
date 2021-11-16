package Gui.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Validations;

import Gui.Pages.FirstTestPage;
import io.qameta.allure.Description;


public class firstTest {
	private WebDriver driver;

@Description("Given:Open Browser and Search for \"selenium webdriver\" Then Check results")

  @Test(description="Check the search function")
  public void checkSearchingFuncality() {
	  
	  // implement Fluent Design To Increase Performance
	 new  FirstTestPage(driver).navigate(). SearchForKeyword();
	 // implement Assertion in one chain
	Validations.assertThat().element(driver, FirstTestPage.Results() ).text().doesNotEqual( FirstTestPage.Results() ).perform();

  }
  
  
  
  @BeforeClass
  public void setup() {
		driver = DriverFactory.getDriver();
	    new  FirstTestPage(driver).navigate();   // Anonymous Fluent POMs
  	
  }
  @AfterClass
  public void teardown() {
  	
	  BrowserActions.closeCurrentWindow(driver);


  }
}
