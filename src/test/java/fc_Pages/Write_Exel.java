package fc_Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Exel {

	public static void main(String[] args) {
             
		try {
			
			File src = new File ("./data/TC001.xlsx");
			FileInputStream fle = new FileInputStream (src);
			XSSFWorkbook wb =  new XSSFWorkbook (fle);
			XSSFSheet sh1 =wb.getSheet("Sheet1");
			System.out.println( sh1.getRow(0).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			System.out.println( sh1.getRow(1).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			System.out.println( sh1.getRow(2).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			
			sh1.getRow(0).createCell(2).setCellValue("Arun");
			sh1.getRow(1).createCell(2).setCellValue("prasath");
			
		    FileOutputStream out = new FileOutputStream ("./data/TC001.xlsx");
		    wb.write(out);
		    wb.close();
		}
		catch( Exception e) {
			

			   System.out.println(e.getMessage());
		}
	}

	
	
}
