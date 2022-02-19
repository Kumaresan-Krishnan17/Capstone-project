package com.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseLayer.BaseClass;
import com.qa.PageLayer.DashboardPage;
import com.qa.PageLayer.LoginPage;

public class DashboardTest extends BaseClass {
	public DashboardTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void beforeTest() throws IOException, InterruptedException {
		setup();
		Thread.sleep(500);
	}

	@Test
	public void validateLogin() throws Exception {
		LoginPage login = new LoginPage();
		login.login1();
		DashboardPage dash = new DashboardPage();
		dash.textDisplay();
	}

	@AfterMethod
	public void afterTest() {
		tearDown();
	}
}
