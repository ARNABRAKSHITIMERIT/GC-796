package TEST_CASES;

import java.util.List ;
import org.testng.Assert ;
import java.time.Duration ;
import java.io.IOException ;
import java.sql.Timestamp ;
import org.openqa.selenium.By ;
import WEB_PAGES.Login_Page ;
import WEB_PAGES.Home_Page ;
import WEB_PAGES.New_Project ;
import org.testng.annotations.Test ;
import WEB_PAGES.Existing_Project ;
import WEB_PAGES.New_Organization ;
import org.openqa.selenium.WebElement ;
import WEB_PAGES.Existing_Project_Tabs ;
import WEB_PAGES.Existing_Project_Details ;
import org.openqa.selenium.JavascriptExecutor ;
import org.openqa.selenium.interactions.Actions ;
import org.openqa.selenium.support.ui.WebDriverWait ;
import org.openqa.selenium.support.ui.ExpectedConditions ;

public class TC_Projects extends Base_Class {

@Test (priority=19)
public void Test_Case_019_Verify_Project_Projects() throws InterruptedException , IOException {
driver.get(URL) ;
WebDriverWait wait_1 = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Existing_UserName = wait_1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))) ;
Login_Page login_page = new Login_Page(driver) ;
login_page.Enter_Username_Email("arnab.ra@imerit.net") ;
login_page.Enter_Password("E#76FbO1MnCq") ;
login_page.Click_On_Sign_In () ;
Thread.sleep(8000) ;		
driver.get("https://app.imerit-stage.io/organizations/555a2d2e-cf1e-46a9-a45a-d2248a9fab08/projects?status=in-progress&ordering=name") ;	
WebDriverWait wait_2 = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Existing_Project_Title = wait_2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'projects')]"))) ;
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_projects = existing_project.View_Projects() ;
Assert.assertEquals(true , is_present_projects) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=20 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_020_Verify_Project_Members() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_members = existing_project.View_Members() ;
Assert.assertEquals(true , is_present_members) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=21 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_021_Verify_Project_Analytics() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_analytics = existing_project.View_Analytics() ;
Assert.assertEquals(true , is_present_analytics) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=22 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_022_Verify_Project_Projects_Title() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_projects_title = existing_project.View_Projects_Title() ;
Assert.assertEquals(true , is_present_projects_title) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=23 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_023_Verify_Project_Draft() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_draft = existing_project.View_Draft() ;
Assert.assertEquals(true , is_present_draft) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=24 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_024_Verify_Project_In_Progress() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_in_progress = existing_project.View_In_Progress() ;
Assert.assertEquals(true , is_present_in_progress) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=25 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_025_Verify_Project_Completed() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_completed = existing_project.View_Completed() ;
Assert.assertEquals(true , is_present_completed) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=26 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_026_Verify_Project_Canceled() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_canceled = existing_project.View_Canceled() ;
Assert.assertEquals(true , is_present_canceled) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=27 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_027_Verify_Project_Search() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_project_search = existing_project.View_Project_Search() ;
Assert.assertEquals(true , is_present_project_search) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=28 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_028_Verify_Create_Project_Button() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_create_project_button = existing_project.View_Create_Project() ;
Assert.assertEquals(true , is_present_create_project_button) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=29 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_029_Verify_Project_Sort_Dropdown() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_sort_dropdown = existing_project.View_Sort_Dropdown() ;
Assert.assertEquals(true , is_present_sort_dropdown) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=30 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_030_Verify_Project_Organization_Arnab_Stage() throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
boolean is_present_project_organization_arnab_stage = existing_project.View_Project_Organization_Arnab_Stage() ;
Assert.assertEquals(true , is_present_project_organization_arnab_stage) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=31 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_031_Verify_Project_Sort_Dropdown_Created_On() throws InterruptedException , IOException {
driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
Thread.sleep(3000);
Existing_Project existing_project = new Existing_Project(driver) ;
existing_project.Click_On_Sort_Dropdown_Created_On();
Thread.sleep(3000);
String project_sort_created_on = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]")).getText();
Thread.sleep(3000);
Assert.assertEquals("Sort By Created On" , project_sort_created_on) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=32 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_032_Verify_Project_Sort_Dropdown_Name() throws InterruptedException , IOException {
driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
Thread.sleep(2000);
Existing_Project existing_project = new Existing_Project(driver) ;
existing_project.Click_On_Sort_Dropdown_Name();
Thread.sleep(2000);
String project_sort_name = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]")).getText();
Thread.sleep(2000);
Assert.assertEquals("Sort By Name" , project_sort_name) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=33 , dependsOnMethods={"Test_Case_019_Verify_Project_Projects"})
public void Test_Case_033_Verify_Project_Block_Before_Update_27 () throws InterruptedException , IOException {
Existing_Project existing_project = new Existing_Project(driver) ;
existing_project.Click_On_Project_Block_Before_Update_27() ;
WebDriverWait wait_3 = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Existing_Project_Title = wait_3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'BEFORE_UPDATE27')]"))) ;
String project_name_before_update_27 = driver.findElement(By.xpath("//h3[contains(text(),'BEFORE_UPDATE27')]")).getText();
Assert.assertEquals("BEFORE_UPDATE27" , project_name_before_update_27) ;
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }


@Test (priority=34 , dependsOnMethods={"Test_Case_033_Verify_Project_Block_Before_Update_27"})
public void Test_Case_034_Verify_Project_Before_Update_27_Page_Title () throws InterruptedException , IOException {
String project_before_update_27_page_title = driver.getTitle() ;
Assert.assertEquals("Analytics" , project_before_update_27_page_title) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=35 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_035_Verify_Project_Details_Projects () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_projects = existing_project_details.Text_Project_Details_Projects() ;
Assert.assertEquals("Projects" , line_project_details_projects) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=36 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_036_Verify_Project_Details_Name_Before_Update_27 () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_name_before_update_27 = existing_project_details.Text_Project_Details_Name_Before_Update_27() ;
Assert.assertEquals("BEFORE_UPDATE27" , line_project_details_name_before_update_27) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=37 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_037_Verify_Project_Details_Status () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_status = existing_project_details.Text_Project_Details_Status() ;
Assert.assertEquals("In Progress" , line_project_details_status) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=38 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_038_Verify_Project_Details_Datasaur () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_datasaur = existing_project_details.Text_Project_Details_Datasaur() ;
Assert.assertEquals("datasaur" , line_project_details_datasaur) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=39 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_039_Verify_Project_Details_Overview_Tab () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_overview_tab = existing_project_details.Text_Project_Details_Overview_Tab() ;
Assert.assertEquals("Overview" , line_project_details_overview_tab) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=40 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_040_Verify_Project_Details_Issues_Tab () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_issues_tab = existing_project_details.Text_Project_Details_Issues_Tab() ;
Assert.assertEquals("Issues" , line_project_details_issues_tab) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=41 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_041_Verify_Project_Details_Solutions_Tab () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_solutions_tab = existing_project_details.Text_Project_Details_Solutions_Tab() ;
Assert.assertEquals("Solutions" , line_project_details_solutions_tab) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=42 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_042_Verify_Project_Details_Team_Tab () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_team_tab = existing_project_details.Text_Project_Details_Team_Tab() ;
Assert.assertEquals("Team" , line_project_details_team_tab) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=43 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_043_Verify_Project_Details_Guidelines_Tab () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_guidelines_tab = existing_project_details.Text_Project_Details_Guidelines_Tab() ;
Assert.assertEquals("Guidelines" , line_project_details_guidelines_tab) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=44 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_044_Verify_Project_Details_Ontology_Tab () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_ontology_tab = existing_project_details.Text_Project_Details_Ontology_Tab() ;
Assert.assertEquals("Ontology" , line_project_details_ontology_tab) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=45 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_045_Verify_Project_Details_Settings_Tab () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_settings_tab = existing_project_details.Text_Project_Details_Settings_Tab() ;
Assert.assertEquals("Settings" , line_project_details_settings_tab) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=46 , dependsOnMethods={"Test_Case_034_Verify_Project_Before_Update_27_Page_Title"})
public void Test_Case_046_Verify_Project_Details_Overview_Message () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
String line_project_details_overview_message = existing_project_details.Text_Project_Details_Overview_Message() ;
Assert.assertEquals("There are currently no dashboards." , line_project_details_overview_message) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=47 , dependsOnMethods={"Test_Case_045_Verify_Project_Details_Settings_Tab"})
public void Test_Case_047_Verify_Project_Details_Field_Updates () throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;	
existing_project_details.Click_On_Project_Details_Settings_Tab() ;
Thread.sleep(3000) ;
Timestamp project_update_timestamp = new Timestamp(System.currentTimeMillis()) ; 
String project_update_timestamp_string=project_update_timestamp.toString() ; 
String project_update_timestamp_reportname = ("Project Description Update" + " " +  project_update_timestamp_string) ;
project_update_timestamp_reportname = project_update_timestamp_reportname.replace(":" , "-") ;
existing_project_details.Enter_Project_Details_Description_Field(project_update_timestamp_reportname) ;
Thread.sleep(2000) ;
existing_project_details.Enter_Project_Details_Platform_Id_Field(project_update_timestamp_string);
Thread.sleep(2000) ;
WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'save changes')]")) ;
JavascriptExecutor executor = (JavascriptExecutor)driver ;
executor.executeScript("arguments[0].click();", ele) ;
Thread.sleep(2000) ;
boolean is_present_project_details_update_notification = existing_project_details . View_Project_Details_Update_Notification_Acknowledgement() ;
Assert.assertEquals(true , is_present_project_details_update_notification) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=48 , dependsOnMethods={"Test_Case_045_Verify_Project_Details_Settings_Tab"})
public void Test_Case_048_Verify_Project_Details_URL_Configuration_Link() throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;
boolean is_enabled_project_details_url_configuration_link = existing_project_details.View_Project_Details_URL_Configuration_Link() ;
Assert.assertEquals(true , is_enabled_project_details_url_configuration_link) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=49 , dependsOnMethods={"Test_Case_045_Verify_Project_Details_Settings_Tab"})
public void Test_Case_049_Verify_Project_Details_Widget_Configuration_Link() throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;
boolean is_enabled_project_details_widget_configuration_link = existing_project_details.View_Project_Details_Widget_Configuration_Link() ;
Assert.assertEquals(true , is_enabled_project_details_widget_configuration_link) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }


@Test (priority=50 , dependsOnMethods={"Test_Case_042_Verify_Project_Details_Team_Tab"})
public void Test_Case_050_Verify_Project_Details_Team_Tab_Title() throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;
existing_project_details.Click_On_Project_Details_Team_Tab() ;
Thread.sleep(3000) ;
String project_details_team_tab_title = driver.getTitle() ;
Assert.assertEquals("Team · BEFORE_UPDATE27" , project_details_team_tab_title) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=51 , dependsOnMethods={"Test_Case_042_Verify_Project_Details_Team_Tab"})
public void Test_Case_051_Verify_Team_Tab_Pending_Invites() throws InterruptedException , IOException {
Existing_Project_Tabs existing_project_tabs = new Existing_Project_Tabs(driver) ;
String text_team_tab_pending_invites = existing_project_tabs.Text_Team_Tab_Pending_Invites() ;
Assert.assertEquals("Pending Invites" , text_team_tab_pending_invites) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=52 , dependsOnMethods={"Test_Case_042_Verify_Project_Details_Team_Tab"})
public void Test_Case_052_Verify_Team_Tab_Filters() throws InterruptedException , IOException {
Existing_Project_Tabs existing_project_tabs = new Existing_Project_Tabs(driver) ;
String text_team_tab_filters = existing_project_tabs.Text_Team_Tab_Filters() ;
Assert.assertEquals("Filters" , text_team_tab_filters) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=53 , dependsOnMethods={"Test_Case_042_Verify_Project_Details_Team_Tab"})
public void Test_Case_053_Verify_Team_Tab_Add_Member() throws InterruptedException , IOException {
Existing_Project_Tabs existing_project_tabs = new Existing_Project_Tabs(driver) ;
String text_team_tab_add_member = existing_project_tabs.Text_Team_Tab_Add_Member() ;
Assert.assertEquals("Add Member" , text_team_tab_add_member) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=54 , dependsOnMethods={"Test_Case_042_Verify_Project_Details_Team_Tab"})
public void Test_Case_054_Verify_Team_Tab_Central_Message() throws InterruptedException , IOException {
Existing_Project_Tabs existing_project_tabs = new Existing_Project_Tabs(driver) ;
String text_team_tab_central_message = existing_project_tabs.Text_Team_Tab_Central_Message() ;
Assert.assertEquals("There are currently no active members." , text_team_tab_central_message) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=55 , dependsOnMethods={"Test_Case_041_Verify_Project_Details_Solutions_Tab"})
public void Test_Case_055_Verify_Project_Details_Solutions_Tab_Title() throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;
existing_project_details.Click_On_Project_Details_Solutions_Tab() ;
Thread.sleep(3000) ;
String project_details_team_tab_title = driver.getTitle() ;
Assert.assertEquals("Solutions · BEFORE_UPDATE27" , project_details_team_tab_title) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=56 , dependsOnMethods={"Test_Case_041_Verify_Project_Details_Solutions_Tab"})
public void Test_Case_056_Verify_Solutions_Tab_Central_Message() throws InterruptedException , IOException {
Existing_Project_Tabs existing_project_tabs = new Existing_Project_Tabs(driver) ;
String text_solutions_tab_central_message = existing_project_tabs.Text_Solutions_Tab_Central_Message() ;
Assert.assertEquals("There are currently no solutions." , text_solutions_tab_central_message) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=57 , dependsOnMethods={"Test_Case_040_Verify_Project_Details_Issues_Tab"})
public void Test_Case_057_Verify_Project_Details_Issues_Tab_Title() throws InterruptedException , IOException {
Existing_Project_Details existing_project_details = new Existing_Project_Details(driver) ;
existing_project_details.Click_On_Project_Details_Issues_Tab() ;
Thread.sleep(3000) ;
String project_details_team_tab_title = driver.getTitle() ;
Assert.assertEquals("Issues · BEFORE_UPDATE27" , project_details_team_tab_title) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=58 , dependsOnMethods={"Test_Case_040_Verify_Project_Details_Issues_Tab"})
public void Test_Case_058_Verify_Issues_Tab_Filters() throws InterruptedException , IOException {
Existing_Project_Tabs existing_project_tabs = new Existing_Project_Tabs(driver) ;
String text_issues_tab_filters = existing_project_tabs.Text_Issues_Tab_Filters() ;
Assert.assertEquals("Filters" , text_issues_tab_filters) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=59 , dependsOnMethods={"Test_Case_040_Verify_Project_Details_Issues_Tab"})
public void Test_Case_059_Verify_Issues_Tab_Central_Message() throws InterruptedException , IOException {
Existing_Project_Tabs existing_project_tabs = new Existing_Project_Tabs(driver) ;
String text_issues_tab_central_message = existing_project_tabs.Text_Issues_Tab_Central_Message() ;
Assert.assertEquals("There are currently no issues." , text_issues_tab_central_message) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=60 , dependsOnMethods={"Test_Case_028_Verify_Create_Project_Button"})
public void Test_Case_060_Verify_New_Project_Projects() throws InterruptedException , IOException {
driver.get("https://app.imerit-stage.io/organizations/555a2d2e-cf1e-46a9-a45a-d2248a9fab08/projects?status=in-progress&ordering=name") ;	
Thread.sleep(3000) ;
Existing_Project existing_project = new Existing_Project(driver) ;
existing_project.Click_On_Create_Project() ;
Thread.sleep(3000) ;
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_projects = new_project.View_New_Project_Projects() ;
Assert.assertEquals(true , is_displayed_new_project_projects) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=61 , dependsOnMethods={"Test_Case_060_Verify_New_Project_Projects"})
public void Test_Case_061_Verify_New_Project_Create() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_create = new_project.View_New_Project_Create() ;
Assert.assertEquals(true , is_displayed_new_project_create) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=62 , dependsOnMethods={"Test_Case_060_Verify_New_Project_Projects"})
public void Test_Case_062_Verify_New_Project_New_Project() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_new_project = new_project.View_New_Project_New_Project() ;
Assert.assertEquals(true , is_displayed_new_project_new_project) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=63 , dependsOnMethods={"Test_Case_060_Verify_New_Project_Projects"})
public void Test_Case_063_Verify_New_Project_Project_Details() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_project_details = new_project.View_New_Project_Project_Details() ;
Assert.assertEquals(true , is_displayed_new_project_project_details) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=64 , dependsOnMethods={"Test_Case_060_Verify_New_Project_Projects"})
public void Test_Case_064_Verify_New_Project_Name() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_name = new_project.View_New_Project_Name() ;
Assert.assertEquals(true , is_displayed_new_project_name) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=65 , dependsOnMethods={"Test_Case_060_Verify_New_Project_Projects"})
public void Test_Case_065_Verify_New_Project_Description() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_description = new_project.View_New_Project_Description() ;
Assert.assertEquals(true , is_displayed_new_project_description) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=66 , dependsOnMethods={"Test_Case_060_Verify_New_Project_Projects"})
public void Test_Case_066_Verify_New_Project_Cancel() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_cancel = new_project.View_New_Project_Cancel() ;
Assert.assertEquals(true , is_displayed_new_project_cancel) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=67 , dependsOnMethods={"Test_Case_060_Verify_New_Project_Projects"})
public void Test_Case_067_Verify_New_Project_Save() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
boolean is_displayed_new_project_save = new_project.View_New_Project_Save() ;
Assert.assertEquals(false , is_displayed_new_project_save) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }


@Test (priority=68 , dependsOnMethods={"Test_Case_064_Verify_New_Project_Name" , "Test_Case_065_Verify_New_Project_Description"}) 
public void Test_Case_068_Verify_Enter_New_Project_Name() throws InterruptedException , IOException {
New_Project new_project = new New_Project(driver) ;
Timestamp project_create_timestamp = new Timestamp(System.currentTimeMillis()) ; 
String project_create_timestamp_string = project_create_timestamp.toString() ; 
String project_create_timestamp_text = ("New Project Create" + " " +  project_create_timestamp_string) ;
project_create_timestamp_text = project_create_timestamp_text.replace(":" , "-") ; 
new_project.Enter_New_Project_Name(project_create_timestamp_text) ;
Thread.sleep(1000) ;
new_project.Enter_New_Project_Description(project_create_timestamp_string) ; 
Thread.sleep(1000) ;
new_project.Click_On_New_Project_Save() ;
Thread.sleep(3000) ;
boolean is_present_new_project_name = driver.findElement(By.xpath("//h3[contains(text(), 'New Project Create')]")).isDisplayed() ;
int no_of_projects = driver.findElements(By.tagName("h3")).size() ;
Assert.assertEquals(true , is_present_new_project_name) ;
Assert.assertEquals(1 , no_of_projects) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }
 
@Test (priority=69)
public void Test_Case_069_All_Organization_Names() throws InterruptedException , IOException {
driver.get("https://app.imerit-stage.io/") ;
Thread.sleep(3000) ;
System.out.println("\n The Organization Names are as follows - \n") ;
List <WebElement> all_organizations = driver.findElements(By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[2]/div[1]/ul[1]/li/a[1]/div[1]/div[1]/div[1]/p[1]")) ;
for (WebElement organization_iterator : all_organizations) {
System.out.println(organization_iterator.getText())	; }
System.out.println(" ") ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=70)
public void Test_Case_070_All_Project_Names_In_Progress_of_Organization_Arnab_Stage() throws InterruptedException , IOException {
driver.get("https://app.imerit-stage.io/organizations/555a2d2e-cf1e-46a9-a45a-d2248a9fab08/projects?status=in-progress&ordering=name") ;
Thread.sleep(3000) ;
System.out.println("\n The Project Names of Organization - Arnab_Stage which are In Progress are as follows - \n") ;
List <WebElement> all_projects = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/ul[1]/li/a[1]/div[1]/div[1]/div[1]/div[1]/p[1]")) ;
for (WebElement project_iterator : all_projects) {
System.out.println(project_iterator.getText())	; }
System.out.println(" ") ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }}
