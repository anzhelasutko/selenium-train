package sutsko_projects.tests;

import org.testng.annotations.Test;
import sutsko_projects.model.User;
import sutsko_projects.pages.TestBase;

import static org.testng.Assert.assertTrue;

public class LoginTest extends TestBase {

    @Test
    public void LoginTest() throws Exception {
        app.getWebDriver().get(app.getWebsiteUrl());
        app.getUserHelper().clickLoginLink();
        User user = new User().setLogin("anzhelasutko@gmail.com").setPassword("19072011!@#Qwe");
        app.getUserHelper().loginAs(user);
        assertTrue(app.getUserHelper().isLoggedIn());
    }
}