package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrun {

	static int add(int a, int b)
	{
		return a+b;
	}
	static  double add (double c, double d)
	{
		return c+d;
	}
	public static void main (String [] args)
	{
		//System.out.println(add(2,4));
		//System.out.println(add(2.3,4.2));	
    
	Scanner t = new Scanner(System.in);
	int num = t.nextInt();
	
	for (int i=0;i<10;i++)
	{
		System.out.println(num + "*" + (i+1) +"=");
	}
	}
	
	
	
	
	/*
	 * public void disp(char c) { System.out.println(c); } public void disp(char c,
	 * int num) { System.out.println(c + " "+num); }
	 * 
	 * public static void main (String [] args) {
	 * 
	 * 
	 * 
	 * }
	 */

	
		/*
		 * String pagetitle = t.getTitle(); System.out.println(pagetitle);
		 */	
	
		/*
		 * static int integer(int t,int u) { return t+u; } 
		 * public static void  main(String [] args) {
		 * 
		 * 
		 * System.out.println(add(2,3));
		 * 
		 * System.out.println(integer(2,4));
		 * System.out.println(login("esewausername","esewapassword")); }
		 * 
		 * static String login(String username,String password) { return username +
		 * password; }
		 */
	
	// Method overloading
	
	//Compile time and static binding
	
	
	
}

