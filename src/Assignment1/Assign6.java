package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("kshama.kekuda@gmail.com");
driver.findElement(By.id("pass")).sendKeys("parthivlak");
driver.findElement(By.xpath("//button[@name='login']")).click();
String url = driver.getCurrentUrl();
System.out.println(url);
String title = driver.getTitle();
System.out.println(title);
Thread.sleep(3000);
		
//validation
if(title.equals("Facebook"))
{
	System.out.println("Pass:Home Page displayed");
		}
else
{
	System.out.println("Fail:Home Page not displayed");
	
}
driver.close();

		



	}

}
