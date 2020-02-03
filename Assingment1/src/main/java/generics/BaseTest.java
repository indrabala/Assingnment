package generics;

	import java.io.IOException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;


	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	import generics.BaseTest;
	import pages.AmazonHomePage;
	import pages.AmazonSearchPage;
	import pages.FlipkartHomePage;
	import pages.FlipkartSearchPage;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

public class BaseTest {
		
		public Generics genlib = new Generics();
		public FlieUtils flib = new  FlieUtils();
		public WebDriver  driver;
           static{
			System.setProperty("webdriver.chrome.driver","./Driver1/ChromeDriver.exe");
		}

		@BeforeMethod
		public void configBC() throws IOException {
			String Browsername = flib.readDataFromPropertiesFile("BROWSER");
			System.out.println("======launch browser============");
			if (Browsername.equals("CHROME")) {
				driver = new ChromeDriver();
				genlib.waitForElementToLoad(driver);
			} else {
				driver = new FirefoxDriver();
				genlib.waitForElementToLoad(driver);}
				
			}
				
				
		@AfterMethod
		public void configAM1()
		{
			driver.close();
		}	
				
	
	
	
	
	

}
