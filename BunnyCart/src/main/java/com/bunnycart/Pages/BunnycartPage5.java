package com.bunnycart.Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.BunnycartPage5objects;

public class BunnycartPage5 extends Browser{
	
		public static void homepagesignin() {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement homepagesigninlink= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='panel header']//a[@class='customer-login-link'][normalize-space()='Sign In']")));
				homepagesigninlink.click();
			BunnycartPage5objects.homepagesignin();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			}
		public static void buttonsigin() {
			try {
				BunnycartPage5objects.signinbutton().click();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			}
		public static void signinemail(String data) {
			try {
				BunnycartPage5objects.signinmail().sendKeys(data);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		public static void signinpassword(String data) {
			try {
				BunnycartPage5objects.signinpass().sendKeys(data);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	    public static void signoutlink() {
	    	try {
	    		BunnycartPage5objects.signout().click();
	    		
	    	}catch(Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    }

	}

