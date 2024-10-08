package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpage {
	WebDriver driver;
	@FindBy(id="email")
	WebElement uname;
	@FindBy(id="pass")
	WebElement pass;
	@FindBy(name="login")
	WebElement button;
	
	public Fbpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user,String pwd)
	{
		uname.sendKeys(user);
		pass.sendKeys(pwd);
	}
	public void button()
	{
		button.click();
	}

}
