package Basicprograms;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Demo1 {
		static {
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");

			WebDriver driver=new ChromeDriver();
			WebDriver driver1=new FirefoxDriver();
		       }
			static void Testbrowser(WebDriver driver)
			{
				driver.get("https://www.zomato.com/bangalore");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
			
			
		public static void main(String[] args)
		{
			Demo1.Testbrowser(new ChromeDriver());
			//Demo1.Testbrowser(new FirefoxDriver());
			
			WebDriver driver1=new FirefoxDriver();
			Demo1.Testbrowser(driver1);
		
			

		}

	}

