package TestCaseDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.browser;
import Excel.logindata;
import Pages.page1;
import Pages.page2;

public class Test2 {

    @BeforeMethod
    public void openBrowser() {
        browser.openBrowser();
        browser.navigateToUrl();
    }

    @DataProvider(name = "dp1")
    public Object[][] loginData() throws Exception {
        return logindata.readExcel(0); // Fetch login data from Excel
    }

    @Test(dataProvider = "dp1")
    public void testLogin(String username, String password, String expectedMenu) {
        page1.enterusername(username);
        page1.enterpassword(password);
        page1.click();

        String actualMenu = page2.MenuName();
        System.out.println("User: " + username + " | Expected: " + expectedMenu + " | Actual: " + actualMenu);
        
        Assert.assertNotNull(expectedMenu, "Expected menu value is null!");
        Assert.assertEquals(actualMenu, expectedMenu, "Login test failed!");
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000); // Allow time before closing
        browser.closeBrowser();
    }
}
