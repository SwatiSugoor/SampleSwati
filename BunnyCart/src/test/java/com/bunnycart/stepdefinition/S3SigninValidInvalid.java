package com.bunnycart.stepdefinition;
import com.bunnycart.Pages.BunnycartPage3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class S3SigninValidInvalid {
	
		@When("User clicks the link homepagesignin an account")
		public void user_clicks_the_link_homepagesignin_an_account() throws InterruptedException {
			Thread.sleep(5000);
		    BunnycartPage3.homepagesignin();
		}

		@And("User enters a invalid {string} in email textbox")
		public void user_enters_a_invalid_in_email_textbox(String string) throws InterruptedException {
			BunnycartPage3.signinmail("");
		}

		@And("User enters a valid {string} in password textbox")
		public void user_enters_a_valid_in_password_textbox(String string) throws InterruptedException {
			BunnycartPage3.signinpass("Swati@2002");
		}

		@And("User clicks signin  account button.")
		public void user_clicks_signin_account_button() {
		    BunnycartPage3.signinbutton();
		}
		
	     
		@When("User re-enters a email with valid data {string}")
		public void user_re_enters_a_email_with_valid_data(String string) {
			BunnycartPage3.signinmail("sugoorswati1@gmail.com");
		}

		@And("User clicks signin button.")
		public void user_clicks_signin_button() {
			 BunnycartPage3.signinbutton();
		}

	}

