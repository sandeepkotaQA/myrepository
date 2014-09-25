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

public class Slidingimages extends Helper {
	
  @Test
  public void f() {
	  browserType();
	  load();
	  driver.manage().window().maximize();
	  List<WebElement> container = driver.findElement( By.className( "gwcswSlots")).findElements( By.className("gwcswSlotWrap"));
	  //System.out.println(container.size());
	  if(container.size()==0){
			
			Assert.fail("Elements in  TAB are not loaded or not found");
		
		}else{
			System.out.println("Elements in TAB are loaded or found");
		  
	  for(int i=0;i<container.size();i++){
		  driver.findElement( By.className("gwcswRightArrow")).click();
		 
		  //System.out.println(container.get(i).findElement(By.tagName("div")).getAttribute("style"));
		  if (container.get(i).findElement(By.tagName("div")).getAttribute("style").contains( "display: block")){
			  System.out.println("Loded image title is " + container.get(i).findElement(By.tagName("map")).getAttribute("name"));
			  
		  }else{
			  System.out.println("Some Elements in TAB are not loaded or not found. Because elements are hidden in HTML code");
			  
		  }
		  
		  
	  }
  }
}
}
