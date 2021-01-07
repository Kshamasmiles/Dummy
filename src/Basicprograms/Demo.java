package Basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");

		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new FirefoxDriver();
		
		driver.get("https://www.zomato.com/bangalore");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver1.get("https://www.zomato.com/bangalore");
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getTitle());

	}

}
