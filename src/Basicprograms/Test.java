package Basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		FirefoxDriver driver2=new FirefoxDriver();
	}

}


