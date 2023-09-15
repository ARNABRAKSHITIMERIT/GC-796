package TEST_CASES ;

import org.testng.Assert ;
import java.time.Duration ;
import java.io.IOException ;
import org.openqa.selenium.By ;
import WEB_PAGES.Login_Page ;
import WEB_PAGES.Home_Page ;
import org.testng.annotations.Test ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.ui.WebDriverWait ;
import org.openqa.selenium.support.ui.ExpectedConditions ;


public class TC_Login_Logout extends Base_Class {
	
@Test (priority=1  /*enabled = false*/)	
public void Test_Case_001_Log_In_Administrator() throws InterruptedException , IOException {
driver.get(URL) ;
Login_Page login_page = new Login_Page(driver) ;	
login_page.Enter_Username_Email("arnab.ra@imerit.net") ;
login_page.Enter_Password("E#76FbO1MnCq") ;
login_page.Click_On_Sign_In () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=2 , dependsOnMethods={"Test_Case_001_Log_In_Administrator"}  /*enabled = false*/)	
public void Test_Case_002_Log_Out_Administrator() throws InterruptedException , IOException {
Home_Page home_page = new Home_Page(driver) ;	
String Administrator_Role = home_page.Click_On_Role_1() ;
Assert.assertEquals("Administrator" , Administrator_Role) ;
home_page.Click_On_Profile_Name_1 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
home_page.Click_On_Sign_Out_1 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=3 /*enabled = false*/)	
public void Test_Case_003_Log_In_Project_Manager() throws InterruptedException , IOException {
driver.get(URL) ;
Login_Page login_page = new Login_Page(driver) ;	
login_page.Enter_Username_Email("arnabrakshit_test1@imerit.net") ;
login_page.Enter_Password("Abcd@1234") ;
login_page.Click_On_Sign_In () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=4 , dependsOnMethods={"Test_Case_003_Log_In_Project_Manager"}  /*enabled = false*/)
public void Test_Case_004_Log_Out_Project_Manager() throws InterruptedException , IOException {
Home_Page home_page = new Home_Page(driver) ;	
String Project_Manager_Role = home_page.Click_On_Role_2() ;
Assert.assertEquals("Project Manager" , Project_Manager_Role) ;
home_page.Click_On_Profile_Name_2 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
home_page.Click_On_Sign_Out_2 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=5  /*enabled = false*/)	
public void Test_Case_005_Log_In_Client() throws InterruptedException , IOException {
driver.get(URL) ;
Login_Page login_page = new Login_Page(driver) ;	
login_page.Enter_Username_Email("arnabrakshit_test2@imerit.net") ;
login_page.Enter_Password("Abcd@1234") ;
login_page.Click_On_Sign_In () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@Test (priority=6 , dependsOnMethods={"Test_Case_005_Log_In_Client"} /*enabled = false*/)
public void Test_Case_006_Log_Out_Client() throws InterruptedException , IOException {
Home_Page home_page = new Home_Page(driver) ;	
String Client_Role = home_page.Click_On_Role_3() ;
Assert.assertEquals("Client" , Client_Role) ;
home_page.Click_On_Profile_Name_3 () ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
home_page.Click_On_Sign_Out_3 () ;
Thread.sleep(3000) ;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }}