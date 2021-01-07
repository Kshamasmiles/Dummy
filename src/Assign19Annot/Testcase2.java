package Assign19Annot;

import java.util.Set;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass{

	@Test
	public void testcase2()
	{
	Loginpage2 l=new Loginpage2(driver);
	l.searchtxtbox("phone");
	l.searchbtn();
	Homepage2 h=new Homepage2(driver);
	h.phonebtn();
	
	Cartpage2 c=new Cartpage2(driver);
	Set<String> childwindow = driver.getWindowHandles();
	for(String b:childwindow)
	{
		driver.switchTo().window(b);
	}
	c.addingcart();
	
}
}

