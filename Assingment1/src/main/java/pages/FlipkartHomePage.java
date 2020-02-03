package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {
	
	
		public WebDriver driver;
		@FindBy(name="q")
		private WebElement serchbox1;
		@FindBy( xpath="//button[@type='submit']")
		private WebElement serchbtn1;
		
		public WebElement getserchbox()
		{ return  serchbox1;}
		
	@FindBy(xpath="//button[text()='✕']")
	private WebElement popupcancle;
		
		public WebElement getserchbtn()
		{ return  serchbtn1;
		}
		public void cLICKPOPUP()
		{  popupcancle.click();
			
		}
		
		
		public FlipkartHomePage( WebDriver driver)
		{ this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void serchitem(String s)
		{serchbox1.sendKeys(s);
		serchbtn1.click();
			
		}
		
		
		
		public FlipkartSearchPage serchitem1(String s)
		{serchbox1.click();
			serchbox1.sendKeys(s);
		serchbtn1.click();
		return new FlipkartSearchPage(driver)	;
		}

		
		
		
		
		
		
		
		

	}

	
	
	


