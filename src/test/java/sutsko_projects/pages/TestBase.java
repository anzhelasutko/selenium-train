package sutsko_projects.pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import sutsko_projects.applogic.ApplicationManager;

/*
 * Base class for all the test classes
 *
 * @author Sebastiano Armeli-Battana
 */

public class TestBase {
    private static final String SCREENSHOT_FOLDER = "target/screenshots/";
    private static final String SCREENSHOT_FORMAT = ".png";

    protected ApplicationManager app;

    @BeforeClass
    public void init() {
        app = new ApplicationManager();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

//  @AfterMethod
//  public void setScreenshot(ITestResult result) {
//    if (!result.isSuccess()) {
//      try {
//        WebDriver returned = new Augmenter().augment(webDriver);
//        if (returned != null) {
//          File f = ((TakesScreenshot) returned).getScreenshotAs(OutputType.FILE);
//          try {
//            FileUtils.copyFile(f,
//                new File(SCREENSHOT_FOLDER + result.getName() + SCREENSHOT_FORMAT));
//          } catch (IOException e) {
//            e.printStackTrace();
//          }
//        }
//      } catch (ScreenshotException se) {
//        se.printStackTrace();
//      }
//    }
//  }
}
