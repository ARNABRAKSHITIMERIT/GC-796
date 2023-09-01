package TEST_CASES ;

import org.testng.Assert ;
import java.time.Duration ;
import java.io.IOException ;
import WEB_PAGES.Login_Page ;
import WEB_PAGES.Home_Page ;
import org.testng.annotations.Test ;

public class TC_Login_Logout extends Base_Class {
	
@Test	
public void Test_Case_001_Log_In_User_1() throws InterruptedException, IOException {
driver.get(URL) ;
Login_Page login_page = new Login_Page(driver) ;	
login_page.Enter_Username_Email("arnab.ra@imerit.net") ;
login_page.Enter_Password("E#76FbO1MnCq") ;
login_page.Click_On_Sign_In () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test
public void Test_Case_002_Log_Out_User_1() throws InterruptedException, IOException {
Home_Page home_page = new Home_Page(driver) ;	
String Administrator_Role = home_page.Click_On_Role_1() ;
Assert.assertEquals("Administrator" , Administrator_Role) ;
home_page.Click_On_Profile_Name_1 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
home_page.Click_On_Sign_Out_1 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test	
public void Test_Case_003_Log_In_User_2() throws InterruptedException, IOException {
driver.get(URL) ;
Login_Page login_page = new Login_Page(driver) ;	
login_page.Enter_Username_Email("arnabrakshit_test1@imerit.net") ;
login_page.Enter_Password("Abcd@1234") ;
login_page.Click_On_Sign_In () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test
public void Test_Case_004_Log_Out_User_2() throws InterruptedException, IOException {
Home_Page home_page = new Home_Page(driver) ;	
String Project_Manager_Role = home_page.Click_On_Role_2() ;
Assert.assertEquals("Project Manager" , Project_Manager_Role) ;
home_page.Click_On_Profile_Name_2 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
home_page.Click_On_Sign_Out_2 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test	
public void Test_Case_005_Log_In_User_3() throws InterruptedException, IOException {
driver.get(URL) ;
Login_Page login_page = new Login_Page(driver) ;	
login_page.Enter_Username_Email("arnabrakshit_test2@imerit.net") ;
login_page.Enter_Password("Abcd@1234") ;
login_page.Click_On_Sign_In () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test
public void Test_Case_006_Log_Out_User_3() throws InterruptedException, IOException {
Home_Page home_page = new Home_Page(driver) ;	
String Client_Role = home_page.Click_On_Role_3() ;
Assert.assertEquals("Client" , Client_Role) ;
home_page.Click_On_Profile_Name_3 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
home_page.Click_On_Sign_Out_3 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }}