package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;

public class AmazonSearchPage extends BaseTest{
	public WebDriver driver;
		
		@FindBy( xpath="//span[text()='47,900']/../../../../../../../../../../div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")
		private WebElement price;
		
		
		public WebElement getPrice()
		{ return price;
		}
		
		public  AmazonSearchPage(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
		
		
		public String getPrice1()
		{ return price.getText();
		}
		
		
		

	}



