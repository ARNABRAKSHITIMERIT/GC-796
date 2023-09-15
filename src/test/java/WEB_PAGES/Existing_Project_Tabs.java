package WEB_PAGES ;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory ;

public class Existing_Project_Tabs { WebDriver ldriver ;

public Existing_Project_Tabs(WebDriver rdriver) { ldriver = rdriver ; PageFactory.initElements(rdriver , this) ; }

@FindBy(xpath = "//body/div[@id='__next']/div[3]/div[1]/div[1]/div[2]/a[1]") WebElement Team_Tab_Pending_Invites ;
@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]") WebElement Team_Tab_Filters ;
@FindBy(xpath = "//a[contains(text(),'add member')]") WebElement Team_Tab_Add_Member ;
@FindBy(xpath = "//body/div[@id='__next']/div[3]/div[1]/div[2]/div[1]/div[1]") WebElement Team_Tab_Central_Message ;
@FindBy(xpath = "//body/div[@id='__next']/div[3]/div[1]/div[1]/ul[1]/div[1]/div[1]/div[1]") WebElement Solutions_Tab_Central_Message ;
@FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/button[1]") WebElement Issues_Tab_Filters ;
@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]") WebElement Issues_Tab_Central_Message ;

public String Text_Team_Tab_Pending_Invites() { String caption_team_tab_pending_invites = Team_Tab_Pending_Invites.getText() ; return caption_team_tab_pending_invites ; }
public String Text_Team_Tab_Filters() { String caption_team_tab_pending_filters = Team_Tab_Filters.getText() ; return caption_team_tab_pending_filters ; }
public String Text_Team_Tab_Add_Member() { String caption_team_tab_add_member = Team_Tab_Add_Member.getText() ; return caption_team_tab_add_member ; }
public String Text_Team_Tab_Central_Message() { String caption_team_tab_central_message = Team_Tab_Central_Message.getText() ; return caption_team_tab_central_message ; }
public String Text_Solutions_Tab_Central_Message() { String caption_solutions_tab_central_message = Solutions_Tab_Central_Message.getText() ; return caption_solutions_tab_central_message ; }
public String Text_Issues_Tab_Filters() { String caption_issues_tab_pending_filters = Issues_Tab_Filters.getText() ; return caption_issues_tab_pending_filters ; }
public String Text_Issues_Tab_Central_Message() { String caption_issues_tab_central_message = Issues_Tab_Central_Message.getText() ; return caption_issues_tab_central_message ; }}
