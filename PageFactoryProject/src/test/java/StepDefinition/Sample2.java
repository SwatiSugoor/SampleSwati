package StepDefinition;

import org.testng.Assert;

import Browser.browser;
import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.*;

public class Sample2 {
	
	

	@When("User Enters {string} username")
	public void user_enters_username(String string) throws InterruptedException {
//		Thread.sleep(5000);
		page1.enterusername(string);
	}

	@And("User Enters {string} password")
	public void user_enters_password(String string) {
		page1.enterpassword(string);
	}

	@And("User Clicks login button")
	public void user_clicks_login_button() {
		page1.click();
	}

	@Then("User checks the functionality of login")
	public void user_checks_the_functionality_of_login() throws InterruptedException {
		Assert.assertEquals(page2.Username(), "manda user");
	}

}


/*package StepDefinition;

import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.util.*;
 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pages.page1;

import java.io.File;
 
import io.cucumber.datatable.DataTable;
 

public class Sample2 {
@When("User enters the login Credentials")
public void user_enters_the_login_credentials(DataTable dataTable) throws Exception {
	List<List<String>> credentials = credentials(
			"C:\\Users\\KSEAB\\eclipse-workspace\\PageFactoryProject\\src\\test\\resources\\TestData123.xlsx");
	dataTable = DataTable.create(credentials);
	System.out.println(dataTable.cell(0, 0));
	System.out.println(dataTable.cell(0, 1));
	
	page1.enterUsername(dataTable.cell(0, 0));
	page1.enterPassword(dataTable.cell(0, 1));
	
}
public static List<List<String>> credentials(String excelFilePath) throws Exception {
	List<List<String>> credentials = new ArrayList<>();
	FileInputStream file = new FileInputStream(new File(excelFilePath));
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	Sheet sheet = workbook.getSheetAt(0);
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
}*/