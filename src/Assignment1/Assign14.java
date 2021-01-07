package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("container_users")).click();
		Thread.sleep(7000);
	driver.findElement(By.xpath("//div[text()='New User']")).click();
	Thread.sleep(2000);
driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("kshama");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[contains(@class,'closeButton hideButton_panelContainer')]")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
Thread.sleep(3000);
driver.close();
	}

}
