package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.vtiger.com/vtigercrm/");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

/*driver.findElement(By.id("username")).clear();
driver.findElement(By.id("password")).clear();
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("admin");
driver.findElement(By.xpath("//button[@type='submit']")).click();*/

WebElement ele = driver.findElement(By.id("username"));
ele.clear();

WebElement ala=driver.findElement(By.id("password"));
ala.clear();
Thread.sleep(3000);
ele.sendKeys("admin");
Thread.sleep(3000);

ala.sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.close();
	}

}
