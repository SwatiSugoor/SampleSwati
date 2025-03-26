package com.bunnycart.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bunnycart.Browser.Browser;

public class BunnycartPage4objects extends Browser {
	public static By signinlink=By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
	public static By email=By.xpath("//input[@id='email-login']");
	public static By password=By.xpath("//input[@id='pass-login']");
	public static By signinbutton=By.xpath("//button[@id='send2-login']");
	public static By searchproduct1 =By.xpath("//input[@id='search']");
	public static By addtocart=By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[3]/div[6]/form/div/div/div[2]/button");
	public static By searchproduct2=By.xpath("//input[@id='search']");
	public static By cartbutton=By.xpath("//a[@class='action showcart']/span[@class='text']");
	public static By closecart=By.xpath("//a[contains(@class, 'showcart')]//span[contains(@class, 'text')]");
	
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
	public static WebElement searchproduct1() {
		return driver.findElement(searchproduct1);
	}
	
	public static WebElement addcart() {
		return driver.findElement(addtocart);
	}
	public static WebElement Searchproduct2() {
		return driver.findElement(searchproduct2);
	}
	public static WebElement clickcartbutton() {
		return driver.findElement(cartbutton);
	}
	public static WebElement closecart() {
		return driver.findElement(closecart);
	}
}


