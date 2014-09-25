package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import testutils.Helper;



public class  footer extends Helper {
	
	
  @Test
  public void f() {
	  browserType();
	  load();
	  //System.out.println("SANDEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPEEEEEEEEEEEEEEEEEEEEEEEEEE");
	  List<WebElement> container = driver.findElement( By.id( "navFooter")).findElements( By.tagName( "a"));
	  System.out.println(container.size());
	 // sleep(50);
	  if(container.size()==0){
			
			Assert.fail("Cannot find key word password");
		
		}else{
			System.out.println("Elements in TAB are loaded or found");
	  
	  HashMap<String,String> hs = new HashMap<String,String> ();
      
      for (int i=0;i<container.size();i++){
   	   hs.put( container.get( i).getText(), container.get( i).getAttribute( "href"));
   	   
      }
      System.out.println(hs);
      
      Set<String> Keys=hs.keySet();
      for(String Key: Keys)
	   {
		   
		   System.out.println("value of key "+"is"  + hs.get(Key));
		   driver.get(hs.get(Key));
		              
   	   
   	   
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
