package Basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.ebay.com/");
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();
	}

}
