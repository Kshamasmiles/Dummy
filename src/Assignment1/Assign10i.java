package Assignment1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign10i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Desktop/food.html");
		WebElement ele = driver.findElement(By.id("Maiyyas"));
		Select s=new Select(ele);
		s.selectByValue("i");
		s.selectByIndex(3);
		s.selectByVisibleText("biryani");
		 List<WebElement> options = s.getOptions();
		 System.out.println("Options selected");
		 ArrayList a=new ArrayList();
		 for(WebElement b:options)
		 {
			 String text = b.getText();
			 System.out.println(text);
			 a.add(text);
		 }
		if(a.contains("biryani"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}

}
