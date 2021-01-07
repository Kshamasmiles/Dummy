package Basicprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceldatdriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FileInputStream f=new FileInputStream("./Excel/exceldata.xlsx");
		Workbook wb= WorkbookFactory.create(f);
		String s = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.get(s);;
		String username = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.id("username")).sendKeys(username);
		String password = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		wb.close();
	
	}

}
