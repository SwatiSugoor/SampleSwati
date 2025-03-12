Feature: 
Background:
Given User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage

@SmokeTest 

Scenario: To check title of the Application
Then User verifies the title of the Webpsge
And User closes the Browser

@SystemTest

Scenario Outline: To check login functionality of the application
When User enters '<Username>'the username
And User enters '<Password>'the password
And User clicks on the login button
Then User verifies the profile Account
And User closes the Browser
Examples: 
|Username|Password|
|Admin|admin123|
|Admin|admin123|
