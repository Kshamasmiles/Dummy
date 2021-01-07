package Assign18POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
@FindBy(xpath="//span[contains(text(),'Synthetic a-line')]")
private WebElement dress;

Homepage1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void dressbtn()
{
	dress.click();
}
}
