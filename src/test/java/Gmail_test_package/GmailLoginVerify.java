package Gmail_test_package;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Gmail_main_package.GmailLogin;

public class GmailLoginVerify {
	GmailLogin g= new GmailLogin();
@BeforeTest
public void test1()
{
	g.invokeBrowser();
}
@Test
public void test2()
{
	g.launchGmail();
}
@Test
public void test3()
{
	g.loginWithValidCredentials();
}
@Test
public void test4() throws InterruptedException
{
	g.composeEmail();
}
@Test 
public void test5()
{
	g.emailReceived();
	Assert.assertEquals("yes", g.emailReceived());
	System.out.println("Assertion Passed");
}
@AfterTest
public void closeWin()
{
	g.closeWindow();
}
}