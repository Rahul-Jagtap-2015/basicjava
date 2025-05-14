package SeleniumPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\Automation\\rahul\\rahul.xlsx");
	
	Workbook wb=WorkbookFactory.create(fs);
	
//	Sheet s1=new wb.getSheet("rahul");
	
	org.apache.poi.ss.usermodel.Sheet s1=wb.getSheet("rahul");
	
	s1.getRow(0);
	
	s1.getActiveCell();	
	
}
}
