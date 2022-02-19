package com.qa.PageLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() throws IOException {
		super();
	}

	public BaseClass login1() throws Exception {
		WebElement username = driver.findElement(By.xpath(prop.getProperty("username_path")));
		WebElement pass = driver.findElement(By.xpath(prop.getProperty("password_path")));
		WebElement ward = driver.findElement(By.xpath(prop.getProperty("ward_path")));
		WebElement loginbtn = driver.findElement(By.xpath(prop.getProperty("login_btn_path")));
		username.sendKeys(prop.getProperty("User_Name"));
		pass.sendKeys(prop.getProperty("Password"));
		ward.click();
		Thread.sleep(2000);
		loginbtn.click();
		Thread.sleep(2000);
		return new BaseClass();
	}

}
