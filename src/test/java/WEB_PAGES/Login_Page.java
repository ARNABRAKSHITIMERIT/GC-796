package WEB_PAGES;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory ;

public class Login_Page { WebDriver ldriver ;

public Login_Page(WebDriver rdriver) { ldriver = rdriver ; PageFactory.initElements(rdriver , this) ; }
	
@FindBy(xpath = "//input[@id='username']") WebElement Email ;
@FindBy(xpath = "//input[@id='password']") WebElement Password ;	
@FindBy(xpath = "//button[@type='submit']") WebElement Sign_In ;	
	
public void Enter_Username_Email (String Email_Input) { Email.sendKeys(Email_Input) ;	}
public void Enter_Password (String Password_Input) { Password.sendKeys(Password_Input) ;	 }	
public void Click_On_Sign_In () { Sign_In.click() ; }}
