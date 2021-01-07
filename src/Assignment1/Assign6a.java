package Assignment1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.myfitnesspal.com/account/logout");
driver.findElement(By.id("username")).sendKeys("kshama.kekuda@gmail.com");
driver.findElement(By.id("password")).sendKeys("pra2pmmvsk");
driver.findElement(By.xpath("//input[@type='submit'][1]")).click();

System.out.println(driver.getCurrentUrl());

String title=driver.getTitle();
System.out.println(title);

//validation
if(title.equals("Free Calorie Counter, Diet & Exercise Journal | MyFitnessPal.com"))
{
	System.out.println("Pass:Home Page displayed");
}
else
{
System.out.println("Fail: Home page not displayed");
}

	
driver.close();
}
}
