package WEB_PAGES;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory ;

public class New_Organization { WebDriver ldriver ;

public New_Organization(WebDriver rdriver) { ldriver = rdriver ; PageFactory.initElements(rdriver , this) ; }

@FindBy(xpath = "//h3[contains(text(),'new organization')]") WebElement New_Organization ;
@FindBy(xpath = "//h2[contains(text(),'Organization information')]") WebElement Organization_Information ;
@FindBy(xpath = "//label[contains(text(),'Organization name')]") WebElement Organization_Name ;
@FindBy(xpath = "//a[contains(text(),'cancel')]") WebElement Cancel ;
@FindBy(xpath = "//input[@id='organizationName']") WebElement New_Organization_Value ;
@FindBy(xpath = "//button[contains(text(),'create')]") WebElement Create ;
@FindBy(xpath = "//input[@id='search']") WebElement Search ;

public boolean View_New_Organization() { boolean presence_1 = New_Organization.isDisplayed() ; return presence_1 ; }
public boolean View_Organization_Information() { boolean presence_2 = Organization_Information.isDisplayed() ; return presence_2 ; }
public boolean View_Organization_Name() { boolean presence_3 = Organization_Name.isDisplayed() ; return presence_3 ; }
public boolean View_Cancel() { boolean presence_4 = Cancel.isDisplayed() ; return presence_4 ; }
public void Enter_New_Organization_Value (String New_Organization_Value_Timestamp) { New_Organization_Value.sendKeys(New_Organization_Value_Timestamp) ;	}
public void Click_On_Create() { Create.click() ; }
public void Enter_Search_Value (String Search_Value_New_Organization) { Search.sendKeys(Search_Value_New_Organization) ;	}}


