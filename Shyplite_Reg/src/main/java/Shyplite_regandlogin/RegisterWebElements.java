package Shyplite_regandlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterWebElements 
{
	public WebDriver dr;
	
	By Rfullname=By.xpath("//input[@id='name']");
	By REmailid=By.xpath("//input[@id='email']");
	By Rpwd=By.xpath("//input[@id='password']");
	By Rcontact=By.xpath("//input[@id='contact']");
	By Register=By.xpath("//div/button[contains(text(),'Register')]");
	
	public RegisterWebElements(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public WebElement getFullName()
	{
		return dr.findElement(Rfullname);
	}
	
	public WebElement getEmailID()
	{
		return dr.findElement(REmailid);
	}
	
	public WebElement getPwd()
	{
		return dr.findElement(Rpwd);
	}
	public WebElement getContact()
	{
		return dr.findElement(Rcontact);
	}
	public WebElement getRegister()
	{
		return dr.findElement(Register);
	}
	
	

}
