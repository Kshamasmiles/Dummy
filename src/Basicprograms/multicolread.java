package Basicprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multicolread {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
FileInputStream f=new FileInputStream("./Excel/exceldata.xlsx");

driver.get("");
	}

}
