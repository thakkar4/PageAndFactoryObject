package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.InfotekLoginPage;

public class Login {
	
  @Test
  public void Login () {
	  
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.infotekguide.net/");
	  InfotekLoginPage dr = new InfotekLoginPage(driver);
	  driver.manage().window().maximize();
	  dr.Login().click();
	  dr.email().sendKeys("thakkar4@yahoo.com");
	  dr.password().sendKeys("Hit@8381");
  
 
  }
}
