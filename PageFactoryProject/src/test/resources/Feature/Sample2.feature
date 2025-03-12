Feature:

Scenario: To check login functionality of the application
Given User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When User enters the login Credintials
|TestData123.xlsx|
And User clicks on the login button
Then User verifies the profile Account
And User closes the Browser


