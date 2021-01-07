package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexecution {
	public WebDriver driver;
static
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	
}
@Parameters({"browsername"})
@Test

	public void test(String browser)
	{
	
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
driver.findElement(By.cssSelector("input[value='Go']")).click();
driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
}
@AfterMethod

	public void closeapp()
	{
		driver.close();
	}

}
