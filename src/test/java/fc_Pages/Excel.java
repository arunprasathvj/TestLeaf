package fc_Pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main( String [] arg ) {
		
		try {
			 
			  
			 
			  File src=new File("./data/TC001.xlsx");
			 
			 
			 
			  FileInputStream fis=new FileInputStream(src);
			 
			 
			 
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
			 
			 
			   XSSFSheet sh1= wb.getSheetAt(0);
			   int rowcount = sh1.getLastRowNum();
			   int columcount = sh1.getRow(0).getLastCellNum();
			   for(int j=1; j<=rowcount;j++)
			   {
				   XSSFRow row = sh1.getRow(j);
				   for(int i = 0; i<columcount;i++) {
					   XSSFCell cel = row.getCell(i);
					   String value = cel.getStringCellValue();
					   System.out.println(value);
					   
				   }
				  wb.close();
			   }
			 
			 
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		}
	
	}
