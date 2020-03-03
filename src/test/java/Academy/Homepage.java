package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.TestBase;

import pageobjects.Landingpage;
import pageobjects.Loginpage;


public class Homepage extends TestBase {
	 public static org.apache.logging.log4j.Logger log =LogManager.getLogger(Homepage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver=	initializeDriver();
		log.info("driver is initialized");
		//WebDriver driver = super.initializeDriver();
		
		
	}
	
@Test(dataProvider="getdata")
public void Loginin(String username, String password) throws IOException
	{
	driver.get(prop.getProperty("url"));
	log.info("Navigated to Homepage");
		Landingpage l=new Landingpage(driver);
		l.getLogin().click();
		log.info("Navigated to Loginpage");
		Loginpage lp=new Loginpage(driver);
		lp.getEmail().sendKeys("hello@fs.com");
        lp.getPassword().sendKeys("hello");
        lp.getloggingin().click();
	}


@AfterTest
public void teardown()
{
	
	driver.close();
	log.info("browserclosed");
	driver=null;
	
}
@DataProvider
public Object[][] getdata() {

	Object[][] data=new Object[2][2];
	data[0][0]="restricted@gmail.com";
	data[0][1]="hello";
	data[1][0]="nonrestricted@gmail.com";
	data[1][1]="hello123";
	return data;

	
}


	
}





