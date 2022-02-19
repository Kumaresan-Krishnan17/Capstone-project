package com.qa.BaseLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("./Configurations\\Config.properties");
		prop.load(fis);
	}

	public static void setup() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("edge")) {

			System.setProperty("webdriver.edge.driver", "./Drivers//msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("TestUrl"));

	}

	public void tearDown() {
		driver.close();
		System.out.println("Driver closed");
		// driver.quit();
		System.out.println("Driver quit");
	}
}
