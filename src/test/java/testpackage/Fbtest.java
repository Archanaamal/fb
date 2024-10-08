package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagepackage.Fbpage;
import utilitypackage.Excelutilities;

public class Fbtest {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		Fbpage fb=new Fbpage(driver);
		
		String x1="C:\\Users\\amalj\\OneDrive\\Desktop\\ARCHANA\\pawsindia.xlsx";
		String sheet="sheet1";
		
		int rowcount=Excelutilities.getrowcount(x1,sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String uname=Excelutilities.getvalues(x1,sheet,i,0);
			String pwd=Excelutilities.getvalues(x1, sheet,i, 0);
			fb.login(uname, pwd);
			fb.button();
		}
		
	}

}
