package Excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import Browser.browser;
import Pages.page1;
import Pages.page2;
import ScreenShot.capture;

public class logindata {
	
	public static String[][] readExcel(int sheet) throws Exception {
	    String[][] testData;
	    String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Logintestdata.xlsx";
	    FileInputStream file = new FileInputStream(filePath);
	    XSSFWorkbook wb = new XSSFWorkbook(file);
	    XSSFSheet ws = wb.getSheetAt(sheet); 
	    
	    int rowCount = ws.getLastRowNum();
	    int colCount = ws.getRow(0).getLastCellNum();
	    testData = new String[rowCount][colCount];

	    for (int i = 0; i < rowCount; i++) {
	        Row r = ws.getRow(i + 1);  // Skipping header row
	        for (int j = 0; j < colCount; j++) {
	            if (r.getCell(j) != null) {
	                testData[i][j] = r.getCell(j).toString();
	            } else {
	                testData[i][j] = ""; // Handling empty cells
	            }
	        }
	    }
	    wb.close();
	    return testData;
	}
}