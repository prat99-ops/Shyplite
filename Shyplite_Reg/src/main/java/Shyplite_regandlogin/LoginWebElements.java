package Shyplite_regandlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWebElements 
{
	public WebDriver dr;
	
	By LEmailid=By.xpath("//input[@id='email']");
	By Lpwd=By.xpath("//input[@id='password']");
	By Login=By.xpath("//div/button[contains(text(),'Log')]");
	
	public LoginWebElements(WebDriver dr)
	{
		 this.dr=dr;
	}
	
	public WebElement getLoginEmailId()
	{
		return dr.findElement(LEmailid);
	}
	public WebElement getLoginpwd()
	{
		return dr.findElement(Lpwd);
	}
	public WebElement getLogin()
	{
		return dr.findElement(Login);
	}

}
