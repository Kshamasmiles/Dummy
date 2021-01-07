package Assign19Annot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {
	@FindBy(xpath="//span[contains(text(),'Panasonic Eluga i7')]")
	private WebElement phone;

	public Homepage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void phonebtn()
	{
		phone.click();
	}
}
