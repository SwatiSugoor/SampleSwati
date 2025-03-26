package com.bunnycart.stepdefinition;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bunnycart.Browser.Browser;
import com.bunnycart.Pages.BunnycartPage2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
public class S2SiginAddtocart {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
	    Browser.openBrowser("Chrome");
	}
	@And("User navigates to the {string} webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	    Browser.navigateToUrl("https://www.bunnycart.com/");
	}
	@When("User clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
	    BunnycartPage2.openSignInPage();
	}
	@And("User enters the Sign in credentials")
	public void user_enters_the_sign_in_credentials(DataTable dataTable) throws Exception {
		
			List<List<String>> credentials = credentials("D:\\NewEclipseFile\\New\\New\\src\\test\\resources\\Bunnycartdata.xlsx");
			dataTable = DataTable.create(credentials);
			System.out.println("Email Entered: " + dataTable.cell(1, 0));
			System.out.println("Password Entered: " + dataTable.cell(1, 1));
			
			BunnycartPage2.inputEmail(dataTable.cell(1, 0)); 
			BunnycartPage2.inputPassword(dataTable.cell(1, 1));
	}		
	       public static List<List<String>> credentials(String excelFilePath) throws Exception {
			List<List<String>> credentials = new ArrayList<>();
			FileInputStream file = new FileInputStream(new File(excelFilePath));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				List<String> rowData = new ArrayList<>();
				if(row!=null) {
					for(int j=0;j<row.getLastCellNum();j++) {
						Cell cell=row.getCell(j);
						if(cell!=null) {
							rowData.add(cell.getStringCellValue());
						}else {	
							rowData.add("");
						}
					}
				}
			credentials.add(rowData);
			}
		workbook.close();
		return credentials;
		}

	@And("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	    BunnycartPage2.clickSignInButton();
	}
	@And("User search for a product {string}")
	public void user_search_for_a_product(String string) throws InterruptedException {
		Thread.sleep(2000);
	    BunnycartPage2.searchForProduct("aquatic plants");
	}
	@And("User select a product")
	public void the_user_select_a_product() throws InterruptedException {
		Thread.sleep(2000);
	    BunnycartPage2.selectFirstProduct();
	}
	
	@And("user selects  quantity of {string}")
	public void user_selects_quantity_of(String string) {
	    BunnycartPage2.selectProductQuantity();
	}
	
	@And("User add a product to cart")
	public void user_add_a_product_to_cart() {
	    BunnycartPage2.addProductToCart();
	}
	@And("User verifies the product and close cart")
	public void user_verifies_the_product_and_close_cart() throws InterruptedException {
	    BunnycartPage2.openShoppingCart();
	    Thread.sleep(2000);
	    BunnycartPage2.closeShoppingCart();
	}
	@And("User close the browser")
	public void user_close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		Browser.closeBrowser();
	}

}

