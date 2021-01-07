package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign9c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();//Create Account button object
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.id("day"));//Date dropdown
		Thread.sleep(4000);
		Select s=new Select(ele);
		Thread.sleep(4000);
		s.selectByIndex(10);
		Thread.sleep(4000);
		
		WebElement ele1 = driver.findElement(By.id("month"));//Month drop down
		Thread.sleep(4000);
		Select s1=new Select(ele1);
		Thread.sleep(4000);
		s1.selectByValue("12");
		Thread.sleep(4000);
		
		WebElement ele2 = driver.findElement(By.id("year"));//year
		Thread.sleep(4000);
		Select s2=new Select(ele2);
		Thread.sleep(4000);
		s2.selectByVisibleText("1994");
		Thread.sleep(4000);
		
driver.close();
		
	}

}
