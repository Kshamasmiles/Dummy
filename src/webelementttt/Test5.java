package webelementttt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		int x1 = username.getLocation().getX();
		System.out.println(x1);
		WebElement password=driver.findElement(By.name("pwd"));
		int x2 = password.getLocation().getX();
		System.out.println(x2);
		
		if(x1==x2)
		{
			System.out.println("Pass: UN and PWD test fields are aligned");
		}
		else
			System.out.println("Fail: UN and PWD test fields are NOT aligned");

		driver.close();
	
	}

}
