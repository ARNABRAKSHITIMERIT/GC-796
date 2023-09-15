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
@FindBy(xpath = "//a[contains(text(),'create organization')]") WebElement Create_Organization ;
@FindBy(xpath = "//p[contains(text(),'ARNAB_STAGE')]") WebElement Organization_Arnab_Stage ;
@FindBy(xpath = "//p[contains(text(),'iMerit Engine Serverless')]") WebElement Organization_Imerit_Engine_Serverless ;
@FindBy(xpath = "//p[contains(text(),'IMERIT_TEST_ORG_2023.05.28-01.47.18')]") WebElement Organization_Imerit_Test_Org ;
@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]") WebElement Sort_By_Name ;
@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[1]/span[1]") WebElement Name ;


public void Click_On_Profile_Name_1 () { Profile_Name_1.click() ; }
public void Click_On_Sign_Out_1 () { Sign_Out_1.click() ; }
public String Click_On_Role_1 () { String Role_Administrator = Role_1.getText() ; return  Role_Administrator ; }
public void Click_On_Profile_Name_2 () { Profile_Name_2.click() ; }
public void Click_On_Sign_Out_2 () { Sign_Out_2.click() ; }
public String Click_On_Role_2 () { String Role_Project_Manager = Role_2.getText() ; return Role_Project_Manager ; }
public void Click_On_Profile_Name_3 () { Profile_Name_3.click() ; }
public void Click_On_Sign_Out_3 () { Sign_Out_3.click() ; }
public String Click_On_Role_3 () { String Role_Client = Role_3.getText() ; return Role_Client ; }
public String View_Create_Organization_Text () { String Create_Organization_Text = Create_Organization.getText() ; return Create_Organization_Text ; }
public void Click_On_Organization_Text () { Create_Organization.click() ;  }
public String View_Organization_Arnab_Stage () { String Existing_Organization_Arnab_Stage = Organization_Arnab_Stage.getText() ; return Existing_Organization_Arnab_Stage ; }
public String View_Organization_Imerit_Engine_Serverless () { String Existing_Organization_Imerit_Engine_Serverless = Organization_Imerit_Engine_Serverless.getText() ; return Existing_Organization_Imerit_Engine_Serverless ; }
public String View_Organization_Imerit_Test_Org () { String Existing_Organization_Imerit_Test_Org = Organization_Imerit_Test_Org.getText() ; return Existing_Organization_Imerit_Test_Org ; }
public void Click_On_Sort_By_Name () { Sort_By_Name.click() ; }
public String View_Name () { String Sort_Name = Name.getText() ; return Sort_Name ; }}