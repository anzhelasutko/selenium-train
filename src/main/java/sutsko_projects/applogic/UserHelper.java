package sutsko_projects.applogic;

import org.openqa.selenium.By;
import sutsko_projects.applogic.ApplicationManager;
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

//        public void logout() {
//            pages.internalPage.ensurePageLoaded()
//                    .clickLogoutLink();
//        }

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

    }
