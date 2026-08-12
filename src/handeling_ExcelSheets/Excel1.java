package handeling_ExcelSheets;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		File myfile = new File("E:\\ExcelSheets\\Batch_4To6_WeekDays.xlsx");

		Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	
		double MyValue = MySheet.getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println(MyValue);
		
		String Myvalue = MySheet.getRow(0).getCell(1).getStringCellValue();
	
		System.out.println(Myvalue);
		
		
		boolean Myvalue2 = MySheet.getRow(0).getCell(2).getBooleanCellValue();
	
		System.out.println(Myvalue2);
		
		System.out.println(MySheet.getRow(4).getCell(1).getStringCellValue());
	}

}
