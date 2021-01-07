package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign10d {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Desktop/food.html");
		WebElement ele = driver.findElement(By.id("Maiyyas"));
		Select s=new Select(ele);
		s.selectByValue("i");
		s.selectByIndex(3);
		s.selectByVisibleText("biryani");
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		Thread.sleep(3000);
		driver.close();
	}

}
