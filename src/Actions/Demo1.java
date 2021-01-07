package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://luxire.com/");
		WebElement ele = driver.findElement(By.linkText("Account"));
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
