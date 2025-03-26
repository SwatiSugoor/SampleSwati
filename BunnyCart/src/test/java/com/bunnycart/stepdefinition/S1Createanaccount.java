package com.bunnycart.stepdefinition;

import org.testng.Assert;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Locators.BunnycartPage1objects;
import com.bunnycart.Pages.Bunnycartpage1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S1Createanaccount {

@Given("User opens the browser")
public void user_opens_the_browser() throws Exception {
    Browser.openBrowser("chrome");
}
@And("User navigates to the application Url {string}")
public void user_navigates_to_the_application_url(String string) throws Exception {
    Browser.navigateToUrl("https://www.bunnycart.com/");
}
@When("User clicks the link Create an account")
public void user_clicks_the_link_create_an_account() {
    Bunnycartpage1.clickCreateAccount();
}
@And("User enters the valid {string} in firstname textbox")
public void user_enters_the_valid_in_firstname_textbox(String string) {
    Bunnycartpage1.firstName("Swati");
}
@And("User enters the valid {string} in lastname textbox")
public void user_enters_the_valid_in_1stname_textbox(String string) {
    Bunnycartpage1.lastName("Sugoor");
}
@And("User enters the invalid {string} in email textbox")
public void user_enters_the_invalid_in_email_textbox(String string) {
    Bunnycartpage1.emailField("sugoorswati1gmail.com");
}
@And("User enters the valid {string} in password textbox")
public void user_enters_the_valid_in_password_textbox(String string) {
    Bunnycartpage1.password("Swati@2002");
}
@And("User enters the valid {string} in confirm password textbox")
public void user_enters_the_valid_in_confirm_password_textbox(String string) {
    Bunnycartpage1.confirmPassword("Swati@2002");
}
@And("User enters the valid {string} number")
public void user_enters_the_valid_number(String string) {
   Bunnycartpage1.mobileNumber("6363443851");
}
@And("User clicks Create an account button.")
public void user_clicks_create_an_account_button() {
    Bunnycartpage1.create();
}
@Then("User verifies the error message displayed under the email textbox")
public void user_verifies_the_error_message_displayed_under_the_email_textbox() throws InterruptedException {
	Thread.sleep(2000);
    String errorMessage=BunnycartPage1objects.geterrorMessage().getText();
    Assert.assertTrue(errorMessage.contains("Please enter a valid email address"));
}
@When("User re-enters the email with valid data {string}")
public void user_re_enters_the_email_with_valid_data(String string) {
   Bunnycartpage1.emailField("sugoorswati1@gmail.com");
}
@And("User closes the browser")
public void user_closes_the_browser() throws InterruptedException {
	Thread.sleep(6000);
    Browser.closeBrowser();
}

}