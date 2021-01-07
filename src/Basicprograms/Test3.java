package Basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://touch.facebook.com/login/?next&ref=dbl&fl&refid=8");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
		driver.manage().window().maximize();
	}

}
