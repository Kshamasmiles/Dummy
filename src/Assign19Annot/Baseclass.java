package Assign19Annot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
public 	WebDriver driver;
	@BeforeMethod 
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		
	}
}
