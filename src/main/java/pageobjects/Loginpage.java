package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	
	By Email=By.xpath("//*[@id=\"user_email\"]");
	By password=By.xpath("//*[@id=\"user_password\"]");
    By loggingin=By.xpath("//*[@id=\"new_user\"]/div[3]/input");
	
	
	
	
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getloggingin()
	{
		return driver.findElement(loggingin);
	}
	
	
	
}


