package Script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseTest;
import pages.AmazonHomePage;
import pages.AmazonSearchPage;
import pages.FlipkartHomePage;
import pages.FlipkartSearchPage;


public class PriceTest extends BaseTest{
	public WebDriver driver;
public String p1;
		public String p2;
		
		@Test
		public void compare() throws Throwable
		{    	String AMAZONURL = flib.readDataFromPropertiesFile("URL1");
		          driver.get(AMAZONURL);
			  genlib.maximize(driver);
			
		 String PHNNAME = flib.read_XL_data("AMAZON",1,2);
		       AmazonHomePage ap=new AmazonHomePage(driver);
		     AmazonSearchPage sb = ap.serchitem1(PHNNAME);
		    //  ap.senttextserchboxclickss1(PHNNAME);
		     //  genlib.waitAndClickElement(sb, driver);
		      // AmazonResultPage resulpage= ap.serchitem1(PHNNAME);
		     //  AmazonResultPage ar=new AmazonResultPage(driver);
		      String pr = sb.getPrice1();
		      System.out.println("price of phone on amazon="+pr);
		              p1=pr;
		          // char[] a = pr.toCharArray();
		           
		      
		      
		      
		      // genlib.waitforElementToBeVisible(pr, driver);
		     // String price = resulpage.getPrice1();
		    // p1 = genlib.convertstrToInt(a);
		   // String g = String.valueOf(p1);
		   //  int h = Integer.parseInt(g);
		   // System.out.println(h);
		}
		
		
		@Test
		public void compare1() throws Throwable
		{ String PHNNAME = flib.read_XL_data("FLIPKART",1,2);
		String FLIPKARTURL = flib.readDataFromPropertiesFile("URL2");
		  driver.get( FLIPKARTURL);
		  genlib.maximize(driver);
	    FlipkartHomePage fp=new FlipkartHomePage(driver);
	      fp.cLICKPOPUP();
	     WebElement sb1 = fp.getserchbox();
	     genlib.waitAndClickElement(sb1, driver);
	    FlipkartSearchPage resulpage= fp.serchitem1(PHNNAME);
	   String price2 = resulpage.getPrice1();
	 // p2 = genlib.convertstrToInt(price2);
	 System.out.println("price of phone on flipkart="+price2);
	       p2=price2;
	 }

		@Test
		public void compare2(String p1 ,String p2)
		{ String  val =p1;
		    val=val.replaceAll("[^a-zA-Z0-9]","");
		  int val1 = Integer.parseInt(val);
		    String val2=p2;
		    val2=val2.replaceAll("[^a-zA-Z0-9]","");
		    int val3=Integer.parseInt(val2);
		if(val1 > val3)
			{ System.out.println("price is high in amazon");
			}
			else
			{
				System.out.println("price is high in flipkart");
			}
		}

		}

		
		
		
		
		
		
		
		
		



	
