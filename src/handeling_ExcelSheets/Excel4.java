package handeling_ExcelSheets;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile = new File("E:\\ExcelSheets\\Batch_4To6_WeekDays.xlsx");

		Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		for(int i = 0 ;i<=3;i++) {
			for(int j = 0 ;j<=2;j++) {
				CellType type = MySheet.getRow(i).getCell(j).getCellType();
			
				if(type==CellType.STRING) {
					String value = MySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value +" ");
				
				}
				else if(type==CellType.NUMERIC) {
					double value = MySheet.getRow(i).getCell(j).getNumericCellValue();
				
					System.out.print(value+" ");
				}
			
				else {
					boolean value = MySheet.getRow(i).getCell(j).getBooleanCellValue();
				
					System.out.print(value+" ");
				}
			}
			System.out.println();
		}

	}

}
