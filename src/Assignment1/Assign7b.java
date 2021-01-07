package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/login/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.findElement(By.name("identifier")).sendKeys("kshama.kekuda@gmail.com");
driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();

	}

}
