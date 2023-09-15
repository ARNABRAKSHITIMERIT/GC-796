package TEST_CASES ;

import java.io.File ;
import java.time.Duration ;
import java.io.IOException ;
import UTILITIES.Read_Config ;
import org.testng.annotations.* ;
import org.openqa.selenium.WebDriver ;
import org.apache.commons.io.FileUtils ;
import org.openqa.selenium.OutputType ;
import org.openqa.selenium.edge.EdgeDriver ;
import org.openqa.selenium.TakesScreenshot ;
import org.openqa.selenium.chrome.ChromeDriver ;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager ;

public class Base_Class {
Read_Config read_config = new Read_Config() ;
String URL = 	read_config.Get_Base_URL() ;
String Browser = 	read_config.Get_Browser() ;

public static WebDriver driver ;

@BeforeClass 
public void Set_Up() {
switch(Browser.toLowerCase()) {

case "chrome" :	
WebDriverManager.chromedriver().setup() ;	
driver = new ChromeDriver() ;	
driver.manage().window().maximize() ;
break ;	

case "msedge" :	
WebDriverManager.edgedriver().setup() ;	
driver = new EdgeDriver() ;	
driver.manage().window().maximize() ;
break ;	

default :
driver = null ;
break ; }

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ; }

@AfterClass
public void Tear_Down() {
driver.close() ;
driver.quit() ; }}