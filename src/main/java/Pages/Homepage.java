package Pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseCLASS.baseclass;

public  class Homepage extends baseclass 
{
     public Homepage()throws IOException {
    	 super();
    	PageFactory.initElements(driver, this); 
    	
      }
     
    
     @FindBy(xpath ="//a[@class='logo']/img") WebElement logoImg;
     @FindBy(xpath= "(//li[@class='authorization-link'])[1]") WebElement signIn;	 
     @FindBy(xpath="(//span[text()='Create an Account'])[1]") WebElement createNewAccount;
     @FindBy(xpath="(//a[text()='Create New Customer'])[1]") WebElement createCostomer;
     public  String verifyPageTitle()  {
    	 
   return  driver.getTitle();
     
     }
     
     public boolean verifyLogo() {
    	 return logoImg.isDisplayed();
     }
     
     public   Loginpage   verifysingIn() throws IOException {
    	 signIn.click();
         return new Loginpage();
 
     }
     
     public CreateNewAccountPage verifyCreateNewAccount() {
        createNewAccount.click(); 
       
     createCostomer.click();
     return new CreateNewAccountPage();
     
     
     
		
	}   
}