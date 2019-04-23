package sutsko_projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class InternalPage extends AnyPage {

    public InternalPage(PageManager pages) {
        super(pages);
    }

    @FindBy (xpath="/html/body/div[4]/div/aside[1]/div[2]/div/div/h2/a")
    private WebElement newRepositoryButton;

    @FindBy (className="//*[@href='/new']")
    private WebElement newRepositoryButton2;

    @FindBy(xpath = "//*[@id=\"repository_name\"]")
    private WebElement repositoryNameTextField;

    @FindBy(xpath = "//*[@id=\"new_repository\"]/div[3]/button")
    private WebElement createRepositoryButton;

    @FindBy(xpath = "//*[@id=\"js-repo-pjax-container\"]/div[1]/div/h1/strong/a")
    public WebElement repositoryName;


    public InternalPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(presenceOfElementLocated(By.xpath("//*[@href='/pulls']")));
        return this;
    }

    public void clickNewRepositoryButton() {
        newRepositoryButton.click();
    }

    public void focusOnRepositoryNameTextField() {
        repositoryNameTextField.click();
    }

    public InternalPage setRepositoryName(String text) {
        repositoryNameTextField.sendKeys(text);
        return this;
    }

    public void clickCreateRepositoryButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createRepositoryButton));
        createRepositoryButton.click();
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


