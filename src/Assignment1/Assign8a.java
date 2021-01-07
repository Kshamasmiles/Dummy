package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.get("https://mail.google.com/mail/u/0/#inbox");
Thread.sleep(5);
driver.findElement(By.id("identifierId")).sendKeys("kshama.kekuda@gmail.com");
Thread.sleep(5);
//driver.navigate().refresh();
//Thread.sleep(5);
//driver.findElement(By.partialLinkText("Sign")).click();
//Thread.sleep(5);
////driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
//Thread.sleep(5);
//driver.findElement(By.id("identifierId")).sendKeys("kshama.kekuda@gmail.com");
//Thread.sleep(5);
driver.findElement(By.name("password")).sendKeys("pra2pmmvsk");

driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
WebElement searchbox=driver.findElement(By.name("q"));
if(searchbox.isDisplayed())
{
	System.out.println("Searchbox displayed");
}
else
{
	System.out.println("Searchbox not displayed");
}

System.out.println(searchbox.getSize());
System.out.println(searchbox.getLocation().getX());
System.out.println(searchbox.getLocation().getY());


driver.findElement(By.xpath("//img[@class='gb_Ha gbii']")).click();
driver.findElement(By.partialLinkText("gb_Hb")).click();


	
	}

}
