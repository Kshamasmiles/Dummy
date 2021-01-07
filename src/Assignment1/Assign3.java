package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 
{

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	
		driver.findElement(By.id("email")).sendKeys("kshama.kekuda@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("lks");
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();

	}

	}


