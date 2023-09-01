package UTILITIES;

import java.util.Properties ;
import java.io.FileInputStream ;

public class Read_Config {
Properties Read_Properties ;
String Path_Properties = "C:\\Users\\arnab.ra\\eclipse-workspace\\GC_UI\\CONFIGURATIONS\\CONFIG.PROPERTIES" ;

public Read_Config() {
try {
Read_Properties = new Properties() ;	
FileInputStream file_input_stream = new FileInputStream(Path_Properties) ;	
Read_Properties.load(file_input_stream) ;	}
catch (Exception e)	{
e.printStackTrace(); }}

public String Get_Base_URL () {
String get_base_url_value = Read_Properties.getProperty("Base_URL")	;
if (get_base_url_value != null) 
return get_base_url_value ;
else
throw new RuntimeException ("URL not specified in Config File") ; }
	
public String Get_Browser () {
String get_browser_value = Read_Properties.getProperty("Browser")	;
if (get_browser_value != null) 
return get_browser_value ;
else
throw new RuntimeException ("Browser not specified in Config File") ;	}}







