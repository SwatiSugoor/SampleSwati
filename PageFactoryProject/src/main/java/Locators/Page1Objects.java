package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;

public class Page1Objects extends browser{
	
	public Page1Objects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	public WebElement userName;
	
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(css="[type=\"submit\"]")
	public WebElement loginbutton;
}
	
	


