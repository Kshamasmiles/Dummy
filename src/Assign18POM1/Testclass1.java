package Assign18POM1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Loginpage1 l=new Loginpage1(driver);
		l.searchtxtbox("dress");
		l.searchbtn();
		
		Homepage1 h=new Homepage1(driver);
		h.dressbtn();
		
		Cartpage1 c=new Cartpage1(driver);
		Set<String> childwindow = driver.getWindowHandles();
		for(String b:childwindow)
		{
			driver.switchTo().window(b);
		}
		c.addingcart();
	}

}
