package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.TestBase;
import junit.framework.Assert;
import pageobjects.Landingpage;
import pageobjects.Loginpage;
//import resources.base;


public class validateTitle extends TestBase {
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(validateTitle.class.getName());

	@BeforeTest
	
	public void initialize() throws IOException {
		driver=	initializeDriver();
		//WebDriver driver = super.initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Homepage");
	}
		
	
@Test

public void validateApptitle() throws IOException
	{
	
		Landingpage l=new Landingpage(driver);
		String naren=l.getTitle().getText();
		Assert.assertEquals(naren, "FEATURED CO3URSES");
		log.info("Successfully Validated Text message");
		driver.close();
		driver=null;
		
	}

@AfterTest
public void teardown()
{
	
	driver.close();

	
}
	
}




