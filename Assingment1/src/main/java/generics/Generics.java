package generics;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generics {
	
			public void waitforElementToBeVisible(WebElement element, WebDriver driver) {

				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(element));

			}

			public String getRandomNum() {
				Random rd = new Random();
				return "udhyog" + rd.nextInt(10000);
			}

			public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOf(element));
			}

			public void waitAndClickElement(WebElement element, WebDriver driver) throws InterruptedException {
				int count = 0;
				while (count <= 20)
					try {
						element.click();
						// driver.findElement(By.xpath("By.xpath(//input[@title='Save[Alt+S]']")).click();
						break;
					} catch (Throwable t) {
						Thread.sleep(2000);
						count++;
					}
			}

			public void select(WebElement element, String option) {
				Select sc = new Select(element);
				sc.selectByValue(option);

			}

			public void select(WebElement element, int option) {
				Select sc = new Select(element);
				sc.selectByIndex(option);

			}

			public void waitForElementToLoad(WebDriver driver) {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// driver.manage().window().maximize();
			}

			public void maximize(WebDriver driver) {
				driver.manage().window().maximize();
			}

			public void moveMouseOnElement(WebElement element, WebDriver driver) {
				Actions act = new Actions(driver);
				act.moveToElement(element).perform();
			}

			public void acceptAlert(WebDriver driver) {
				driver.switchTo().alert().accept();
			}

			public void cancleAlert(WebDriver driver) {
				driver.switchTo().alert().dismiss();
			}

			String parentWindowID;
			String childWindowID;

			public void switchToChildWindow(WebDriver driver) {
				Set<String> set = driver.getWindowHandles();
				Iterator<String> it = set.iterator();
				parentWindowID = it.next();
				childWindowID = it.next();
				driver.switchTo().window(childWindowID);
			}
			
			
			public char[] convertstrToInt(char[] a)
			{  //System.out.println(s);
			   // String s1 = s.replace('?',' ');
			 // String s3 = s1.replace(',',' ');
			 // char[] a = s.toCharArray();
			
			   for(int i=0;i<a.length-1;i++)
			   { if((a[i]=='?')||(a[i]==','))
			   {
				 a[i]= a[i+1];
			   }
			  // return a;
			   }
			//String s1 = String.valueOf(a);
			 // return Integer.parseInt(s1);
			return a;
			}

			public void switchToParentWindow(WebDriver driver) {
				driver.switchTo().window(parentWindowID);
			}
			
	

		}
	



