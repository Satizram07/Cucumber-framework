package com.utilitys;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Constants.Constants;

public class Webdriver {
	public static WebDriver driver=null;
public static Logger Log = LogManager.getLogger(Webdriver.class);

	public static void launchbrowser() {

		try {
			switch (Constants.BROWSER) {
			case "chrome":
				driver = new ChromeDriver();
				Log.info(Constants.BROWSER + " driver started");
				break;

			case "firefox":
				driver = new FirefoxDriver();
				Log.info(Constants.BROWSER + " driver started");
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
