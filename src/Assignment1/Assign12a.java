package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign12a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(4000);
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
	
		for(WebElement b:ele)
		{
			System.out.println(b.getText());
		}
		System.out.println(ele.size());
		
		Thread.sleep(3000);
		driver.close();
	}

}
