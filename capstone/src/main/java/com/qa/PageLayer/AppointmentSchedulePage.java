package com.qa.PageLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.BaseLayer.BaseClass;

public class AppointmentSchedulePage extends BaseClass {

	public AppointmentSchedulePage() throws IOException {
		super();
	}
	
	public BaseClass appoint() throws Exception {

		WebElement apoint = driver.findElement(By.xpath("//a[@type='button'][5]"));
		apoint.click();
		Thread.sleep(500);
		
		WebElement manageservice = driver.findElement(By.xpath(prop.getProperty("manage_service_path")));
		manageservice.click();
		Thread.sleep(500);
		
		WebElement delete = driver.findElement(By.xpath(prop.getProperty("delete_path")));
		delete.click();
		Thread.sleep(500);
		
		WebElement confirm_no = driver.findElement(By.xpath(prop.getProperty("confirm_no_path")));
		confirm_no.click();
		Thread.sleep(500);
		return new BaseClass();	

	}
}
