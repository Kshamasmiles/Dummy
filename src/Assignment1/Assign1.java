package Assignment1;
//Program to maximize Facebook app
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Assign1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();//Upcasting--> this object will initialise all non static members in Interface WebDriver
	
	driver.get("https://touch.facebook.com/login/?next&ref=dbl&fl&refid=8");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	

	}

}
