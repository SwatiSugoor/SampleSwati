package com.bunnycart.Pages;

import com.bunnycart.Browser.Browser;
import com.aventstack.extentreports.Status;
import com.bunnycart.Locators.BunnycartPage1objects;
import com.bunnycart.Screenshot.Capture;

public class Bunnycartpage1 extends Browser {
	
	  static {
	        init("BunnyCartPage1_Report"); 
	    } 

    public static void clickCreateAccount() {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Click create account link");  
        logger1.log(Status.INFO, "Clicking create account link");  
        
        try {
          
            BunnycartPage1objects.clickcreateAccount().click();
            logger1.log(Status.INFO, "Successfully clicked the create account link");
        } catch (Exception e) {
           
            System.out.println(e);
            logger1.log(Status.FAIL, "Failed to click the create account link");
        }
        extent.flush();  
    }

    public static void firstName(String data) {
        extent.attachReporter(reporter); 
        logger1 = extent.createTest("Enter the First Name");  
        logger1.log(Status.INFO, "Entering the First Name");  
        
        try {
           
            BunnycartPage1objects.enterFirstName().clear();
            BunnycartPage1objects.enterFirstName().sendKeys(data);
            logger1.log(Status.PASS, "Successfully entered the first name");
        } catch (Exception e) {
           
            System.out.println(e);
            logger1.log(Status.FAIL, "Failed to enter the first name");
        }
        extent.flush();  
    }

   
    public static void lastName(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Last Name");  
        logger1.log(Status.INFO, "Entering the Last Name"); 
        
        try {

            BunnycartPage1objects.enterlastName().clear();
            BunnycartPage1objects.enterlastName().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the last name");
        } catch (Exception e) {
           
            System.out.println(e);
            logger1.log(Status.FAIL, "Failed to enter the last name");
        }
        extent.flush();  
    }

    public static void emailField(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Email");  
        logger1.log(Status.INFO, "Entering the Email");  
        
        try {
           
            BunnycartPage1objects.enterEmail().clear();
            BunnycartPage1objects.enterEmail().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the email");
        } catch (Exception e) {
           
            System.out.println("Email " + e);
            logger1.log(Status.FAIL, "Failed to enter the email address");
        }
        extent.flush();  
    }

   
    public static void password(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Password");  
        logger1.log(Status.INFO, "Entering the Password");  
        
        try {
            
            BunnycartPage1objects.enterPassword().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the password");
        } catch (Exception e) {
            
            System.out.println("Password " + e);
            logger1.log(Status.FAIL, "Failed to enter the password");
        }
        extent.flush();  
    }

    public static void confirmPassword(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Confirm Password");  
        logger1.log(Status.INFO, "Entering the Confirm Password");  
        
        try {
           
            BunnycartPage1objects.enterConfirmPassword().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the confirmation password");
        } catch (Exception e) {
           
            System.out.println("ConfirmPassword " + e);
            logger1.log(Status.FAIL, "Failed to enter the confirmation password");
        }
        extent.flush(); 
    }

    public static void mobileNumber(String str) {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Enter the Mobile Number");  
        logger1.log(Status.INFO, "Entering the Mobile Number");  
        
        try {
            BunnycartPage1objects.enterNumber().sendKeys(str);
            logger1.log(Status.PASS, "Successfully entered the mobile number");
        } catch (Exception e) {
            
            System.out.println("Mobile number " + e);
            logger1.log(Status.FAIL, "Failed to enter the mobile number");
        }
        extent.flush();  
    }

 
    public static void create() {
        extent.attachReporter(reporter);  
        logger1 = extent.createTest("Click Create Button");  
        logger1.log(Status.INFO, "Clicking Create Button");  
        
        try {
            
            BunnycartPage1objects.create().click();
            logger1.log(Status.PASS, "Successfully clicked the create button");
            
          
            logger1.addScreenCaptureFromPath(Capture.screenShot("Create Button"));
        } catch (Exception e) {
           
            System.out.println("Page1 - Create Account");
            logger1.log(Status.FAIL, "Failed to click the create button");
        }
        extent.flush();  
    }

    
    public static void errorMessage() {
    	
         System.out.println("Error in the text");
        logger1.log(Status.FAIL, "Error in the text");
    }
}