package TestCaseDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.browser;
import ScreenShot.capture;

public class Test1 {

    @BeforeMethod
    public void openBrowser() {
        browser.openBrowser();
        browser.navigateToUrl();
    }

    @DataProvider(name = "title")
    public Object[] data() {
        return new Object[]{"OrangeHRM"};
    }

    @Test(priority = 1, dataProvider = "title")
    public void testTitle(String expectedTitle) {
        String actualTitle = browser.driver.getTitle();
        System.out.println("Expected Title: " + expectedTitle + " | Actual Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");

        capture.screenShot("title");
        Reporter.log("Screenshot taken: title");
    }

    @AfterMethod
    public void closeBrowser() {
        browser.closeBrowser();
    }
}
