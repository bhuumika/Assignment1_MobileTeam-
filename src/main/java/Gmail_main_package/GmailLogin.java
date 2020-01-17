package Gmail_main_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailLogin extends DriverCalling {

public void invokeBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhumikagupta\\eclipse-workspace\\GmailAssignment\\ChromeFolder\\chromedriver_win32 (6)\\chromedriver.exe");
	
	driver= new ChromeDriver();
	
}
public void launchGmail()
{
	driver.get("https://mail.google.com/");
	driver.manage().window().maximize();
}
public void loginWithValidCredentials()
{	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.xpath(super.username)).sendKeys("arunnnsing@gmail.com");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.xpath(super.Next)).click();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.xpath(super.password)).sendKeys("Arun123@");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.xpath(super.Next2)).click();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	System.out.println("1");
	
}
public void composeEmail() throws InterruptedException
{	System.out.println("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath(super.Compose)).click();
	System.out.println("3");
	Thread.sleep(1000);
		/*
		 * driver.findElement(By.xpath(super.Expand)).click(); System.out.println("4");
		 */
	driver.findElement(By.xpath(super.Recipient)).sendKeys("arunnnsing@gmail.com");
	System.out.println("5");
	driver.findElement(By.xpath(super.Subject)).sendKeys("Greetings");
	System.out.println("6");
	driver.findElement(By.xpath(super.Textfield)).sendKeys("Hello, Wish you a great future ahead");
	System.out.println("7");
	driver.findElement(By.xpath(super.Send)).click();
	
}
public String emailReceived()
{String mailReceived="";
	 List<WebElement> unreademeil = driver.findElements(By.xpath("//span[@class='bog']"));
	 String MyMailer = "Greetings";
	 for(int i=0;i<unreademeil.size();i++)
	 {
	        if(unreademeil.get(i).isDisplayed()==true)
	        {
	           
	            if(unreademeil.get(i).getText().equals(MyMailer))
	            {	 mailReceived="yes";
	                System.out.println("Yes we have got mail from " + MyMailer);
	                break;
	            }else
	            	continue;
	            
	        }
	        }
	 return mailReceived;
	 
	 }

public void closeWindow()
{
	driver.quit();
}
}
