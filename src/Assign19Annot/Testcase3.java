package Assign19Annot;

import java.util.Set;

import org.testng.annotations.Test;


	public class Testcase3 extends Baseclass{

		@Test
		public void testcase2()
		{
		Loginpage3 l=new Loginpage3(driver);
		l.searchtxtbox("laptop");
		l.searchbtn();
		Homepage3 h=new Homepage3(driver);
		h.laptopbtn();
		
		Cartpage3 c=new Cartpage3(driver);
		Set<String> childwindow = driver.getWindowHandles();
		for(String b:childwindow)
		{
			driver.switchTo().window(b);
		}
		c.addingcart();
}
}