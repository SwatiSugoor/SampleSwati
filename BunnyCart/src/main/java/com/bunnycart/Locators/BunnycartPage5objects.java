package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.Browser;

public class BunnycartPage5objects extends Browser {
	
		public static By homepagesignin = By.xpath("//div[@class='panel header']//a[@class='customer-login-link'][normalize-space()='Sign In']");
		public static By signinbutton = By.cssSelector("button[id='send2-login'] span");
		public static By signinmail = By.xpath("//input[@id='email-login']");
		public static By signinpass = By.xpath("//input[@id='pass-login']");
		public static By signout = By.xpath("//a[text()='Sign out']");
		public static WebElement homepagesignin() {
			return driver.findElement(homepagesignin);
		}
		public static WebElement signinbutton() {
			return driver.findElement(signinbutton);
		}
		public static WebElement signinmail() {
			return driver.findElement(signinmail);
		}
		public static WebElement signinpass() {
			return driver.findElement(signinpass);
		}
		public static WebElement signout() {
			return driver.findElement(signout);
		}
	}

