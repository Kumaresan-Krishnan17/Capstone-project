package com.qa.PageLayer;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.BaseLayer.BaseClass;

public class DashboardPage extends BaseClass {
	public DashboardPage() throws IOException {
		super();
	}

	public BaseClass textDisplay() throws IOException {
		WebElement patient_ID = driver.findElement(By.xpath(prop.getProperty("lable_path")));
		String LabelDisp = patient_ID.getText();
		System.out.println(LabelDisp);
		Assert.assertEquals(prop.getProperty("Label"), LabelDisp);
		return new BaseClass();
	}
}
