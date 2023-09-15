package WEB_PAGES;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory ;

public class Existing_Project { WebDriver ldriver ;

public Existing_Project(WebDriver rdriver) { ldriver = rdriver ; PageFactory.initElements(rdriver , this) ; }

@FindBy(xpath = "//a[contains(text(),'projects')]") WebElement Projects ;	
@FindBy(xpath = "//a[contains(text(),'members')]") WebElement Members ;
@FindBy(xpath = "//a[contains(text(),'analytics')]") WebElement Analytics ;
@FindBy(xpath = "//h3[contains(text(),'projects')]") WebElement Projects_Title ;
@FindBy(xpath = "//p[contains(text(),'draft')]") WebElement Draft ;
@FindBy(xpath = "//p[contains(text(),'in progress')]") WebElement In_Progress ;
@FindBy(xpath = "//p[contains(text(),'completed')]") WebElement Completed ;
@FindBy(xpath = "//p[contains(text(),'canceled')]") WebElement Canceled ;
@FindBy(xpath = "//input[@id='search']") WebElement Project_Search ;
@FindBy(xpath = "//button[contains(text(),'create project')]") WebElement Create_Project ;
@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]") WebElement Sort_Dropdown ;
@FindBy(xpath = "//body/div[@id='__next']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[1]/span[1]") WebElement Sort_Dropdown_Name ;
@FindBy(xpath = "//span[contains(text(),'created on')]") WebElement Sort_Dropdown_Created_On ;
@FindBy(xpath = "//span[contains(text(),'ARNAB STAGE')]") WebElement Project_Organization_Arnab_Stage ;
@FindBy(xpath = "//body/div[@id='__next']/div[3]/div[1]/ul[1]/li[4]/a[1]") WebElement Project_Block_Before_Update_27 ;

public boolean View_Projects() { boolean presence_projects = Projects.isDisplayed() ; return presence_projects ; }
public boolean View_Members() { boolean presence_members = Members.isDisplayed() ; return presence_members ; }
public boolean View_Analytics() { boolean presence_analytics = Analytics.isDisplayed() ; return presence_analytics ; }
public boolean View_Projects_Title() { boolean presence_projects_title = Projects_Title.isDisplayed() ; return presence_projects_title ; }
public boolean View_Draft() { boolean presence_draft = Draft.isDisplayed() ; return presence_draft ; }
public boolean View_In_Progress() { boolean presence_in_progress = In_Progress.isDisplayed() ; return presence_in_progress ; }
public boolean View_Completed() { boolean presence_completed = Completed.isDisplayed() ; return presence_completed ; }
public boolean View_Canceled() { boolean presence_canceled = Canceled.isDisplayed() ; return presence_canceled ; }
public boolean View_Project_Search() { boolean presence_project_search = Project_Search.isDisplayed() ; return presence_project_search ; }
public boolean View_Create_Project() { boolean presence_create_project = Create_Project.isDisplayed() ; return presence_create_project ; }
public boolean View_Sort_Dropdown() { boolean presence_sort_dropdown = Sort_Dropdown.isDisplayed() ; return presence_sort_dropdown ; }
public boolean View_Project_Organization_Arnab_Stage() { boolean presence_project_organization_arnab_stage = Project_Organization_Arnab_Stage.isDisplayed() ; return presence_project_organization_arnab_stage ; }
public void Click_On_Sort_Dropdown_Name() { Sort_Dropdown_Name.click() ; }
public void Click_On_Sort_Dropdown_Created_On() { Sort_Dropdown_Created_On.click() ; }
public void Click_On_Project_Block_Before_Update_27() { Project_Block_Before_Update_27.click() ; }
public void Click_On_Create_Project() { Create_Project.click() ; }}
