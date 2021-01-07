package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://demoapp.skillrary.com/");
driver.findElement(By.cssSelector("a[href='login.php?type=register']")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("admin");
driver.findElement(By.cssSelector("input[type='email']")).sendKeys("kshama.kekuda@gmail.com");
driver.findElement(By.cssSelector("input[name='repassword']")).sendKeys("kjnds");
driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("kekuda");
//driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("ffgdf");
	}

}
