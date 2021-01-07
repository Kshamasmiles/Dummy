package Basicprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeintoexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./Excel/exceldata.xlsx");
		  Workbook wb = WorkbookFactory.create(f);
		  Sheet sh = wb.getSheet("Sheet1");
		  Row r = sh.getRow(2);
		 Cell c = r.getCell(2);
		  c.setCellValue("JavaSelenium");
		  //Write the data in excel
		  FileOutputStream fo=new FileOutputStream("./Excel/exceldata.xlsx");
		  wb.write(fo);
		  wb.close();
	}

}
