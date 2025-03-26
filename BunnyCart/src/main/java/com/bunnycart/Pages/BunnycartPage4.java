package com.bunnycart.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.BunnycartPage2objects;
import com.bunnycart.Locators.BunnycartPage4objects;

public class BunnycartPage4 extends Browser {
	public static void openSignInPage() {
        try {
            BunnycartPage4objects.signin().click();
        } catch (Exception e) {
            System.out.println("Error opening Sign In page: " + e.getMessage());
        }
    }

    public static void inputEmail(String email) {
        try {
            BunnycartPage4objects.enteremailfield().sendKeys(email); 
        } catch (Exception e) {
            System.out.println("Error entering email: " + e.getMessage());
        }
    }

    public static void inputPassword(String password) {
        try {
            BunnycartPage4objects.enterpasswordfield().sendKeys(password);
        } catch (Exception e) {
            System.out.println("Error entering password: " + e.getMessage());
        }
    }

  
    public static void clickSignInButton() {
        try {
            BunnycartPage4objects.buttonsigin().click(); 
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//input[@id='search']\""))); 
        } catch (Exception e) {
            System.out.println("Error clicking Sign In button: " + e.getMessage());
        }
    }

    public static void searchForProduct1(String product) {
        try {
            BunnycartPage4objects.searchproduct1().sendKeys(product); 
            BunnycartPage4objects.searchproduct1().submit(); 
           
        } catch (Exception e) {
            System.out.println("Error searching product: " + e.getMessage());
        }
    }

    public static void addProductToCart() {
        try {
            BunnycartPage4objects.addcart().click(); 
        } catch (Exception e) {
            System.out.println("Error adding product to cart: " + e.getMessage());
        }
    }
    public static void SearchForProduct2(String product) {
    	try {
    		BunnycartPage4objects.Searchproduct2().sendKeys(product);
    		
    	}catch (Exception e) {
    		System.out.println("Error searching product: "+e.getMessage());
    	}
    }


    public static void openShoppingCart() {
        try {
            BunnycartPage4objects.clickcartbutton().click(); 
        } catch (Exception e) {
            System.out.println("Error opening shopping cart: " + e.getMessage());
        }
    }

    
    public static void closeShoppingCart() {
        try {
            BunnycartPage4objects.closecart().click(); 
        } catch (Exception e) {
            System.out.println("Error closing shopping cart: " + e.getMessage());
        }
    }
}





