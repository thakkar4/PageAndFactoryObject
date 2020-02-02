package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfotekLoginPage {
	
	WebDriver driver;
	
	public InfotekLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By login=By.id("comp-k14iv3u5login");
	By email=By.cssSelector("#memberLoginDialogemailInputinput");
	By password= By.id("memberLoginDialogpasswordInputinput");
	
	public WebElement Login () {
		
		return driver.findElement(login);
	}
	
	public WebElement email () {
		
		return driver.findElement(email);
	}
	
public WebElement password () {
		
		return driver.findElement(password);
	}
	
	

}
