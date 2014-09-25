package test;

import java.util.ArrayList;
import java.util.List;
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

public class  giftcards extends Helper {
	
  @Test
  public void f() {
	  browserType();
	  load();
	  
	  driver.manage().window().maximize();
	  driver.findElement( By.linkText( "Gift Cards")).click();
	  
	  System.out.println(driver.getCurrentUrl());
	  List<WebElement> totalgift1 = driver.findElements( By.xpath( "//*[@id='centerSlots']/div[7]/table"));
	  if(totalgift1.size()==0){
			
			Assert.fail("Test failed because XPATH might have changed. No other key words found to use");
		
		}else{
			System.out.println("Elements in Gift TAB are loaded or found");
	  List<WebElement> totalgift = driver.findElement( By.xpath( "//*[@id='centerSlots']/div[7]/table")).findElements( By.tagName( "a"));
	  System.out.println(totalgift.size());
	  List<String>  gift = new ArrayList<String>();
	  if(totalgift.size()==0){
			
			Assert.fail("Test failed because XPATH moght have changed. No other key words found to use");
		
		}else{
			System.out.println("Elements in Gift TAB are loaded or found");
		
			for(int i=0;i<totalgift.size();i++){
			gift.add(totalgift.get(i).getAttribute("href"));
			//System.out.println(gift);
			
			
		}
			
			
			for(int j=0;j<totalgift.size();j++){
				driver.get(gift.get(j));
				System.out.println(driver.getCurrentUrl());
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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



 