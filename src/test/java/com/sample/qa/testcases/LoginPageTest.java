package com.sample.qa.testcases;

import org.testng.annotations.Test;

import com.sample.qa.base.TestBase;
import com.sample.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	@Test(priority=1)
	public void LoginPageTest() {
		// TODO Auto-generated constructor stub
		loginpage.testLogin();
		
	}
	
	
	

}
