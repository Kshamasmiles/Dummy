package Assign19Annot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage3 {
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtb;
@FindBy(xpath="//input[@type='submit']")
private WebElement gobtn;
Loginpage3(WebDriver driver)
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
