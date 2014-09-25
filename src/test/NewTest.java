package test;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import testutils.Helper;

public class NewTest extends Helper {
	
	
  @Test
  public void f() throws FileNotFoundException, IOException {
	  browserType();
	  load();
	  Properties amaz = new Properties();
		amaz.load( new FileInputStream("D:\\sandeep\\sandeep\\Amazonproject\\src\\Config\\amaz.properties"));
		WebElement ele = driver.findElement(By.cssSelector("span.nav-logo-base"));   
		  try
		  {
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  BufferedImage  fullImg = ImageIO.read(screenshot);
		  //Get the location of element on the page
		  org.openqa.selenium.Point point = ele.getLocation();
		  //Get width and height of the element
		  int eleWidth = ele.getSize().getWidth();
		  int eleHeight = ele.getSize().getHeight();
		  //Crop the entire page screenshot to get only element screenshot
		  BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		  ImageIO.write(eleScreenshot, "png", screenshot);
		  //Copy the element screenshot to disk
		  FileUtils.copyFile(screenshot, new File("amazon.png"));
		  }
		  catch(Exception e)
		  {
		   e.printStackTrace();
		  }
		 }
		 @AfterClass
		 public void tear() {
			 driver.manage().deleteAllCookies();
		  driver.close();
		  driver.quit();
		  
		 }
		} 