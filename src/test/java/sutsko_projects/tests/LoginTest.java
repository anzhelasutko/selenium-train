package sutsko_projects.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import sutsko_projects.model.User;
import sutsko_projects.pages.TestBase;

public class LoginTest extends TestBase {
    private WebDriver webDriver;
    private String websiteUrl;

    @Test
    public void LoginTest() throws Exception {
        webDriver.get(websiteUrl);
        User user = new User().setLogin("anzhelasutko@gmail.com").setPassword("19072011!@#Qwe");
        app.getUserHelper().loginAs(user);
        assertTrue(app.getUserHelper().isLoggedIn());

//        webDriver.findElement(By.xpath("//*[@href='/login']")).click();
//        WebElement usernameField = webDriver.findElement(By.id("login_field"));
//        usernameField.click();
//        usernameField.clear();
//        usernameField.sendKeys("anzhelasutko@gmail.com");
//        WebElement passwordField = webDriver.findElement(By.id("password"));
//        passwordField.clear();
//        passwordField.sendKeys("19072011!@#Qwe");
//        webDriver.findElement(By.name("commit")).click();
//        //webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        assertTrue(webDriver.findElement(By.xpath("//*[@href='/pulls']")).isDisplayed());
    }
}