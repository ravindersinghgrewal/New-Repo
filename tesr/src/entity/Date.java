package entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	
    
    public static void main(String[] args) throws InterruptedException 
    {
		/*
		 * int day = Calendar.getInstance().get(Calendar.DATE); int month =
		 * Calendar.getInstance().get(Calendar.ALL_STYLES);
		 * 
		 * int year = Calendar.getInstance().get(Calendar.YEAR)-1;
		 * 
		 * System.out.println(day + "/" + month +"/" + year);
		 */
    	 System.setProperty("webdriver.chrome.driver",
				  "D:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new  ChromeDriver();
	  driver.get("http://demo.guru99.com/test/selenium-xpath.html");  
	 
	  Thread.sleep(4000);
	String a= driver.findElement(By.xpath("/html/body/div[2]/div/div/ul[1]")).getText();
	 System.out.println(a);
	 
    	
    	
    	
    }
}
	
