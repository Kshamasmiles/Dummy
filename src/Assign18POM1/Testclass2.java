package Assign18POM1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Loginpage2 l=new Loginpage2(driver);
		l.searchtxtbox("phone");
		l.searchbtn();
		
		Homepage2 h=new Homepage2(driver);
		h.phonebtn();
		Thread.sleep(7000);
		Cartpage2 c=new Cartpage2(driver);
		Set<String> childwindow = driver.getWindowHandles();
		for(String b:childwindow)
		{
			driver.switchTo().window(b);
		}
		c.addingcart();
	}

}
