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

//        driver.findElement(By.linkText("login"))
//                .click();
//        driver.findElement(By.id("login_field"))
//                .sendKeys(user.getLogin());
//        driver.findElement(By.id("password"))
//                .sendKeys(user.getPassword());
//        driver.findElement(By.name("commit"))
//                .click();
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

    }
