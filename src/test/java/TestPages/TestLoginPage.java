package TestPages;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseCLASS.baseclass;
import Pages.Homepage;
import Pages.Loginpage;


  public class TestLoginPage extends baseclass {
   Homepage homePage;
	Loginpage loginPage;
	public TestLoginPage() throws IOException {
		super();
	
	}
     @BeforeMethod
     public void lounchBrowser() throws IOException {
   	  initialBrowser();
      homePage=new Homepage();
      loginPage= new Loginpage();
   	}
    
	@AfterMethod
	public void browserClose () throws InterruptedException {
        closeBrowser();
        
	} 
	@Test
	 public void testLogin() throws IOException {
        
	 homePage.verifysingIn();
	loginPage.verifyLogin ();

	}
	
	@Test
	public void testCustomerLoginText() throws IOException {
		homePage.verifysingIn();
		Assert.assertEquals(loginPage.verifyLoginText(), "Customer Login");
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
	}
