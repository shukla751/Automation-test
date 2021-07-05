package Com.Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataprovider {
	
	XSSFWorkbook wb;
	public ExcelDataprovider()
	{
		
		File src = new File("./TestData/Data.XLSX");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb =new XSSFWorkbook(fis);
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getstringData(String SheetName,int row,int column)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
		
	}
	
	public double getstringDatanumber(String SheetName,int row,int column)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(column).getNumericCellValue();
		
		
	}
	
	
	


}
