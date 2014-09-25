package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class  Testbase {
	public static Properties amaz = null;
	public static WebDriver driver;
	FileInputStream fp;
	@BeforeSuite
	public void init() throws IOException {
		fp  = new FileInputStream(System.getProperty( "user.dir") + "\\src\\Config\\amaz.properties");
		amaz = new Properties();
		amaz.load( fp);
		
	}
	
  
}
