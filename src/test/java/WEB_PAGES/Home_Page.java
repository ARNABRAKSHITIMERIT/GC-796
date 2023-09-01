package WEB_PAGES;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory ;

public class Home_Page { WebDriver ldriver ;

public Home_Page(WebDriver rdriver) { ldriver = rdriver ; PageFactory.initElements(rdriver , this) ; }

@FindBy(xpath = "//img[@alt='avatar']") WebElement Profile_Name_1 ;	
@FindBy(xpath = "//button[contains(text(),'sign out')]") WebElement Sign_Out_1 ;
@FindBy(xpath = "//span[contains(text(),'administrator')]") WebElement Role_1 ;
@FindBy(xpath = "//body/div[@id='__next']/div[2]/nav[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]/div[1]/div[1]") WebElement Profile_Name_2 ;	
@FindBy(xpath = "//button[contains(text(),'sign out')]") WebElement Sign_Out_2 ;
@FindBy(xpath = "//span[contains(text(),'project manager')]") WebElement Role_2 ;
@FindBy(xpath = "//body/div[@id='__next']/div[2]/nav[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]/div[1]/div[1]") WebElement Profile_Name_3 ;	
@FindBy(xpath = "//button[contains(text(),'sign out')]") WebElement Sign_Out_3 ;
@FindBy(xpath = "//span[contains(text(),'client')]") WebElement Role_3 ;

public void Click_On_Profile_Name_1 () { Profile_Name_1.click() ; }
public void Click_On_Sign_Out_1 () { Sign_Out_1.click() ; }
public String Click_On_Role_1 () { String Role_Administrator = Role_1.getText() ; return  Role_Administrator ; }
public void Click_On_Profile_Name_2 () { Profile_Name_2.click() ; }
public void Click_On_Sign_Out_2 () { Sign_Out_2.click() ; }
public String Click_On_Role_2 () { String Role_Project_Manager = Role_2.getText() ; return Role_Project_Manager ; }
public void Click_On_Profile_Name_3 () { Profile_Name_3.click() ; }
public void Click_On_Sign_Out_3 () { Sign_Out_3.click() ; }
public String Click_On_Role_3 () { String Role_Client = Role_3.getText() ; return Role_Client ; }}
