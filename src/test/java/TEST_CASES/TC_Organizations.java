package TEST_CASES ;

import org.testng.Assert ;
import java.time.Duration ;
import java.io.IOException ;
import java.sql.Timestamp ;
import org.openqa.selenium.By ;
import WEB_PAGES.Login_Page ;
import WEB_PAGES.Home_Page ;
import org.testng.annotations.Test ;
import WEB_PAGES.New_Organization ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.ui.WebDriverWait ;
import org.openqa.selenium.support.ui.ExpectedConditions ;

public class TC_Organizations extends Base_Class {
	
@Test (priority=7  /*enabled = false  */)
public void Test_Case_007_Verify_Create_Organization_Text() throws InterruptedException , IOException {
driver.get(URL) ;
WebDriverWait wait_1 = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Existing_UserName = wait_1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))) ;
Login_Page login_page = new Login_Page(driver) ;
login_page.Enter_Username_Email("arnab.ra@imerit.net") ;
login_page.Enter_Password("E#76FbO1MnCq") ;
login_page.Click_On_Sign_In () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; 	
Home_Page home_page = new Home_Page(driver) ;	
String Create_Organization_Button = home_page.View_Create_Organization_Text() ;
Assert.assertEquals("Create Organization" , Create_Organization_Button) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=8  /*enabled = false  */)
public void Test_Case_008_Verify_Home_Page_Title() throws InterruptedException , IOException {
String Home_Page_Title = driver.getTitle() ;
Assert.assertEquals("Organizations" , Home_Page_Title) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=9 , dependsOnMethods={"Test_Case_007_Verify_Create_Organization_Text"} /*enabled = false , */)
public void Test_Case_009_Verify_New_Organization_Page_Title() throws InterruptedException , IOException {
Home_Page home_page = new Home_Page(driver) ;	
home_page.Click_On_Organization_Text() ;
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement New_Organization_Name_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='organizationName']"))) ;
String New_Organization_Page_Title = driver.getTitle() ;
Assert.assertEquals("New organization" , New_Organization_Page_Title) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=10 , dependsOnMethods={"Test_Case_008_Verify_Home_Page_Title"} /*enabled = false , */)
public void Test_Case_010_Verify_Organization_Arnab_Stage() throws InterruptedException , IOException {
driver.get("https://app.imerit-stage.io/") ;	
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Existing_Organization_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'ARNAB_STAGE')]"))) ;
Home_Page home_page = new Home_Page(driver) ;
String Arnab_Stage_Organization_Name = home_page.View_Organization_Arnab_Stage() ;
Assert.assertEquals("ARNAB_STAGE" , Arnab_Stage_Organization_Name) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=11 , dependsOnMethods={"Test_Case_008_Verify_Home_Page_Title"}  /*enabled = false , */)
public void Test_Case_011_Verify_Organization_Imerit_Engine_Serverless() throws InterruptedException , IOException {
driver.navigate().refresh() ;
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Existing_Organization_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'iMerit Engine Serverless')]"))) ;
Home_Page home_page = new Home_Page(driver) ;
String Imerit_Engine_Serverless_Organization_Name = home_page.View_Organization_Imerit_Engine_Serverless() ;
Assert.assertEquals("iMerit Engine Serverless" , Imerit_Engine_Serverless_Organization_Name) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=12 , dependsOnMethods={"Test_Case_008_Verify_Home_Page_Title"} /*enabled = false , */)
public void Test_Case_012_Verify_Organization_Imerit_Test_Org() throws InterruptedException , IOException {
driver.navigate().refresh();
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Existing_Organization_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'IMERIT_TEST_ORG_2023.05.28-01.47.18')]"))) ;
Home_Page home_page = new Home_Page(driver) ;
String Imerit_Test_Org_Organization_Name = home_page.View_Organization_Imerit_Test_Org() ;
Assert.assertEquals("IMERIT_TEST_ORG_2023.05.28-01.47.18" , Imerit_Test_Org_Organization_Name) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=13 , dependsOnMethods={"Test_Case_009_Verify_New_Organization_Page_Title"} /*enabled = false , */)
public void Test_Case_013_Verify_New_Organization_Page_Web_Elements_1() throws InterruptedException , IOException {
driver.navigate().to("https://app.imerit-stage.io/organizations/create") ;	
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement New_Organization_Name_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='organizationName']"))) ;
New_Organization new_organization = new New_Organization(driver) ;	
boolean is_present_1 = new_organization.View_New_Organization() ;
Assert.assertEquals(true , is_present_1) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=14 , dependsOnMethods={"Test_Case_009_Verify_New_Organization_Page_Title"} /*enabled = false , */)
public void Test_Case_014_Verify_New_Organization_Page_Web_Elements_2() throws InterruptedException , IOException {
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement New_Organization_Name_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='organizationName']"))) ;
New_Organization new_organization = new New_Organization(driver) ;	
boolean is_present_2 = new_organization.View_Organization_Information() ;
Assert.assertEquals(true , is_present_2) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=15 , dependsOnMethods={"Test_Case_009_Verify_New_Organization_Page_Title"} /*enabled = false , */)
public void Test_Case_015_Verify_New_Organization_Page_Web_Elements_3() throws InterruptedException , IOException {
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement New_Organization_Name_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='organizationName']"))) ;
New_Organization new_organization = new New_Organization(driver) ;	
boolean is_present_3 = new_organization.View_Organization_Name() ;
Assert.assertEquals(true , is_present_3) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=16 , dependsOnMethods={"Test_Case_009_Verify_New_Organization_Page_Title"} /*enabled = false , */)
public void Test_Case_016_Verify_New_Organization_Page_Web_Elements_4() throws InterruptedException , IOException {
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement New_Organization_Name_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='organizationName']"))) ;
New_Organization new_organization = new New_Organization(driver) ;	
boolean is_present_4 = new_organization.View_Cancel() ;
Assert.assertEquals(true , is_present_4) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }


@Test (priority=17 , dependsOnMethods={"Test_Case_009_Verify_New_Organization_Page_Title"} /*enabled = false , */)
public void Test_Case_017_Verify_New_Organization_Create() throws InterruptedException , IOException {
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement New_Organization_Name_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='organizationName']"))) ;
New_Organization new_organization = new New_Organization(driver) ;	
Timestamp time_stamp = new Timestamp(System.currentTimeMillis()) ; 
String timestamp_string=time_stamp.toString() ; 
String new_organization_name = ("NEW_ORGANIZATION_TEST" + " " +  timestamp_string) ;
new_organization_name = new_organization_name.replace(":" , "-") ;
new_organization.Enter_New_Organization_Value(new_organization_name) ;
new_organization.Click_On_Create() ;
Thread.sleep(10000) ;
driver.navigate().to("https://app.imerit-stage.io/") ;
WebElement New_Organization_Search_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']"))) ;
new_organization.Enter_Search_Value(new_organization_name) ;
Thread.sleep(10000) ;
int search_count = driver.findElements(By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/div[1]")).size() ;
Assert.assertEquals(1 , search_count) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=18 , dependsOnMethods={"Test_Case_008_Verify_Home_Page_Title"} /*enabled = false , */ )
public void Test_Case_018_Verify_Sort_Organizations() throws InterruptedException , IOException {
driver.get("https://app.imerit-stage.io/");	
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30)) ;
WebElement Organization_Name_Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]"))) ;
Home_Page home_page = new Home_Page(driver) ;
home_page.Click_On_Sort_By_Name () ;
Thread.sleep(5000) ;
String Sort_Organization_Name = home_page.View_Name () ;
Assert.assertEquals("Name" , Sort_Organization_Name) ;
Thread.sleep(3000) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }}