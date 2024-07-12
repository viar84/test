package GenericUtilities;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{

	public String getExcelData(String sheetName, int rNo,int cNo) throws EncryptedDocumentException, IOException
	{
		  FileInputStream fisExecel = new FileInputStream("./src/test/resources/ExcelInputData.xlsx");
		    
	       Workbook wbook = WorkbookFactory.create(fisExecel);
		    Sheet sht = wbook.getSheet(sheetName);
		    Row row = sht.getRow(rNo);
		    Cell cell = row.getCell(cNo);
		    String strValue =  cell.getStringCellValue() ;
		    return strValue;
	}
}