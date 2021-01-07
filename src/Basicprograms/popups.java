package Basicprograms;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	driver.findElement(By.linkText("Selenium Training")).click();	
	WebElement ele1 = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
	a.doubleClick(ele1).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
	Thread.sleep(3000);
 Alert q = driver.switchTo().alert();
 System.out.println(q.getText());
q.dismiss();
driver.close();
	}

}
