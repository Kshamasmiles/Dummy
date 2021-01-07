package Assignment1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign15b {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		// WebElement ele = driver.findElement(By.linkText("About Us"));
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1000)");
		//j.executeScript("arguments[0].scrollIntoView()",ele);
		driver.findElement(By.linkText("Compiler")).click();
		driver.findElement(By.id("java")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn')][2]")).sendKeys("‪G:\\Desktop\\FB_MC.java");
//	Thread.sleep(9000);
//		driver.close();
	}
}
