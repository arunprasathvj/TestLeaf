package fc_Utills;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtills {

	public static XSSFWorkbook workbook ;
	public static XSSFSheet sheet ;
	public ExcelUtills (String excelpath , String sheetname){
	
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
			
		}
		
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}

	}
public int  getrowcount () {
	int rowcount = 0;
	 try {
		 
	     rowcount = sheet.getPhysicalNumberOfRows();
		// System.out.println(rowcount);
	 }
	 
	 catch(Exception e){
		 System.out.println(e.getMessage());}
return rowcount;
	
}
public int getcolumcount () {
	
	int columcount=0;
	try {
		
		columcount = sheet.getRow(0).getPhysicalNumberOfCells();
	//	System.out.println(columcount);
		
	
	}
	
	
	
	
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return columcount;
	
}
public static String  getstringcelldata(int rownum , int cellnum ) {
	String celldata  = null;
	try {
		
		celldata = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	return celldata;
}
public static void getcelldatanumber(int rownum , int cellnum) {
	
	try {
		double celldatanumber = sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
		System.out.println(celldatanumber);
		
	}
	
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
