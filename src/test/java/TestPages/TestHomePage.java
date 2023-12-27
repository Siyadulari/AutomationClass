package TestPages;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseCLASS.baseclass;
import Pages.Homepage;

public class TestHomePage extends baseclass {
   Homepage homepage ;
	public TestHomePage () throws IOException {
	
	  super();
	
	}
	
	@BeforeMethod
	public void lounchBrowser() throws IOException {
	  initialBrowser();
	homepage = new Homepage() ;
	}
	@AfterMethod
    public void browserClose () throws InterruptedException {
        closeBrowser();
	
	}
	

		@Test
	public void testPageTitle() {
		Assert.assertEquals(homepage.verifyPageTitle(),"Magento 2 Commerce (Enterprise) B2B Demo - Magebit" );
		
	}
		@Test
		public void testPageLogo() {
			Assert.assertTrue(homepage.verifyLogo());
	}
		@Test
		public void testSignIn() throws IOException {
			homepage.verifysingIn();
			
	}
		@Test
		public void testCreateAccount() {
			homepage.verifyCreateNewAccount();
		}
	
	
	
		
	
}