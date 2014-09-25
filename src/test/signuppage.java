package test;



import java.io.File;
import java.io.IOException;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testutils.Helper;



public class signuppage extends Helper  {
	

	
  @Test
  public void f() throws BiffException, IOException {
	  
	  browserType();
	
	  driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
	  driver.manage().window().maximize();
	  
		
		
		File fi = new File("D:\\amazon.xls");
		Workbook w = Workbook.getWorkbook( fi);
		Sheet sh = w.getSheet( 0);
		int rows = sh.getRows();
	    int columns = sh.getColumns();
	    System.out.println(sh.getColumns());
	    System.out.println(sh.getRows());
	    for(int row = 0;row < rows;row++){
	    	int col = 0;
	    	//driver.get(sh.getCell(col, row).getContents());
	   List<WebElement> a=driver.findElements( By.id( "ap_customer_name"));
	   if(a.size()==0){
			
			Assert.fail("Cannot find key word CUSTOMER NAME");
		
		}else{
			System.out.println("Elements in TAB are loaded or found");
	    driver.findElement( By.id( "ap_customer_name")).sendKeys(sh.getCell(col++, row).getContents());
	    List<WebElement> a1=driver.findElements( By.id( "ap_email"));
		   if(a1.size()==0){
				
				Assert.fail("Cannot find key word email");
			
			}else{
				System.out.println("Elements in TAB are loaded or found");
	   
	    	driver.findElement( By.id( "ap_email")).sendKeys(sh.getCell(col++, row).getContents());
	    	List<WebElement> a2=driver.findElements( By.id( "ap_email_check"));
			   if(a2.size()==0){
					
					Assert.fail("Cannot find key word email");
				
				}else{
					System.out.println("Elements in TAB are loaded or found");
	    	driver.findElement( By.id( "ap_email_check")).sendKeys(sh.getCell(col++, row).getContents());
	    	List<WebElement> a3=driver.findElements( By.id( "ap_phone_number"));
			   if(a3.size()==0){
					
					Assert.fail("Cannot find key word email");
				
				}else{
					System.out.println("Elements in TAB are loaded or found");
	    	
	    	driver.findElement( By.id( "ap_phone_number")).sendKeys(sh.getCell(col++, row).getContents());
	    	List<WebElement> a4=driver.findElements( By.id( "ap_password"));
			   if(a4.size()==0){
					
					Assert.fail("Cannot find key word password");
				
				}else{
					System.out.println("Elements in TAB are loaded or found");
	    	
	    	driver.findElement( By.id( "ap_password")).sendKeys(sh.getCell(col++, row).getContents());
	    	List<WebElement> a5=driver.findElements( By.id( "ap_password_check"));
			   if(a5.size()==0){
					
					Assert.fail("Cannot find key word password");
				
				}else{
					System.out.println("Elements in TAB are loaded or found");
	    	
	    	driver.findElement( By.id( "ap_password_check")).sendKeys(sh.getCell(col++, row).getContents());
	    	
	    	
	    }
  }
}
		}
	    }
  }
}
  }
  @AfterClass
	 public void tear() {
		 driver.manage().deleteAllCookies();
	  driver.close();
	  driver.quit();
}
}
