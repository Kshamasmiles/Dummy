package Assign18POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage3 {
	@FindBy(xpath="//input[@value='Add to Cart']")
	private WebElement cartbtn;

	Cartpage3(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void addingcart()
	{
		cartbtn.click();
	}
}
