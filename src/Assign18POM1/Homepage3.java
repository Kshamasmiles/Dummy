package Assign18POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage3 {
	@FindBy(xpath="//span[contains(text(),'AVITA E')]")
	private WebElement laptop;
	Homepage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void laptopbtn()
	{
		laptop.click();
	}
}
