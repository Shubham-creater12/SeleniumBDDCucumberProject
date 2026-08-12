package handeling_ExcelSheets;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile = new File("E:\\ExcelSheets\\Batch_4To6_WeekDays.xlsx");

		Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		
		for(int i = 0 ; i<=2;i++) 
		{
			String Myvalue = MySheet.getRow(i).getCell(0).getStringCellValue();
		
			System.out.println(Myvalue);
		
		}

		
		
	}

}
