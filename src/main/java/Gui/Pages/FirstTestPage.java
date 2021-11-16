package Gui.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class FirstTestPage {
	// variables
	private WebDriver driver;
	private final String URL = "https://www.google.com/ncr";
	private String Keyword = "selenium webdriver";

	public FirstTestPage(WebDriver driver) {
		this.driver = driver;
	}

//Locators for elements
	private By Search = By.name("q");

//actions 
	public void SearchForKeyword() {

		new ElementActions(driver).type(Search, Keyword).keyPress(Search, Keys.ENTER);

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