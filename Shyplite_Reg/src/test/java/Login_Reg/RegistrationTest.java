package Login_Reg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Shyplite_regandlogin.Base;
import Shyplite_regandlogin.RegisterWebElements;


public class RegistrationTest extends Base {
	 public WebDriver dr;
  @Test
  public void Register() throws IOException 
  {

	  dr=InitializeDriver();
	  dr.get(prop.getProperty("Registerurl"));
	  dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  
	  //enter full name, email id, password, contact
	  RegisterWebElements R=new RegisterWebElements(dr);
		//R.getFullName().sendKeys("user a");
	  	R.getFullName().sendKeys(prop.getProperty("RFullName"));
		R.getEmailID().sendKeys(prop.getProperty("REmail"));
		R.getPwd().sendKeys(prop.getProperty("Rpwd"));
		R.getContact().sendKeys(prop.getProperty("RCont"));
		
		//click on Register button
		R.getRegister().click();
		System.out.println("user register succesfully");
		dr.close();
		
	
		
		
	  
	  
  }

}
