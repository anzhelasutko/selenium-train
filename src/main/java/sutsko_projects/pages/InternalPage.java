package sutsko_projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class InternalPage extends AnyPage {

    public InternalPage(PageManager pages) {
        super(pages);
    }

    public InternalPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(presenceOfElementLocated(By.xpath("//*[@href='/pulls']")));
        return this;
    }

//    @FindBy(css = "nav a[href $= '?go=profile']")
//    private WebElement userProfileLink;
//
//    @FindBy(css = "nav a[href $= '?go=users']")
//    private WebElement userManagementLink;
//
//    @FindBy(css = "nav a[href $= '?logout']")
//    private WebElement logoutLink;


//    public LoginPage clickLogoutLink() {
//        logoutLink.click();
//        wait.until(alertIsPresent()).accept();
//        return pages.loginPage;
//    }
}


