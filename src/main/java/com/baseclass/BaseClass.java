package com.baseclass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		return driver;

	}

	public static void urlLaunch(String url) {

		driver.get(url);

	}

	public static void inputValueOnElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void selectValueFromDropdown(WebElement element, String option, String value) {

		try {

			Select s = new Select(element);

			if (option.equalsIgnoreCase("index")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);

			} else if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);

			} else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void allWindowClose() {

		driver.quit();

	}

	public static void currentWindowClose() {

		driver.close();

	}

	public static void screenshot(String imagename) {
		
		String property = System.getProperty("user.dir");

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File get = ts.getScreenshotAs(OutputType.FILE);

			File con = new File(property+"/Screenshots/"+imagename);

			FileHandler.copy(get, con);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static WebDriverWait explicitWait(int timeDuration) {

		WebDriverWait wait = new WebDriverWait(driver, timeDuration);
		
		return wait;
		
	}

}
