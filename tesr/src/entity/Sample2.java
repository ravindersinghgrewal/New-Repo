package entity;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sample2 {
		
	public static void main () throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\chromedriver_win32\\chromedriver.exe");
		  
		  // get this URL from Property File
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://esewatst.punjab.gov.in");
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//a[contains(text(),' Official Login')]")).click();
		  driver.findElement(By.id("Username")).sendKeys("dcsmogsp3545");
		  driver.findElement(By.name("Password")).sendKeys("Dgrit@12345");
		   Thread.sleep(4000);
		   driver.findElement(By.id("SignIn")).click(); 
		   driver.findElement(By.xpath("//a[@href='/actor/sent_applications')]")).click();
		 
	}
		 /* WebElement a = driver.findElement(By.id("Username"));
		  a.getAttribute("value");
		  System.out.println(a);*/
		  
			/*
			 * driver.findElement(By.id("Username")).sendKeys("dcsmogsp3545");
			 * driver.findElement(By.name("Password")).sendKeys("Dgrit@12345");
			 * driver.findElement(By.id("SignIn")).click(); //driver.findElement(By.
			 * xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']"
			 * )).sendKeys("9055810"); Thread.sleep(4000);
			 * driver.findElement(By.xpath("//button[contains(text(),'Search')]")).sendKeys(
			 * "9055810"); driver.findElement(By.id("menu1")).click(); Thread.sleep(4000);
			 * 
			 * driver.findElement(By.linkText("VIEW APPLICATION")).click();
			 * Thread.sleep(4000); String a =
			 * driver.findElement(By.name("birth_record_found_status")).getAttribute("value"
			 * ); System.out.println(a);
			 * 
			 */	
	//}
		
	
	 
		 }
		  
	  


	

