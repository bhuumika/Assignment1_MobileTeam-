package Gmail_main_package;

import org.openqa.selenium.WebDriver;

public class DriverCalling {
WebDriver driver;
String username,Next,password,Next2,Compose,Expand,Recipient,Subject,Textfield,Send;
public DriverCalling() {
	username= "//input[@id='identifierId']";
	Next = "//div/span/span[@class='RveJvd snByac']";
	password = "//input[@name='password']";
	Next2="//div[@id='passwordNext']/span/span";
	Compose= "//div[contains(text(),'Compose')]";
	Expand= "//img[@id=':67']";
	Recipient="//textarea[@role='combobox']";
	Subject="//input[@aria-label='Subject']";
	Textfield="//div[@aria-label='Message Body'][@role='textbox']";
	Send="//div[contains(text(),'Send')][@role='button']";
	
}
}
