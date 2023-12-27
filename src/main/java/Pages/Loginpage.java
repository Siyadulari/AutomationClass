package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseCLASS.baseclass;

public class Loginpage  extends baseclass{

	public Loginpage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email") WebElement emailId;
	@FindBy(id="pass") WebElement password;
	@FindBy(id="send2") WebElement btSignIn;
	@FindBy(xpath="//span[text()=' Customer Login']") WebElement customersLoginText;
	
	public Homepage verifyLogin() throws IOException {
		
		emailId.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		
		btSignIn.click();
		
		return new Homepage();
		
	}
	
	public String verifyLoginText() {
		return customersLoginText.getText() ;
		
	
		
		
		
		
		
	}
}
