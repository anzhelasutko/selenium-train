package sutsko_projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class LoginPage extends AnyPage{
    public LoginPage(PageManager pages) {
        super(pages);
    }

    @FindBy(name = "login")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "commit")
    private WebElement submitButton;

    @FindBy(xpath="//*[@href='/login']")
    private WebElement loginLink;

    public LoginPage setUsernameField(String text) {
        usernameField.sendKeys(text);
        return this;
    }

    public LoginPage setPasswordField(String text) {
        passwordField.sendKeys(text);
        return this;
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public LoginPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(presenceOfElementLocated(By.name("login")));
        return this;
    }

    public void clickLoginLink() {
        loginLink.click();
    }

}
