package webelementttt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.xpath("//div[text()='Login ']"));
		if(username.isEnabled())
		{
			username.click();
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
	
		}
	}

}
