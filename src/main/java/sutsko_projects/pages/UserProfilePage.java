package sutsko_projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class UserProfilePage extends AnyPage {

        public UserProfilePage (PageManager pages) {
            super(pages);
        }

        @FindBy(xpath = "/html/body/div[1]/header/div[8]/details/summary")
        private WebElement viewProfileAndMoreMenu;

        @FindBy(xpath = "/html/body/div[1]/header/div[8]/details/details-menu/a[1]")
        private WebElement yourProfileDDItem;

        @FindBy(xpath = "//*[@id=\"js-pjax-container\"]/div/div[1]/div[6]/button")
        private WebElement editProfileButton;

        @FindBy(xpath = "//*[@id=\"js-pjax-container\"]/div/div[1]/form/div[1]/textarea")
        private WebElement userBioTextField;

        @FindBy(xpath = "//*[@id=\"js-pjax-container\"]/div/div[1]/form/div[5]/button[1]")
        private WebElement userProfileSaveButton;

        @FindBy(xpath = "//*[@id=\"js-pjax-container\"]/div/div[1]/div[6]/div/div")
        public WebElement userBioText;


        public UserProfilePage ensurePageLoaded() {
            super.ensurePageLoaded();
            wait.until(presenceOfElementLocated(By.xpath("//*[@href='/pulls']")));
            return this;
        }

        public void clickViewProfileAndMoreMenu() {
            viewProfileAndMoreMenu.click();
        }

        public void clickYourProfileDDItem() {
            yourProfileDDItem.click();
        }

        public void clickEditProfileButton() {
            wait.until(ExpectedConditions.elementToBeClickable(editProfileButton));
            editProfileButton.click();
        }

        public void clearUserBioField() {
            userBioTextField.clear();
        }

        public UserProfilePage enterUserBio(String text) {
            userBioTextField.sendKeys(text);
            return this;
        }

        public void clickUserProfileSaveButton() {
            userProfileSaveButton.click();
    }

}
