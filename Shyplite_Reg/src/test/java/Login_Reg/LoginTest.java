package Login_Reg;

import java.io.IOException;

import org.testng.annotations.Test;

import Shyplite_regandlogin.Base;
import Shyplite_regandlogin.LoginWebElements;

public class LoginTest extends Base{
  @Test
  public void login() throws IOException 
  {
	  System.out.println(" i m in logintest class");
	  dr=InitializeDriver();
	  dr.get(prop.getProperty("LoginUrl"));
	  
	  //enter Valid Email and password
	  LoginWebElements lw=new LoginWebElements (dr);
	  lw.getLoginEmailId().sendKeys(prop.getProperty("REmail"));
	  lw.getLoginpwd().sendKeys(prop.getProperty("Rpwd"));
	  
	  //click on Login button
	  //lw.getLogin().click();
	  
	  
	  System.out.println("user login succesfully");
	  
  }
}
