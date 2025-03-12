package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;
import Locators.Page2Objects;

public class page2 extends browser {
	
		public static Page2Objects obj;
		
		
		public static String Username() throws InterruptedException
		{
			obj=new Page2Objects();
			 wait=new WebDriverWait(browser.driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(obj.dashboardelement));
			
			return obj.dashboardelement.getText();
		}
	
		//clicking method
	
		public static void optionclick(String str) 
		{
			try{
				for(WebElement e:obj.list)
				{
					if(e.getText().equalsIgnoreCase(str))
					{	e.click();
						break; }
				}
				}
			
			catch(Exception E)
			{
				System.out.println("Click :"+E);
			}
		}
}

