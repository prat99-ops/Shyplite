package Shyplite_regandlogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base 
{
	public Properties prop;
	public WebDriver dr;
	public WebDriver InitializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.println("bname..."+browsername);
		if(browsername.equals("firefox"))
		{
			System.out.println("m in..");
			dr=new FirefoxDriver();
		}
		else if(browsername.equals("Chrome"))
		{
			dr=new ChromeDriver();
			String path=System.getProperty("user.dir");
			String chromepath=path + "\\ChromeDriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
		}
		else if(browsername.equals("IE"))
		{
			dr=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("please select correct browser");
		}
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		return dr;
	}

	
}
