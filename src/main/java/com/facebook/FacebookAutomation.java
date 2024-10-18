package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {
	  private WebDriver driver;

	  public FacebookAutomation() 
	  {
           driver = new ChromeDriver();
           driver.manage().window().maximize(); 
           driver.get("http://facebook.com");
       
	

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


