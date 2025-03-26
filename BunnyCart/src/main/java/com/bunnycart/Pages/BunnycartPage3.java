package com.bunnycart.Pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.BunnycartPage3objects;

public class BunnycartPage3 extends Browser {
	           
	public static void homepagesignin() {
				try {WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    		WebElement homepagesigninbtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a")));
					homepagesigninbtn.click();
	    		BunnycartPage3objects.homepagesignin();
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				}
			public static void signinbutton() {
				try {
					BunnycartPage3objects.signinbutton().click();
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
				}
			public static void signinmail(String data) {
				try {
					
					BunnycartPage3objects.signinmail().sendKeys(data);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			public static void signinpass(String data) {
				try {
					BunnycartPage3objects.signinpass().sendKeys(data);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	
		    }
			

