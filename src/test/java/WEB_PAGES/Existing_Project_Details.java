package WEB_PAGES ;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory ;

public class Existing_Project_Details { WebDriver ldriver ;

public Existing_Project_Details(WebDriver rdriver) { ldriver = rdriver ; PageFactory.initElements(rdriver , this) ; }

@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/nav[1]/ol[1]/li[1]/div[1]/div[1]/a[1]") WebElement Project_Details_Projects ;
@FindBy(xpath = "//span[contains(text(),'BEFORE_UPDATE27')]") WebElement Project_Details_Name_Before_Update_27 ;
@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]") WebElement Project_Details_Status ;
@FindBy(xpath = "//p[contains(text(),'datasaur')]") WebElement Project_Details_Datasaur ;
@FindBy(xpath = "//p[contains(text(),'overview')]") WebElement Project_Details_Overview_Tab ;
@FindBy(xpath = "//p[contains(text(),'issues')]") WebElement Project_Details_Issues_Tab ;
@FindBy(xpath = "//p[contains(text(),'solutions')]") WebElement Project_Details_Solutions_Tab ;
@FindBy(xpath = "//p[contains(text(),'team')]") WebElement Project_Details_Team_Tab ;
@FindBy(xpath = "//p[contains(text(),'guidelines')]") WebElement Project_Details_Guidelines_Tab ;
@FindBy(xpath = "//p[contains(text(),'ontology')]") WebElement Project_Details_Ontology_Tab ;
@FindBy(xpath = "//p[contains(text(),'settings')]") WebElement Project_Details_Settings_Tab ;
@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/div[1]/h1[1]") WebElement Project_Details_Overview_Message ;
@FindBy(xpath = "//textarea[@id='description']") WebElement Project_Details_Description_Field ;
@FindBy(xpath = "//input[@id='platform_id']") WebElement Project_Details_Platform_Id_Field ;
@FindBy(xpath = "//button[@type='submit']") WebElement Project_Details_Save_Changes_Button ;
@FindBy(xpath = "//p[contains(text(),'Project updated successfully')]") WebElement Project_Details_Update_Notification_Acknowledgement ;
@FindBy(xpath = "//a[contains(text(),'URL Configuration')]") WebElement Project_Details_URL_Configuration_Link ;
@FindBy(xpath = "//a[contains(text(),'Widget Configuration')]") WebElement Project_Details_Widget_Configuration_Link ;

public String Text_Project_Details_Projects() { String caption_project_details_projects = Project_Details_Projects.getText() ; return caption_project_details_projects ; }
public String Text_Project_Details_Name_Before_Update_27() { String caption_project_details_name_before_update_27 = Project_Details_Name_Before_Update_27.getText() ; return caption_project_details_name_before_update_27 ; }
public String Text_Project_Details_Status() { String caption_project_details_status = Project_Details_Status.getText() ; return caption_project_details_status ; }
public String Text_Project_Details_Datasaur() { String caption_project_details_datasaur = Project_Details_Datasaur.getText() ; return caption_project_details_datasaur ; }
public String Text_Project_Details_Overview_Tab() { String caption_project_details_overview_tab = Project_Details_Overview_Tab.getText() ; return caption_project_details_overview_tab ; }
public String Text_Project_Details_Issues_Tab() { String caption_project_details_issues_tab = Project_Details_Issues_Tab.getText() ; return caption_project_details_issues_tab ; }
public String Text_Project_Details_Solutions_Tab() { String caption_project_details_solutions_tab = Project_Details_Solutions_Tab.getText() ; return caption_project_details_solutions_tab ; }
public String Text_Project_Details_Team_Tab() { String caption_project_details_team_tab = Project_Details_Team_Tab.getText() ; return caption_project_details_team_tab ; }
public String Text_Project_Details_Guidelines_Tab() { String caption_project_details_guidelines_tab = Project_Details_Guidelines_Tab.getText() ; return caption_project_details_guidelines_tab ; }
public String Text_Project_Details_Ontology_Tab() { String caption_project_details_ontology_tab = Project_Details_Ontology_Tab.getText() ; return caption_project_details_ontology_tab ; }
public String Text_Project_Details_Settings_Tab() { String caption_project_details_settings_tab = Project_Details_Settings_Tab.getText() ; return caption_project_details_settings_tab ; }
public String Text_Project_Details_Overview_Message() { String caption_project_details_overview_message = Project_Details_Overview_Message.getText() ; return caption_project_details_overview_message ; }
public void Click_On_Project_Details_Settings_Tab() { Project_Details_Settings_Tab.click() ; }
public void Enter_Project_Details_Description_Field(String Description_Input) { Project_Details_Description_Field.clear() ; Project_Details_Description_Field.sendKeys(Description_Input) ;	}
public void Enter_Project_Details_Platform_Id_Field(String Platform_Id_Input) { Project_Details_Platform_Id_Field.clear() ; Project_Details_Platform_Id_Field.sendKeys(Platform_Id_Input) ;	}
public void Click_On_Project_Details_Save_Changes_Button() { Project_Details_Save_Changes_Button.click() ; }
public boolean View_Project_Details_Update_Notification_Acknowledgement() { boolean presence_project_details_update_notification_acknowledgement = Project_Details_Update_Notification_Acknowledgement.isDisplayed() ; return presence_project_details_update_notification_acknowledgement ; }
public boolean View_Project_Details_URL_Configuration_Link() { boolean enabled_project_details_url_configuration_link = Project_Details_URL_Configuration_Link.isEnabled() ; return enabled_project_details_url_configuration_link ; }
public boolean View_Project_Details_Widget_Configuration_Link() { boolean enabled_project_details_widget_configuration_link = Project_Details_Widget_Configuration_Link.isEnabled() ; return enabled_project_details_widget_configuration_link ; }
public void Click_On_Project_Details_Team_Tab() { Project_Details_Team_Tab.click() ; }
public void Click_On_Project_Details_Solutions_Tab() { Project_Details_Solutions_Tab.click() ; }
public void Click_On_Project_Details_Issues_Tab() { Project_Details_Issues_Tab.click() ; }}
