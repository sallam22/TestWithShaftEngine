package Gui.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.JSONFileManager;

public class FirstTestPage {
	// variables
	private WebDriver driver;
	private final String URL = System.getProperty("googleURL");
	public JSONFileManager testData = new JSONFileManager("src/test/resources/TestDataFiles/search.json");

	// constructor
	public FirstTestPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators for elements
	private By Search = By.name("q");

	// actions methods
	public void SearchForKeyword() {

		new ElementActions(driver).type(Search, testData.getTestData("searchQuery")).keyPress(Search, Keys.ENTER);

	}

	// assertion methods
	public static By Results() {

		return By.xpath(
				"//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]");

	}

	// keywords
	/**
	 * Using JavaDoc Google navigate page
	 * 
	 * @return self reference
	 */

	public FirstTestPage navigate() {

		BrowserActions.navigateToURL(driver, URL);
		return this;

	}

}