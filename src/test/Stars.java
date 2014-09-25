package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testutils.Helper;

public class  Stars extends Helper {
	
		
	  @Test
	  public void f() {
		  browserType();
		  load();
		  driver.manage().window().maximize();
		  List<WebElement> all = driver.findElement( By.className("s9hl")).findElements( By.className("s9Stars"));
		  System.out.println("Size is  " + all.size());
		  if(all.size()==0){
				
				Assert.fail("Elements in  TAB are not loaded or not found");
			
			}else{
				System.out.println("Elements in TAB are loaded or found");
		       // System.out.println(driver.findElement(By.cssSelector( "div.s9Stars.s9Stars_4_5")).getAttribute( "class"));
		        String str = all.get(0).getAttribute( "class");
		        String[] str1 = str.split("s9Stars s9Stars_" ) ;
		        System.out.println("stars before selecting the item  "  +  str1[1].replace( "_", "."));
		        String str2 =  str1[1].replace( "_", ".");
		        driver.findElement( By.linkText( "Seagate Expansion 1TB Portable...")).click();
		        System.out.println( "Stars displayed after selecting the item  "+ "" + driver.findElement( By.id( "acrPopover")).getAttribute( "title"));
		        if (driver.findElement( By.id( "acrPopover")).getAttribute( "title").contains(str2) ) {
		        
		        	System.out.println("pass");
		        } else {
		        	System.out.println("failing th test as the ratings are different");
		        }
	  }
}
}