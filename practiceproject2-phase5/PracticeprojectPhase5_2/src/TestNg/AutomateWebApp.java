package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

;


public class AutomateWebApp {
	
	String driverPath="A:\\chromedriver_win32 (1)\\chromedriver.exe";
	public WebDriver wd;
	
	@Test(priority = 1)
	  public void register() {
		
	      System.setProperty("webdriver.chrome.driver", 
	    		  "A:\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("harsha");
	      wd.findElement(By.id("ap_phone_number")).sendKeys("9213456789");
	      wd.findElement(By.id("ap_email")).sendKeys("harsha@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("harsha@123");
	     wd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  
	     System.setProperty("webdriver.chrome.driver", 
	    		 "A:\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("harsha@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("harsha@123");


	  }
	  @Test(priority = 3)
	  public void search() throws InterruptedException {
		  	
		  	System.setProperty("webdriver.chrome.driver", 
		  			"A:\\chromedriver_win32 (1)\\chromedriver.exe");
			  
			  wd = new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung phone");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		   wd.findElement(By.linkText("Samsung Galaxy M33 5G (Emerald Brown, 8GB, 128GB Storage) | 6000mAh Battery | 16GB RAM with RAM Plus | Travel Adapter to be Purchased Separately")).click();
	      
	  }
}
