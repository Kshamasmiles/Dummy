package Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign8b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	}

}
