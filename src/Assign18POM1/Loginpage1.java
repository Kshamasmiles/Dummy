package Assign18POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtb;
@FindBy(xpath="//input[@type='submit']")
private WebElement gobtn;
Loginpage1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	public void searchtxtbox(String productname)
	{
		
searchtb.sendKeys(productname);
	}
	
	public void searchbtn()
	{
		gobtn.click();
	}
}

