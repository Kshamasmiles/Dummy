package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign10g {

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
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();//gets options of Drop down and stores in a List collections
		System.out.println(options.size());//counts the number of options in drop down
	ArrayList a=new ArrayList();
	
	System.out.println("**Before sorting**");
		for(WebElement b:options)
		{
		String text = b.getText();	
		
		

		System.out.println(text);
		a.add(text);
		}
		System.out.println("**After sorting**");
		Collections.sort(a);
		for(Object c:a)
		{
			System.out.println(c);
		}
		
		driver.close();
	}

}
