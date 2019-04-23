package sutsko_projects.tests;

import org.testng.annotations.Test;
import sutsko_projects.model.User;
import sutsko_projects.pages.TestBase;
import static org.testng.Assert.assertTrue;

public class CreateRepositoryTest extends TestBase {

    @Test
    public void CreateRepoTest() throws Exception {
        app.getWebDriver().get(app.getWebsiteUrl());
        app.getUserHelper().clickLoginLink();
        User user = new User().setLogin("anzhelasutko@gmail.com").setPassword("19072011!@#Qwe");
        app.getUserHelper().loginAs(user);
        app.getUserHelper().clickNewRepositoryButton();
        app.getUserHelper().focusOnRepositoryNameTextField();
        app.getUserHelper().setRepositoryName("AS_Repo"); //how to generate random numbers or timestamp???
        app.getUserHelper().clickCreateRepositoryButton();
        app.getUserHelper().ensurePageLoaded();
        assertTrue(app.getUserHelper().repositoryName.getText().contains("AS_Repo"));


    }
}

