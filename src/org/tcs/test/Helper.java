package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper {
   static WebDriver driver;
public static WebDriver LaunchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHAKAR\\eclipse-workspace\\BasePom\\driver\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
		return driver;
}
public static void getUrl(String url) {
	driver.get(url);
}
public static void inPut(WebElement e, String s) {
	e.sendKeys(s);
}
public static void click(WebElement e) {
e.click();
}

public static void GetAttribute(WebElement e) {
	e.getAttribute("value");
	

}

public static void SelectByIndex(WebElement e,int num) {
	    new Select(e).selectByIndex(num);
}
public static void SelectByVisibleText(WebElement e, String name) {
	new Select(e).selectByVisibleText(name);
	
}

public static void SelectByValue(WebElement e, String name) {
	new Select(e).selectByValue(name);
	
}
//right clk
public static void RightClick(WebDriver e, WebElement n) {
	new Actions(e).contextClick(n).perform();
}
//double clk
public static void DoubleClick(WebDriver d,WebElement e) {
	new Actions(d).doubleClick(e);

}

}
