package Assign18POM1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Loginpage3 l=new Loginpage3(driver);
		l.searchtxtbox("laptop");
		l.searchbtn();
		
		Homepage3 h=new Homepage3(driver);
		h.laptopbtn();
		
		
		Cartpage3 c=new Cartpage3(driver);
		Set<String> childwindow = driver.getWindowHandles();
		for(String b:childwindow)
		{
			driver.switchTo().window(b);
		}
		c.addingcart();
	}
	}


