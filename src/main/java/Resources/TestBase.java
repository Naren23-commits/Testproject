package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
// prop= new Properties();
//FileInputStream fis=new FileInputStream("C:\\Users\\dell 5558\\Project\\src\\main\\java\\Resources\\browser");
//
//prop.load(fis);
//String browserName=prop.getProperty("browser");
//
//
//if(browserName.equals("chrome"))
//{
	System.setProperty("webdriver.chrome.driver","chromedriver");
	//return driver= new ChromeDriver();
	ChromeOptions opt = new ChromeOptions();
        opt.setBinary("start-chrome");  
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.google.com/");
	
	
	
}



//return driver;


//}

public void screenshot(String result) throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
	//C://test//"+result+"screenshot.png
}
}
