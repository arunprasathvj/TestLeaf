package fc_Pages;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] arg)  throws IOException {
		
		FileOutputStream fls = new FileOutputStream("./data/TC_002.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet2");
		for (int i = 0; i<5;i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j= 0 ; j<5;j++)  {
				 XSSFCell cell=row.createCell(j);
				 cell.setCellValue("Prasath");
				
				
				
			}
			
			
		}

		wb.write(fls);
		fls.close();
	
		System.out.println("pass");
	}
	
}
