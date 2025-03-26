package com.bunnycart.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.BunnycartPage2objects;

public class BunnycartPage2 extends Browser {
	static WebDriverWait wait; 
	
   
    public static void openSignInPage() {
        try {
            BunnycartPage2objects.signin().click(); 
        } catch (Exception e) {
            System.out.println("Error opening Sign In page: " + e.getMessage());
        }
    }

    public static void inputEmail(String email) {
        try {
            BunnycartPage2objects.enteremailfield().sendKeys(email); 
        } catch (Exception e) {
            System.out.println("Error entering email: " + e.getMessage());
        }
    }

    public static void inputPassword(String password) {
        try {
            BunnycartPage2objects.enterpasswordfield().sendKeys(password); 
            } catch (Exception e) {
            System.out.println("Error entering password: " + e.getMessage());
        }
    }

    public static void clickSignInButton() {
        try {
            BunnycartPage2objects.buttonsigin().click();
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//input[@id='search']\""))); 
        } catch (Exception e) {
            System.out.println("Error clicking Sign In button: " + e.getMessage());
        }
    }

    public static void searchForProduct(String product) {
        try {
            BunnycartPage2objects.searchproduct().sendKeys(product); 
            BunnycartPage2objects.searchproduct().submit(); 
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'search_mini_form\']/div[1]/div/div[5]/div[1]/a/div[2]/div[1]"))); 
        } catch (Exception e) {
            System.out.println("Error searching product: " + e.getMessage());
        }
    }

    public static void selectFirstProduct() {
        try {
            BunnycartPage2objects.selectProduct().click();
            Thread.sleep(6000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, -850)", "");
        } catch (Exception e) {
            System.out.println("Error selecting product: " + e.getMessage());
        }
    }

    public static void selectProductQuantity() {
        try {
            BunnycartPage2objects.clickquantity().click();
        } catch (Exception e) {
            System.out.println("Error selecting quantity: " + e.getMessage());
        }
    }

    public static void addProductToCart() {
        try {
            BunnycartPage2objects.addcart().click(); 
        } catch (Exception e) {
            System.out.println("Error adding product to cart: " + e.getMessage());
        }
    }

    public static void openShoppingCart() {
        try {
            BunnycartPage2objects.clickcartbutton().click();
        } catch (Exception e) {
            System.out.println("Error opening shopping cart: " + e.getMessage());
        }
    }

    public static void closeShoppingCart() {
        try {
            BunnycartPage2objects.closecart().click();
        } catch (Exception e) {
            System.out.println("Error closing shopping cart: " + e.getMessage());
        }
    }
}

