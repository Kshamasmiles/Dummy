package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assign11b {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.name("addresstype"));
	
		Select s=new Select(ele);
		
	s.selectByVisibleText("Testing");
	
	WebElement ele1 = driver.findElement(By.id("Cucumber"));
	Actions a=new Actions(driver);
	a.doubleClick(ele1).perform();
	Thread.sleep(4000);
	driver.close();
	}

}
