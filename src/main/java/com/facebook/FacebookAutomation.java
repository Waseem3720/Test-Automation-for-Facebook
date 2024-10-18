package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*; 

public class FacebookAutomation {
	  private WebDriver driver;

	  public FacebookAutomation() 
	  {
           driver = new ChromeDriver();
           driver.manage().window().maximize(); 
           driver.get("https://www.facebook.com/");
           
           
           // 1. Login
           driver.findElement(By.id("email")).sendKeys("waseemhanif@gmail.com"); 
           driver.findElement(By.name("pass")).sendKeys("1234"); 
           driver.findElement(By.name("login")).click();
           sleep(); // Sleep for 5 seconds
     


      }
	
	
	  private void sleep() 
	  {
	        try 
	        {
	            Thread.sleep(5000); 
	        } catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	    }

    public static void main(String[] args) 
    {
        new FacebookAutomation();
    }

}


