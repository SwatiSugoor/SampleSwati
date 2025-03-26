package com.bunnycart.stepdefinition;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Pages.BunnycartPage5;

import io.cucumber.java.en.And;

public class S5Signout {
	@And("User clicks on signout button")
	public void user_clicks_on_signout_button() throws InterruptedException {
	    BunnycartPage5.signoutlink();
	    Thread.sleep(6000);
	    Browser.closeBrowser();
	}
}
