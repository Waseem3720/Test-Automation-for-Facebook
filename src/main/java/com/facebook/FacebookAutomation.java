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
           
           
       /*    //  Login
           driver.findElement(By.id("email")).sendKeys("03042021926"); 
           driver.findElement(By.name("pass")).sendKeys("samar2487"); 
           driver.findElement(By.name("login")).click();
           sleep(); // Sleep for 5 seconds
           */
           
           
        /*
           // Create New Account
           driver.findElement(By.linkText("Create new account")).click();
           driver.findElement(By.name("firstname")).sendKeys("waseem"); 
           driver.findElement(By.name("lastname")).sendKeys("hanif"); 
           driver.findElement(By.name("reg_email__")).sendKeys("muhammadiqbal5915910gmail.com");
           driver.findElement(By.name("reg_passwd__")).sendKeys("Password123!"); 

        
           driver.findElement(By.id("day")).sendKeys("15");
           driver.findElement(By.id("month")).sendKeys("Apr");
           driver.findElement(By.id("year")).sendKeys("1990"); 
           driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click(); 
           sleep();
           driver.findElement(By.name("websubmit")).click();  */
         
          
           //  Forget Password
           driver.findElement(By.linkText("Forgotten password?")).click(); 
           driver.findElement(By.cssSelector("input[type='text'")).sendKeys("iqbalali5910.com"); 
           driver.findElement(By.cssSelector("button[value='1'")).click(); 
           sleep();
          

           
           
          
           
           
           
           driver.close();

      }
	
	
	  private void sleep() 
	  {
	        try 
	        {
	            Thread.sleep(2000); 
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


