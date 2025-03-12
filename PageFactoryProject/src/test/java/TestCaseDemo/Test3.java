package TestCaseDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.browser;
import Pages.page1;
import Pages.page2;
import ScreenShot.capture;
import Locators.Page2Objects;

public class Test3 {

    page1 loginPage;  // Declare instance of page1
    page2 dashboardPage; // Declare instance of page2

    @BeforeMethod
    public void openBrowser() {
        browser.openBrowser();
        browser.navigateToUrl();

        loginPage = new page1();  // Initialize page1 object
        dashboardPage = new page2(); // Initialize page2 object
    }

    @Test
    public void testMenuSelection() {
        loginPage.enterUsername("Admin"); // Using the object to call methods
        loginPage.enterpassword("admin123");
        loginPage.click();

        dashboardPage.optionclick("leave");

        String actualMenuText = Page2Objects.menuName().getText();
        System.out.println("Menu Clicked: Leave | Expected: Leave | Actual: " + actualMenuText);

        Assert.assertEquals(actualMenuText, "Leave", "Menu selection failed!");

        capture.screenShot("Leave_Menu_Selected");
    }

    @AfterMethod
    public void closeBrowser() {
    }
}
