package sutsko_projects.tests;

import org.testng.annotations.Test;
import sutsko_projects.pages.TestBase;
import sutsko_projects.model.User;
import static org.testng.Assert.assertTrue;

public class EditUserProfileTest extends TestBase {
    @Test
    public void EditUserProfileTest() throws Exception {
        app.getWebDriver().get(app.getWebsiteUrl());
        app.getUserHelper().clickLoginLink();
        User user = new User().setLogin("anzhelasutko@gmail.com").setPassword("19072011!@#Qwe");
        app.getUserHelper().loginAs(user);
        app.getUserHelper().clickViewProfileAndMoreMenu();
        app.getUserHelper().clickYourProfileDDItem();
        app.getUserHelper().clickEditProfileButton();
        app.getUserHelper().clearUserBioField();
        app.getUserHelper().enterUserBio("test 123");
        app.getUserHelper().clickUserProfileSaveButton();
        Thread.sleep(300);//didn't want to work with ensurePageLoaded
        assertTrue(app.getUserHelper().userBioText.getText().contains("test 123"));
    }
}
