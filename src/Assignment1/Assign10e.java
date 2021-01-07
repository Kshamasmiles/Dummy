package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign10e {

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
		List<WebElement> options = s.getOptions();//gets options of Drop down and stores in a List collections
		int count = options.size();//counts the number of options in drop down
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		
			WebElement c = options.get(i);
			System.out.println(c.getText());
		}
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
