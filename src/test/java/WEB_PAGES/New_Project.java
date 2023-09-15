package WEB_PAGES ;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory ;

public class New_Project { WebDriver ldriver ;

public New_Project(WebDriver rdriver) { ldriver = rdriver ; PageFactory.initElements(rdriver , this) ; }

@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[1]/nav[1]/ol[1]/li[1]/div[1]/div[1]/a[1]") WebElement New_Project_Projects ;
@FindBy(xpath = "//span[contains(text(),'create')]") WebElement New_Project_Create ;
@FindBy(xpath = "//h3[contains(text(),'new project')]") WebElement New_Project_New_Project ;
@FindBy(xpath = "//h2[contains(text(),'project details')]") WebElement New_Project_Project_Details ;
@FindBy(xpath = "//input[@id='id_name']") WebElement New_Project_Name ;
@FindBy(xpath = "//body/div[@id='__next']/div[3]/div[1]/form[1]/div[2]/textarea[1]") WebElement New_Project_Description ;
@FindBy(xpath = "//a[contains(text(),'cancel')]") WebElement New_Project_Cancel ;
@FindBy(xpath = "//button[contains(text(),'save')]") WebElement New_Project_Save ;

public boolean View_New_Project_Projects() { boolean presence_new_project_projects = New_Project_Projects.isDisplayed() ; return presence_new_project_projects ; }
public boolean View_New_Project_Create() { boolean presence_new_project_create = New_Project_Create.isDisplayed() ; return presence_new_project_create ; }
public boolean View_New_Project_New_Project() { boolean presence_new_project_new_project = New_Project_New_Project.isDisplayed() ; return presence_new_project_new_project ; }
public boolean View_New_Project_Project_Details() { boolean presence_new_project_project_details = New_Project_Project_Details.isDisplayed() ; return presence_new_project_project_details ; }
public boolean View_New_Project_Name() { boolean presence_new_project_name = New_Project_Name.isEnabled() ; return presence_new_project_name ; }
public boolean View_New_Project_Description() { boolean presence_new_project_description = New_Project_Description.isEnabled() ; return presence_new_project_description ; }
public boolean View_New_Project_Cancel() { boolean presence_new_project_cancel = New_Project_Cancel.isEnabled() ; return presence_new_project_cancel ; }
public boolean View_New_Project_Save() { boolean presence_new_project_save = New_Project_Save.isEnabled() ; return presence_new_project_save ; }

public void Enter_New_Project_Name (String New_Project_Name_Input) { New_Project_Name.sendKeys(New_Project_Name_Input) ;	 }	
public void Enter_New_Project_Description (String New_Project_Description_Input) { New_Project_Description.sendKeys(New_Project_Description_Input) ;	 }
public void Click_On_New_Project_Save () { New_Project_Save.click() ; }




}