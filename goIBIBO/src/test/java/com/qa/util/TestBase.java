package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.qa.util.TestUtil;

public class TestBase extends TestUtil {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
/*		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\358978\\git\\goIBIBO\\goIBIBO\\"
					+ "src\\test\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (IOException ie) {
			ie.getMessage();
		}*/

	}

	public static void initialization() {
		/*
		 * String browsername = prop.getProperty("browser");
		 * 
		 * 
		 * if (browsername == "chrome") { System.setProperty("webdriver.chrome.driver",
		 * "./chromedriver72/chromedriver.exe"); driver = new ChromeDriver();
		 * 
		 * } else if (browsername == "FF") {
		 * System.setProperty("webdriver.chrome.driver",
		 * "./geckodriver/geckodriver.exe"); driver = new FirefoxDriver(); }
		 */
		System.setProperty("webdriver.chrome.driver","./chromedriver72/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	//	driver.get(prop.getProperty("url"));
		driver.get("https://www.goibibo.com/");

	}
	
	public static void close() {
		driver.close();
		//driver = null;
	}

}
