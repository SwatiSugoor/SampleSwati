package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.Browser;

public class BunnycartPage2objects extends Browser {

	public static By signinlink=By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
	public static By email=By.xpath("//input[@id='email-login']");
	public static By password=By.xpath("//input[@id='pass-login']");
	public static By signinbutton=By.xpath("//button[@id='send2-login']");
	public static By search =By.xpath("//input[@id='search']");
	public static By selectproduct=By.xpath("//img[@class='img-responsive']");
	public static By quantity=By.xpath("//div[contains(@class, 'swatch-option')][2]");
	public static By addtocart=By.xpath("//button[@title='Add to Cart']");
	public static By cartbutton=By.xpath("//*[@id='html-body']/div[2]/header/div[2]/div[1]/a/span[1]");
	public static By closecart=By.xpath("//a[contains(@class, 'action') and contains(@class, 'showcart')]");
	
	public static WebElement signin() {
		return driver.findElement(signinlink);
	}
	public static WebElement enteremailfield() {
		return driver.findElement(email);
	}
	public static WebElement enterpasswordfield() {
		return driver.findElement(password);
	}
	public static WebElement buttonsigin() {
		return driver.findElement(signinbutton);
	}
	public static WebElement searchproduct() {
		return driver.findElement(search);
	}
	public static WebElement selectProduct() {
		return driver.findElement(selectproduct);
	}
	public static WebElement clickquantity() {
		return driver.findElement(quantity);
	}
	public static WebElement addcart() {
		return driver.findElement(addtocart);
	}
	public static WebElement clickcartbutton() {
		return driver.findElement(cartbutton);
	}
	public static WebElement closecart() {
		return driver.findElement(closecart);
	}
}
