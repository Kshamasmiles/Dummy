package Basicprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class robotpopup {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
 WebDriver driver=new FirefoxDriver();
 Thread.sleep(3000);
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.linkText("3.141.59")).click();
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	driver.close();
	}

}
