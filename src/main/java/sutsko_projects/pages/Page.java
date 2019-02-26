package sutsko_projects.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Abstract class representation of a Page in the UI. Page object pattern
 *
 * @author Sebastiano Armeli-Battana
 */
public abstract class Page {

	protected WebDriver webDriver;
	protected WebDriverWait wait;
	public PageManager pages;

	/*
	 * Constructor injecting the WebDriver interface
	 *
	 * @param webDriver
	 */
	public Page(PageManager pages) {
		this.pages = pages;
		webDriver = pages.getWebDriver();
		wait = new WebDriverWait(webDriver, 10);
	}

	public WebDriver getWebDriver() {

		return webDriver;
	}

	public String getTitle() {

		return webDriver.getTitle();
	}

	public Page ensurePageLoaded() {
		return this;
	}

	public boolean waitPageLoaded() {
		try {
			ensurePageLoaded();
			return true;
		} catch (TimeoutException to) {
			return false;
		}
	}
}


