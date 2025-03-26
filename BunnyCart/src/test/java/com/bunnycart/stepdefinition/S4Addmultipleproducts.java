package com.bunnycart.stepdefinition;

import io.cucumber.java.en.Given;
import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import com.bunnycart.Browser.Browser;
import com.bunnycart.Pages.BunnycartPage2;
import com.bunnycart.Pages.BunnycartPage4;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class S4Addmultipleproducts {
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() throws Exception {
	    Browser.openBrowser("chrome");
	    Thread.sleep(2000);
	    Browser.navigateToUrl("https://www.bunnycart.com/");
	}
	@And("User clicks the signin link")
	public void user_clicks_the_signin_link() {
	    BunnycartPage4.openSignInPage();
	}
	@And("User enters the email {string}")
	public void user_enters_the_email(String string) {
	    BunnycartPage4.inputEmail("sugoorswati1@gmail.com");
	}
	@And("User enters the password {string}")
	public void user_enters_the_password(String string) {
	    BunnycartPage4.inputPassword("Swati@2002");
	}
	@And("User clicks the sign-in button")
	public void user_clicks_the_sign_in_button() {
	    BunnycartPage4.clickSignInButton();
	}
	@When("User searches for {string} in the search bar")
	public void user_searches_for_in_the_search_bar(String string) throws InterruptedException {
		Thread.sleep(2000);
	  BunnycartPage4.searchForProduct1("Java Moss");
	    }

	@And("User clicks {string} button.")
	public void user_clicks_button(String string) throws InterruptedException {
		Thread.sleep(3000);
	    BunnycartPage4.addProductToCart();
	}
	@And("User search for {string} in the search bar")
	public void user_search_for_in_the_search_bar(String string) throws InterruptedException {
		 BunnycartPage4.searchForProduct1("Java Fern Philippine");
		Thread.sleep(3000);
	    BunnycartPage4.addProductToCart();
	}

	@And("User verifies the products and close cart")
	public void user_verifies_the_products_and_close_cart() throws InterruptedException {
	    BunnycartPage4.openShoppingCart();
	    Thread.sleep(2000);
	    BunnycartPage4.closeShoppingCart();
	    Browser.closeBrowser();
	}
	


}
