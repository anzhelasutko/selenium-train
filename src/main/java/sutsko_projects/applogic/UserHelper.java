package sutsko_projects.applogic;

import org.openqa.selenium.WebElement;
import sutsko_projects.model.User;

public class UserHelper extends DriverBasedHelper {

        private ApplicationManager manager;

        public UserHelper (ApplicationManager manager) {
            super(manager.getWebDriver());
            this.manager = manager;
        }


        public void loginAs(User user) {
            pages.loginPage.ensurePageLoaded()
                    .setUsernameField(user.getLogin())
                    .setPasswordField(user.getPassword())
                    .clickSubmitButton();
        }


        public boolean isLoggedIn() {
            return pages.internalPage.waitPageLoaded();
        }

        public boolean isLoggedInAs(User user) {
            return false;
        }

        public boolean isNotLoggedIn() {

            return pages.loginPage.waitPageLoaded();
        }

        public void clickLoginLink() {
            pages.loginPage.clickLoginLink();
        }

        public void clickNewRepositoryButton() {pages.internalPage.clickNewRepositoryButton();}

        public void focusOnRepositoryNameTextField() {
            pages.internalPage.focusOnRepositoryNameTextField();
        }

        public UserHelper setRepositoryName(String text) {
            pages.internalPage.setRepositoryName(text);
            return this;
        }

        public void clickCreateRepositoryButton() {
            pages.internalPage.clickCreateRepositoryButton();
        }

        public WebElement repositoryName = pages.internalPage.repositoryName;

        public void ensurePageLoaded() {
            pages.internalPage.ensurePageLoaded();
        }

        public void clickViewProfileAndMoreMenu() {
            pages.userProfilePage.clickViewProfileAndMoreMenu();
        }

        public void clickYourProfileDDItem() {
            pages.userProfilePage.clickYourProfileDDItem();
        }

        public void clickEditProfileButton() {
            pages.userProfilePage.clickEditProfileButton();
        }

        public void clearUserBioField() {
            pages.userProfilePage.clearUserBioField();
        }

        public void clickUserProfileSaveButton() {
            pages.userProfilePage.clickUserProfileSaveButton();
        }
        public UserHelper enterUserBio(String text) {
            pages.userProfilePage.enterUserBio(text);
            return this;
        }

        public WebElement userBioText = pages.userProfilePage.userBioText;

    }
