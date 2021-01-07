package Assign19Annot;
import java.util.Set;

import org.testng.annotations.Test;
public class Testcase1 extends Baseclass {
@Test
public void testcase1()
{
	Loginpage1 l=new Loginpage1(driver);
	l.searchtxtbox("dress");
	l.searchbtn();
	Homepage1 h=new Homepage1(driver);
	h.dressbtn();
	
	Cartpage1 c=new Cartpage1(driver);
	Set<String> childwindow = driver.getWindowHandles();
	for(String b:childwindow)
	{
		driver.switchTo().window(b);
	}
	c.addingcart();
	
}
}
