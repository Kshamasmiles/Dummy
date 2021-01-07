package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assign11a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("8095191105");

	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pra2pmmvsk");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//span[@class='_2I9KP_'][4]"));//Women section
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();//moves to sarees element
		Thread.sleep(3000);
	driver.findElement(By.linkText("Sarees")).click();
	Thread.sleep(3000);
	driver.close();
		
	}

}
