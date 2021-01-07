package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign9a {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();//Create Account button object
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.id("month"));//month drop down button
		Thread.sleep(4000);
		Select s=new Select(ele);
		Thread.sleep(4000);
		List<WebElement> option = s.getOptions();
		
		for(WebElement x:option)
		{
			System.out.println(x.getText());
		}
		System.out.println(option.size());
		Thread.sleep(4000);
	}

}
