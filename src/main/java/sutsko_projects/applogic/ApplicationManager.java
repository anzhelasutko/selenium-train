package sutsko_projects.applogic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import sutsko_projects.applogic.UserHelper;
import sutsko_projects.util.Browser;
import sutsko_projects.util.PropertyLoader;
import sutsko_projects.webdriver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private UserHelper userHelper;

    public WebDriver webDriver;
    public String websiteUrl;

    public ApplicationManager() {
        websiteUrl = PropertyLoader.loadProperty("site.url");
        String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

        Browser browser = new Browser();
        browser.setName(PropertyLoader.loadProperty("browser.name"));
        browser.setVersion(PropertyLoader.loadProperty("browser.version"));
        browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

        String username = PropertyLoader.loadProperty("user.username");
        String password = PropertyLoader.loadProperty("user.password");

        webDriver = WebDriverFactory.getInstance(gridHubUrl, browser, username,
                password);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        userHelper = new UserHelper(this);
        getWebsiteUrl();
        //navHelper = new NavigationHelper1(this);

        //getNavigationHelper1().openMainPage();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    //@Override
    //public NavigationHelper getNavigationHelper() {
    //return navHelper;
    //}

    public void stop() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public String getWebsiteUrl() {

        return websiteUrl;
    }
}

