package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;

public class AmazonHomePage extends BaseTest{
	
	
	public	WebDriver driver;
		@FindBy(id="twotabsearchtextbox")
		private WebElement serchbox;
		@FindBy( xpath="//input[@value='Go']")
		private WebElement serchbtn;
		
		public WebElement getserchbox()
		{ return  serchbox;}
		
		public WebElement getserchbtn()
		{ return  serchbtn;
		}
		
		
		
		public AmazonHomePage( WebDriver driver)
		{ 
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void serchitem(String s)
		{serchbox.sendKeys(s);
		serchbtn.click();
			
		}
		
		
		
		public AmazonSearchPage serchitem1(String s)
		{serchbox.sendKeys(s);
		serchbtn.click();
		return new AmazonSearchPage(driver)	;
		}

		//public void senttextserchboxclickss1(String pHNNAME) {
			// TODO Auto-generated method stub
			
		}



	
	
	
	
	


