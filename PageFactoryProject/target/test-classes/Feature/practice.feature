Feature: Login page automation of saucedemo app
Scenario: check login is successful with valid creds
Given User is on login page
When User enters valid username and password
And Clicks on login Button
Then User is navigated to Home page
And Close the browser