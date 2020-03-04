package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.TestBase;
import junit.framework.Assert;
import pageobjects.Landingpage;
import pageobjects.Loginpage;


public class validateNavigationlinks extends TestBase {
	 public static org.apache.logging.log4j.Logger log =LogManager.getLogger(validateNavigationlinks.class.getName());
	@BeforeTest
public void initialize() throws IOException {
		driver=	initializeDriver();
		log.info("driver is initialized");
		//driver.get(prop.getProperty("url"));
		driver.get("http://www.qaclickacademy.com/");
		log.info("Navigated to Homepage");
}
	
	
@Test

public void validateNav() throws IOException

	{
	
		//one is inheritance (extends)
		//creating object to the class and invoke 
		Landingpage l=new Landingpage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navigation Bar successfully displayed");
		driver.close();
	}

@AfterTest
public void teardown()
{
	log.info("browserclosed");
	driver.close();
	driver=null;

	
}
	
}

	





