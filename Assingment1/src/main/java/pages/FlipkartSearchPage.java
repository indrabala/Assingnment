package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartSearchPage {
	
	
		
	public	WebDriver driver;

		@FindBy( xpath ="//div[text()='₹53,999']/../../../../div[2]")
		private WebElement price;
		
		public WebElement getPrice()
		{ return price;
		}
		
		public   FlipkartSearchPage(WebDriver driver) 
		{   this.driver= driver;
			PageFactory.initElements(driver, this);
		}
			
		
		
		public String getPrice1()
		{ return price.getText();
		}
		
		
		
		
		
		

	}



