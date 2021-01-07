package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3a {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(3000);
driver.findElement(By.id("username")).sendKeys("trainee");
driver.findElement(By.name("pwd")).sendKeys("trainee");
Thread.sleep(3000);
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(3000);
driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("trainee");
Thread.sleep(3000);
driver.findElement(By.partialLinkText("Return")).click();
Thread.sleep(3000);
	}

}
