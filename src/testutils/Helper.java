package testutils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import TestBase.Testbase;

public class Helper extends Testbase{
	public void browserType() {
		if(amaz.getProperty("browserType").equalsIgnoreCase("Firefox")) {
		driver= new FirefoxDriver();
		}
		else if(amaz.getProperty("browserType").equalsIgnoreCase("Chrome")) {
			System.setProperty( "webdriver.chrome.driver", System.getProperty("user.dir") + "//src//driver//chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		}
	public void load(){
		driver.get( amaz.getProperty("testUrl"));
	}

}
